package kelompok.a6.maven;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAssuredAPITest {
  
  @Test
  public void CreateUser() {
    // Specify the base URL to the RESTful web service 
    RestAssured.baseURI = "https://dummyapi.io/data/v1/"; 
    // Get the RequestSpecification of the request to be sent to the server. 
    RequestSpecification httpRequest = RestAssured.given().header("app-id", "662c780dc102e9ec916fdfdf");
    // Set the content type of the request body
    httpRequest.contentType(ContentType.JSON);
    // Define the request body (JSON format)
    String requestBody = "{\"firstName\": \"John\", \"lastName\": \"Doe\", \"email\": \"johndoe100@example.com\"}";
    // Set the request body
    httpRequest.body(requestBody);
    // specify the method type and the parameters if any. 
    //In this case the request does not take any parameters 
    Response response = httpRequest.request(Method.POST, "/user/create");
    // Print the status and message body of the response received from the server 
    System.out.println("Status received => " + response.getStatusLine()); 
    System.out.println("Response=>" + response.prettyPrint());
  }
}
