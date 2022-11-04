package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	@Given("I am on the login page")
	public void i_am_on_the_login_page() {
		System.out.println("Inside step - I am on the login page");
	}

	@When("^I enter email \"(.*)\" and password \"(.*)\"$")
	public void i_enter_email_and_password(String email, String password) {
		System.out.println("Inside step - I enter username and passowrd");
	}

	@When("I click on login button")
	public void i_click_on_login_button() {
		System.out.println("Inside step - I click on login button");
	}

	@Then("I verify dashbord page is opened")
	public void i_verify_dashbord_page_is_opened() {
		System.out.println("Inside step - I verify dashbord page is opened");
	}

}
