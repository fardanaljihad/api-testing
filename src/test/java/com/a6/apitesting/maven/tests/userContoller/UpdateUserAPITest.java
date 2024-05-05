package com.a6.apitesting.maven.tests.userContoller;

import com.a6.apitesting.maven.config.APIConfig;
import com.a6.apitesting.maven.utils.TestUtilities;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.hamcrest.Matchers.equalTo;

import java.io.IOException;

import org.junit.Test;

public class UpdateUserAPITest {

  private static final String USER_ID = "662e6ac81846fb03a2d55040";
  
  // Test case to update user with the user ID parameter empty. TC04
  @Test
  public void testUpdateUserWithEmptyUserIdParameter() throws IOException{
    String filePath = "src/test/resources/testdata/userUpdateDataTC01-Data.json";
    String jsonBody = TestUtilities.loadJsonFromFile(filePath);
    Response response = RestAssured.given()
                                    .spec(APIConfig.getDefaultRequestSpecification())
                                    .body(jsonBody)
                                    .put("/user/");
    // Now validate the response
    response.then()
            .assertThat()
            .statusCode(404)
            .body("error", equalTo("PATH_NOT_FOUND"));

    // Print the status and message body of the response received from the server
    System.out.println("Status received => " + response.getStatusLine());
    System.out.println("Response body =>" + response.prettyPrint());
  }

  // Test case to update firstName. TC07
  @Test
  public void testUpdateUserWithValidUserIdAndLongFirstname() throws IOException{
    String filePath = "src/test/resources/testdata/userUpdateDataTC02-Data.json";
    String jsonBody = TestUtilities.loadJsonFromFile(filePath);
    Response response = RestAssured.given()
                                    .spec(APIConfig.getDefaultRequestSpecification())
                                    .body(jsonBody)
                                    .put("/user/" + USER_ID);
    // Now validate the response
    response.then()
            .assertThat()
            .statusCode(200)
            .body(matchesJsonSchemaInClasspath("testdata/userUpdateData-Schema.json"));

    // Print the status and message body of the response received from the server
    System.out.println("Status received => " + response.getStatusLine());
    System.out.println("Response body =>" + response.prettyPrint());
  }

  // Test case to update lastName. TC09
  @Test
  public void testUpdateUserWithValidUserIdAndLongLastname() throws IOException{
    String filePath = "src/test/resources/testdata/userUpdateDataTC03-Data.json";
    String jsonBody = TestUtilities.loadJsonFromFile(filePath);
    Response response = RestAssured.given()
                                    .spec(APIConfig.getDefaultRequestSpecification())
                                    .body(jsonBody)
                                    .put("/user/" + USER_ID);
    // Now validate the response
    response.then()
            .assertThat()
            .statusCode(200)
            .body(matchesJsonSchemaInClasspath("testdata/userUpdateData-Schema.json"));

    // Print the status and message body of the response received from the server
    System.out.println("Status received => " + response.getStatusLine());
    System.out.println("Response body =>" + response.prettyPrint());
  }
}
