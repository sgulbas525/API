package com.dover.assesment.utilities;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DBUtils {


    private static final String DB_URL = ConfigurationReader.getProperty("db_URL");
    private static final String DB_USER =  ConfigurationReader.getProperty("db_username");
    private static final String DB_PASSWORD = ConfigurationReader.getProperty("db_password");


    /**
     * Connects to a PostgreSQL database using the provided URL, username, and password.
     *
     * @param dbURL    The URL of the database.
     * @param username The username for the database.
     * @param password The password for the database.
     * @return A Connection object representing the database connection.
     * @throws SQLException If there is an error connecting to the database.
     */
    public static Connection connect(String dbURL, String username, String password) throws SQLException {
        return DriverManager.getConnection(dbURL, username, password);
    }

    /**
     * Executes a SQL query on the provided Connection object and returns the result set.
     *
     * @param connection The Connection object representing the database connection.
     * @param query      The SQL query to execute.
     * @return A ResultSet object representing the result set of the SQL query.
     * @throws SQLException If there is an error executing the SQL query.
     */
    public static ResultSet executeQuery(Connection connection, String query) throws SQLException {
        Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        return statement.executeQuery(query);
    }


    public List<Map<String, Object>> executeQuery(String query) throws SQLException {
        List<Map<String, Object>> result = new ArrayList<>();

        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             PreparedStatement statement = connection.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {
            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();
            while (resultSet.next()) {
                Map<String, Object> row = new HashMap<>();
                for (int i = 1; i <= columnCount; i++) {
                    String columnName = metaData.getColumnName(i);
                    Object columnValue = resultSet.getObject(i);
                    row.put(columnName, columnValue);
                }
                result.add(row);
            }
        }
        return result;
    }



}
