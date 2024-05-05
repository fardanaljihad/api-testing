package com.a6.apitesting.maven.config;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.http.ContentType;

public class APIConfig {
    private static final String BASE_URI = "https://dummyapi.io/data/v1/";
    private static final String API_KEY = "662df8c5f5990149c8e2e566";

    static {
        // Setting the baseURI globally for RestAssured
        RestAssured.baseURI = BASE_URI;
    }

    public static RequestSpecification getDefaultRequestSpecification() {
        return new RequestSpecBuilder()
                .addHeader("app-id", API_KEY)
                .setContentType(ContentType.JSON)
                .build();
    }
}
