package day_25;

import org.testng.Assert; //used to validate response status  
import org.testng.annotations.Test;
import io.restassured.RestAssured; 
import io.restassured.response.Response; 
import io.restassured.specification.RequestSpecification; 

public class RestAssuredTestResponseWithId { 
 @Test 
 public void GetBookDetails() 
 {  
 // Specify the base URL to the RESTful web service 
 RestAssured.baseURI = "https://demoqa.com/BookStore/v1/Books";  // Get the RequestSpecification of the request to be sent to the server  RequestSpecification httpRequest = RestAssured.given(); 
 RequestSpecification httpRequest = RestAssured.given();
 httpRequest.queryParam("isbn","9781449325862");
 Response response = httpRequest.get(""); 
 // Get the status code of the request.  
 //If request is successful, status code will be 200 
 int statusCode = response.getStatusCode(); 
 // Assert that correct status code is returned. 
 Assert.assertEquals(statusCode /*actual value*/, 200 /*expected value*/,   "Correct status code returned"); 
 } 
} 
