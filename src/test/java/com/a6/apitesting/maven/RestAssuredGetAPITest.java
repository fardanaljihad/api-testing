package com.a6.apitesting.maven;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAssuredGetAPITest {

    //Melakukan Automated Test pada GET API di TC01 (App-id nya kosong)
    @Test
    public void GetUserWithNoAppId() {
        // Specify the base URL to the RESTful web service
        RestAssured.baseURI = "https://dummyapi.io/data/v1/";
        // Get the RequestSpecification of the request to be sent to the server
        RequestSpecification httpRequest = RestAssured.given();
        // Set the request header with an empty app-id (which should trigger the error)
        httpRequest.header("app-id", "");
        // Set the content type of the request (JSON)
        httpRequest.contentType(ContentType.JSON);

        // Specify the user ID to retrieve
        String userId = "60d0fe4f5311236168a109da";

        // Send GET request to retrieve user information by ID
        Response response = httpRequest.request(Method.GET, "/user/" + userId);

        // Print the status and response body of the API
        System.out.println("Status received => " + response.getStatusLine());
        System.out.println("Response => " + response.prettyPrint());

        // Assert that the response status code
        assertEquals("Unexpected status code", 403, response.getStatusCode());
        
        // Assert that the response body contains the expected error message
        String responseBody = response.getBody().asString();
        assertTrue("Response body does not contain expected error message", responseBody.contains("APP_ID_MISSING"));
    }

    //Melakukan Automated Test pada GET API di TC02 (Invalid App-id)
    @Test
    public void GetUserWithAppIdInvalid() {
        // Specify the base URL to the RESTful web service
        RestAssured.baseURI = "https://dummyapi.io/data/v1/";
        // Get the RequestSpecification of the request to be sent to the server
        RequestSpecification httpRequest = RestAssured.given();
        // Set the request header with an empty app-id (which should trigger the error)
        httpRequest.header("app-id", "123");
        // Set the content type of the request (JSON)
        httpRequest.contentType(ContentType.JSON);

        // Specify the user ID to retrieve
        String userId = "60d0fe4f5311236168a109da";

        // Send GET request to retrieve user information by ID
        Response response = httpRequest.request(Method.GET, "/user/" + userId);

        // Print the status and response body of the API
        System.out.println("Status received => " + response.getStatusLine());
        System.out.println("Response => " + response.prettyPrint());

        // Assert that the response status code 
        assertEquals("Unexpected status code", 403, response.getStatusCode());
        
        // Assert that the response body contains the expected error message
        String responseBody = response.getBody().asString();
        assertTrue("Response body does not contain expected error message", responseBody.contains("APP_ID_NOT_EXIST"));
    }

    //Melakukan Automated Test pada GET API di TC03 (App-id dan user-id nya valid)
    @Test
    public void GetUserWithAppIdAndUserIdValid() {
        // Specify the base URL to the RESTful web service
        RestAssured.baseURI = "https://dummyapi.io/data/v1/";
        // Get the RequestSpecification of the request to be sent to the server
        RequestSpecification httpRequest = RestAssured.given();
        // Set the request header with the required app-id
        httpRequest.header("app-id", "662df8c5f5990149c8e2e566");
        // Set the content type of the request (JSON)
        httpRequest.contentType(ContentType.JSON);

        // Specify the user ID to retrieve
        String userId = "60d0fe4f5311236168a109da";

        // Send GET request to retrieve user information by ID
        Response response = httpRequest.request(Method.GET, "/user/" + userId);

        // Print the status and response body of the API
        System.out.println("Status received => " + response.getStatusLine());
        System.out.println("Response => " + response.prettyPrint());

        // Assert that the response status code 
        assertEquals("Unexpected status code", 200, response.getStatusCode());

    }

    //Melakukan Automated Test pada GET API di TC04 (App-id valid tetapi user-id nya tidak terdaftar pada DB)
    @Test
    public void GetUserWithUserIdNotExist() {
        // Specify the base URL to the RESTful web service
        RestAssured.baseURI = "https://dummyapi.io/data/v1/";
        // Get the RequestSpecification of the request to be sent to the server
        RequestSpecification httpRequest = RestAssured.given();
        // Set the request header with the required app-id
        httpRequest.header("app-id", "662df8c5f5990149c8e2e566");
        // Set the content type of the request (JSON)
        httpRequest.contentType(ContentType.JSON);

        // Specify the user ID to retrieve
        String userId = "61d0fe4f5311236168a109da";

        // Send GET request to retrieve user information by ID
        Response response = httpRequest.request(Method.GET, "/user/" + userId);

        // Print the status and response body of the API
        System.out.println("Status received => " + response.getStatusLine());
        System.out.println("Response => " + response.prettyPrint());

        // Assert that the response status code 
        assertEquals("Unexpected status code", 404, response.getStatusCode());

        // Assert that the response body contains the expected error message
        String responseBody = response.getBody().asString();
        assertTrue("Response body does not contain expected error message", responseBody.contains("RESOURCE_NOT_FOUND"));
    }

    //Melakukan Automated Test pada GET API di TC05 (App-id valid tetapi user-id nya tidak valid)
    @Test
    public void GetUserWithUserIdInvalid() {
        // Specify the base URL to the RESTful web service
        RestAssured.baseURI = "https://dummyapi.io/data/v1/";
        // Get the RequestSpecification of the request to be sent to the server
        RequestSpecification httpRequest = RestAssured.given();
        // Set the request header with the required app-id
        httpRequest.header("app-id", "662df8c5f5990149c8e2e566");
        // Set the content type of the request (JSON)
        httpRequest.contentType(ContentType.JSON);

        // Specify the user ID to retrieve
        String userId = "60d0fe4f5311236168a109daa";

        // Send GET request to retrieve user information by ID
        Response response = httpRequest.request(Method.GET, "/user/" + userId);

        // Print the status and response body of the API
        System.out.println("Status received => " + response.getStatusLine());
        System.out.println("Response => " + response.prettyPrint());

        // Assert that the response status code 
        assertEquals("Unexpected status code", 400, response.getStatusCode());

        // Assert that the response body contains the expected error message
        String responseBody = response.getBody().asString();
        assertTrue("Response body does not contain expected error message", responseBody.contains("PARAMS_NOT_VALID"));
    }
}
