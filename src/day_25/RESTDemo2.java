package day_25;

import org.testng.annotations.BeforeClass;

//import org.testng.annotations.*;
//import io.restassured.RestAssured;
//import io.restassured.http.Method;
//import io.restassured.response.Response;
//import io.restassured.specification.RequestSpecification;
//import org.json.JSONObject;
 
public class RESTDemo2 {
 
  @BeforeClass
  public void setup() {
       RestAssured.baseURI = "https://demoqa.com/BookStore/v1/Books";
  }
 
  @Test
  public void testGetBooks() {
       // Send a GET request
       Response response = RestAssured.given().request(Method.GET, "");
       System.out.println("GET Response => " + response.prettyPrint());
  }
 
  @Test
  public void testPostBook() {
       // Create a JSON request body for POST
       JSONObject requestParams = new JSONObject();
       requestParams.put("title", "New Book");
       requestParams.put("author", "John Doe");
 
       // Send a POST request
       Response response = RestAssured.given()
           .header("Content-Type", "application/json")
           .body(requestParams.toString())
           .request(Method.POST, "");
       System.out.println("POST Response => " + response.prettyPrint());
  }
 
  @Test
  public void testPutBook() {
       // Create a JSON request body for PUT
       JSONObject requestParams = new JSONObject();
       requestParams.put("title", "Updated Book Title");
 
       // Send a PUT request
       Response response = RestAssured.given()
           .header("Content-Type", "application/json")
           .body(requestParams.toString())
           .request(Method.PUT, "");
       System.out.println("PUT Response => " + response.prettyPrint());
  }
 
  @Test
public void testDeleteBook() {
       // Assuming you have an ISBN (unique identifier)
       String isbnToDelete = "9781449325862"; // Replace with an actual ISBN
      
       // Send a DELETE request with the ISBN as a query parameter
       Response response = RestAssured.given()
           .queryParam("ISBN", isbnToDelete)
           .request(Method.DELETE, "");
      
       System.out.println("DELETE Response => " + response.prettyPrint());
  }
 
  @Test
  public void testPatchBook() {
       // Create a JSON request body for PATCH
       JSONObject requestParams = new JSONObject();
       requestParams.put("title", "Patched Book Title");
 
       // Send a PATCH request
       Response response = RestAssured.given()
           .header("Content-Type", "application/json")
           .body(requestParams.toString())
           .request(Method.PATCH, "");
       System.out.println("PATCH Response => " + response.prettyPrint());
  }
}
 
