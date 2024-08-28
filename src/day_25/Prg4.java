package day_25;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class Prg4 {

	@Test 
	public void WeatherMessageBody() 
	{ 
	RestAssured.baseURI = "https://restapi.demoqa.com/utilities/weather/city";
RequestSpecification httpRequest = RestAssured.given(); 
	Response response = httpRequest.get("/Hyderabad"); 
	// Retrieve the body of the Response 
	ResponseBody body = response.getBody(); 
	// To check for sub string presence get the Response body as a String. 
	// Do a String.contains 
	String bodyAsString = body.asString(); 
	// convert the body into lower case and then do a comparison to ignore casing. Assert.assertEquals(bodyAsString.toLowerCase().contains("hyderabad") /*Expected  value*/, true /*Actual Value*/, "Response body contains Hyderabad"); 
	Assert.assertEquals(bodyAsString.toLowerCase().contains("hyderabad") /*Expected  value*/, true /*Actual Value*/, "Response body contains Hyderabad"); 
	} 

}
