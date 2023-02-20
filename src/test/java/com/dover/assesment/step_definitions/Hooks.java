package com.dover.assesment.step_definitions;

import com.dover.assesment.utilities.ConfigurationReader;
import com.dover.assesment.utilities.DBUtils;
import com.dover.assesment.utilities.Driver;
import io.cucumber.java.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.sql.SQLException;

public class Hooks {
    @Before
    public void setup(Scenario scenario) {
        System.out.println(":::: Starting test automation ::::");
        System.out.println("Browser type :: " + ConfigurationReader.getProperty("browser"));
        System.out.println("Environment :: " + ConfigurationReader.getProperty("url"));
        System.out.println("Test scenario :: " + scenario.getName());
        Driver.getDriver().manage().window().maximize();
    }

    @Before("@db")
    public void setupDbConnection(Scenario scenario) {
//        String dbURL, String username, String password
        try {
            DBUtils.connect(ConfigurationReader.getProperty("dbURL"),ConfigurationReader.getProperty("username"),ConfigurationReader.getProperty("password"));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    @After("@db")
    public void tearDownDbConnection(Scenario scenario) {
        System.out.println(":::: Starting test automation ::::");
        System.out.println("Browser type :: " + ConfigurationReader.getProperty("browser"));
        System.out.println("Environment :: " + ConfigurationReader.getProperty("url"));
        System.out.println("Test scenario :: " + scenario.getName());
        Driver.getDriver().manage().window().maximize();
    }


    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            TakesScreenshot takesScreenshot = (TakesScreenshot) Driver.getDriver();
            byte[] image = takesScreenshot.getScreenshotAs(OutputType.BYTES);
            scenario.attach(image, "image/png", scenario.getName());
        }
        Driver.closeDriver();
    }
}
