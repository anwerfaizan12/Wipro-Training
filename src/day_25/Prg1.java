package day_25;


import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Prg1 {

	@Test 
	public void IteratingHeaders() 
	{ RestAssured.baseURI = "https://demoqa.com/BookStore/v1/Books";  
	RequestSpecification httpRequest = RestAssured.given();  
	Response response = httpRequest.get("");  
	// Get all the headers and then iterate over allHeaders to print each header  Headers allHeaders = response.headers();  
	// Iterate over all the Headers  
	  Headers allHeaders = response.getHeaders();  
	for(Header header : allHeaders) {  
	 System.out.println("Key: " + header.getName() + " Value: " + header.getValue());  }  
	} 

}
