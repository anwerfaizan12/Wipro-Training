package day_25;

package day_25;

import org.testng.Assert; //used to validate response status  
import org.testng.annotations.Test; 
import io.restassured.RestAssured; 
import io.restassured.response.Response; 
import io.restassured.specification.RequestSpecification; 
public class RestAssuredTestResponse2 { 
  
 @Test 
 public void GetPetDetails() 
 {  
 // Specify the base URL to the RESTful web service 
 RestAssured.baseURI = "https://demoqa.com/BookStore/v1/Books"; 
 
 RequestSpecification httpRequest = RestAssured.given();

 // Get the RequestSpecification of the request to be sent to the server  RequestSpecification httpRequest = RestAssured.given(); 
 Response response = httpRequest.get(); 
 // Get the status code of the request.  
 //If request is successful, status code will be 200 
 int statusCode = response.getStatusCode(); 
 // Assert that correct status code is returned. 
 Assert.assertEquals(statusCode, 200 ,   "Correct status code returned"); 
 } 
} 
