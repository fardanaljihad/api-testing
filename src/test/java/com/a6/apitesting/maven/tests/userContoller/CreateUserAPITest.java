package com.a6.apitesting.maven.tests.userContoller;

import com.a6.apitesting.maven.config.APIConfig;
import com.a6.apitesting.maven.utils.TestUtilities;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

import java.io.IOException;

import org.junit.Test;


public class CreateUserAPITest {

    // Test case to create a new user with valid field
    @Test
    public void testCreateUserWithValidField() throws IOException{
        String filePath = "src/test/resources/testdata/userCreationDataTC01-Data.json";
        String jsonBody = TestUtilities.loadJsonFromFile(filePath);
        Response response = RestAssured.given()
                                       .spec(APIConfig.getDefaultRequestSpecification())
                                       .body(jsonBody)
                                       .post("/user/create");
        // Now validate the response
        response.then()
                .assertThat()
                .statusCode(200)
                .body(matchesJsonSchemaInClasspath("testdata/userCreationData-Schema1.json"));

        // Print the status and message body of the response received from the server
        System.out.println("Status received => " + response.getStatusLine());
        System.out.println("Response=>" + response.prettyPrint());
    }

    // Test case to create a new user with empty field
    @Test
    public void testCreateUserWithEmptyField() throws IOException{
        String filePath = "src/test/resources/testdata/userCreationDataTC02-Data.json";
        String jsonBody = TestUtilities.loadJsonFromFile(filePath);
        Response response = RestAssured.given()
                                       .spec(APIConfig.getDefaultRequestSpecification())
                                       .body(jsonBody)
                                       .post("/user/create");
        response.then()
                .assertThat()
                .statusCode(400)
                .body(matchesJsonSchemaInClasspath("testdata/userCreationData-Schema1.json"));

        System.out.println("Status received => " + response.getStatusLine());
        System.out.println("Response=>" + response.prettyPrint());
    }

    // Test case to create a new user with existing email
    @Test
    public void testCreateUserWithExitingEmail() throws IOException{
        String filePath = "src/test/resources/testdata/userCreationDataTC03-Data.json";
        String jsonBody = TestUtilities.loadJsonFromFile(filePath);
        Response response = RestAssured.given()
                                       .spec(APIConfig.getDefaultRequestSpecification())
                                       .body(jsonBody)
                                       .post("/user/create");
        // Now validate the response
        response.then()
                .assertThat()
                .statusCode(400)
                .body(matchesJsonSchemaInClasspath("testdata/userCreationData-Schema1.json"));

        // Print the status and message body of the response received from the server
        System.out.println("Status received => " + response.getStatusLine());
        System.out.println("Response=>" + response.prettyPrint());
    }

    // Test case to create a new user with empty firstname
    @Test
    public void testCreateUserWithEmptyFirstname() throws IOException{
        String filePath = "src/test/resources/testdata/userCreationDataTC04-Data.json";
        String jsonBody = TestUtilities.loadJsonFromFile(filePath);
        Response response = RestAssured.given()
                                       .spec(APIConfig.getDefaultRequestSpecification())
                                       .body(jsonBody)
                                       .post("/user/create");
        response.then()
                .assertThat()
                .statusCode(400)
                .body(matchesJsonSchemaInClasspath("testdata/userCreationData-Schema1.json"));

        System.out.println("Status received => " + response.getStatusLine());
        System.out.println("Response=>" + response.prettyPrint());
    }

    // Test case to create a new user with empty lastname
    @Test
    public void testCreateUserWithEmptyLastname() throws IOException{
        String filePath = "src/test/resources/testdata/userCreationDataTC05-Data.json";
        String jsonBody = TestUtilities.loadJsonFromFile(filePath);
        Response response = RestAssured.given()
                                       .spec(APIConfig.getDefaultRequestSpecification())
                                       .body(jsonBody)
                                       .post("/user/create");
        response.then()
                .assertThat()
                .statusCode(400)
                .body(matchesJsonSchemaInClasspath("testdata/userCreationData-Schema1.json"));

        System.out.println("Status received => " + response.getStatusLine());
        System.out.println("Response=>" + response.prettyPrint());
    }
}
