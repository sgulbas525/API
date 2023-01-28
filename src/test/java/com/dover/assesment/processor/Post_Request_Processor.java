package com.dover.assesment.processor;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.HashMap;


public class Post_Request_Processor {
    public static Response response;

    public Response postRequest(String url, String requestBody) {
        RestAssured.baseURI = url;

        // create JSON payload
        String payload = requestBody;

        // make POST request
        response = RestAssured.given()
                .contentType(ContentType.JSON)
                .body(payload)
                .post("/posts");
        return response;
    }

}
