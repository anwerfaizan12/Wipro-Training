package day_26;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*; 

public class ApiStepDefinitions{
	
	private Response response;
	
	@Given("I have the endpoint {string}")
	public void i_have_the_given_endpoint(String endpoint){
	 RestAssured.baseURI = "https://reqres.in";
	 RestAssured.basePath = endpoint;
	}
	
	@When("I send a GET request")
	public void i_send_a_get_request() {
		//write code here
		response = RestAssured.get();
	}
	
	@Then("the response status code should be {int}")
	public void the_reponse_status_code_should_be(int statusCode) {
		// write code here
		response.then().statusCode(statusCode);
	}
	
	@When("I set POST endpoint")
	public void i_set_post_endpoint() {
		// write code here
	}
	
	@Given("I set request body")
	public void i_set_request_body() {
		//write code here
	}
	
	@When("I send POST HTTP request")
	public void i_send_post_http_request() {
		//write code here
	}
	
	@Then("I receive valid HTTP response code {int}")
	public void i_receive_valid_response_code(Integer int1) {
		// write code here
	}
	
	@Given("I set PUT endpoint")
	public void i_set_put_endpoint() {
		// write code here
	}
	
	@When("I send PUT HTTP request")
	public void i_send_put_http_request() {
		// write code here
	}
	
	@Given("I set DELETE endpoint")
	public void i_set_delete_endpoint() {
		// write code here
	}
	
	@When("I send DELETE HTTP request")
	public void i_send_delete_http_request() {
		// write code here
	}
}



