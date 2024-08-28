package day_25;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class Prg3 {

	@Test 
	public void WeatherMessageBody() 
	{
	RestAssured.baseURI = "https://restapi.demoqa.com/utilities/weather/city";
	RequestSpecification httpRequest = RestAssured.given(); 
	Response response = httpRequest.get("/Hyderabad"); 
	// Retrieve the body of the Response 
	ResponseBody body = response.getBody(); 
	// By using the ResponseBody.asString() method, we can convert the body // into the string representation. 
	System.out.println("Response Body is: " + body.asString()); 
	} 

}
