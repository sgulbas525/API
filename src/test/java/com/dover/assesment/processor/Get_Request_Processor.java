package com.dover.assesment.processor;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.HashMap;


public class Get_Request_Processor {
    public static Response response;

    public Response getRequest(String url) {
        RestAssured.baseURI = url;

        // make GET request
        response = RestAssured.given()
                .contentType(ContentType.JSON)
                .get(url);

             return response;
    }

}







































