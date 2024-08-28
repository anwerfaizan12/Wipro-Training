package day_25;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Prg2 {

	@Test
	public void ValidateBookHeaders() 
	{  
	RestAssured.baseURI = "https://demoqa.com/BookStore/v1/Books"; 
	RequestSpecification httpRequest = RestAssured.given(); 
	Response response = httpRequest.get(""); 
	// Access header with a given name. Header = Content-Type  
	String contentType = response.header("Content-Type");  
	Assert.assertEquals(contentType /* actual value */, "application/json; charset=utf-8" /* expected  value */);  
	// Access header with a given name. Header = Server  
	String serverType = response.header("Server");  
	Assert.assertEquals(serverType /* actual value */, "nginx/1.17.10 (Ubuntu)" /* expected value */); 

}
}

