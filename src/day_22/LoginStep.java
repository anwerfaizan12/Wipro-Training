package day_22;

public class LoginStep {
 
	@Given("^User is on FacebookPage$")
	public void user_is_on_FacebookPage() throws Throwable{
		System.out.println("User is on FacebookPage");
	}
	
	@When("^user enter Username and Password$")
	public void user_enter_Username_and_Password() {
		System.out.println("user enter Username and Password");
	}
	
	@Then("^user click the LoginButton$")
	public void user_click_the_LoginButton() {
		System.out.println("user click the LoginButton");
	}
	
	@When("^user enter Details$")
	public void user_enter_Details() {
		System.out.println("user enter Details");
	}
	
	@Then("^user click the register$")
	public void user_click_the_register() {
		System.out.println("user click the register");
	}
	
}
