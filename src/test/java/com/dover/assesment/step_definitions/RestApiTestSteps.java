package com.dover.assesment.step_definitions;

import com.dover.assesment.pojos.payment.PaymentRequestConstructor;
import com.dover.assesment.pojos.payment.response.PaymentResponse;
import com.dover.assesment.processor.Get_Request_Processor;

import com.dover.assesment.processor.Post_Request_Processor;
import com.dover.assesment.utilities.CommonExcelReader;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParser;
import com.google.gson.JsonElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.junit.Assert;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class RestApiTestSteps {

    private Response response;
    String payload;
    String responseAsString = "{\n" +
            "  \"status\": \"accepted\",\n" +
            "  \"cdtrInf\": {\n" +
            "    \"nm\": \"Emily Williams\",\n" +
            "    \"adr\": {\n" +
            "      \"crty\": \"United States\",\n" +
            "      \"city\": \"New York\",\n" +
            "      \"pstcd\": \"10001\",\n" +
            "      \"bldNb\": \"45\"\n" +
            "    }\n" +
            "  }\n" +
            "}";
    Map<String, String> excelData;

    @Given("the user wants to test test case : {string} by retrieving the test data from Excel Workbook: {string} Sheet: {string} for API")
    public void the_user_gets_test_data(String testCase, String excelWorkbook, String sheet) {
        try {
            excelData = new CommonExcelReader().getDataFromExcel(testCase, excelWorkbook, sheet);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @When("The client calls {string} url")
    public void user_is_on_the_login_page(String url) {
        Post_Request_Processor processor = new Post_Request_Processor();
        response = processor.postRequest(url, payload);

    }

    @Then("Verify http status code {string}")
    public void the_user_should_be_logged_in(String expectedHttpStatuscode) {
        String actualHttpStatuscode = String.valueOf(response.getStatusCode());
        //(String message, Object expected, Object actual) {
        Assert.assertEquals("Http Status code is not correct :\n", expectedHttpStatuscode, actualHttpStatuscode);
    }

    @Then("Check the result")
    public void the_user_checks_Response() {
        response.prettyPrint();
    }

    @And("the user builds payload for payment engine call")
    public void theUserBuildsPayloadForPaymentEngineCall() {
        try {

            PaymentRequestConstructor paymentRequestObj = new PaymentRequestConstructor();
            payload = paymentRequestObj.constructThePayload((HashMap) excelData);

            System.out.println(prettyPrintJson(payload));


        } catch (JsonProcessingException e) {
            e.printStackTrace();
            Assert.fail(e.getMessage());
        }

    }


    @Then("Verify response values")
    public void verifyResponseValues() {

        /*
         {
            "status": "accepted",
            "cdtrInf": {
              "nm": "Emily Williams",
              "crty": "United States",
              "city": "New York",
              "pstcd": "10001",
              "bldNb": "45"
            }
          }
         */

        try {
            ObjectMapper objectMapper = getObjectMapper();

            String xx = responseAsString;

            PaymentResponse paymentResponseObj = objectMapper.readValue(responseAsString, PaymentResponse.class);

            String actualPaymentStatus = paymentResponseObj.getStatus();
            String expectedPaymentStatus = excelData.get("paymentStatus");


            String actualCreditorCountry = paymentResponseObj.getCdtrInf().getAdr().getCrty();
            String expectedCreditorCountry = excelData.get("cdtrInf.adr.crty");


            Assert.assertEquals("Payment Status ", expectedPaymentStatus, actualPaymentStatus);

            Assert.assertEquals("cdtrInf.adr.crty :  ", expectedCreditorCountry, actualCreditorCountry);

        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e.getMessage());
        }
    }

    private ObjectMapper getObjectMapper() {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT, true);
        objectMapper.enable(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT);
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
        return objectMapper;
    }

    public static String prettyPrintJson(String jsonString) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        JsonParser jsonParser = new JsonParser();
        JsonElement jsonElement = jsonParser.parse(jsonString);
        return gson.toJson(jsonElement);
    }
}
