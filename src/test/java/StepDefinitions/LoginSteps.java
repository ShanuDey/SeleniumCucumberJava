package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	WebDriver driver = null;

	@Before
	public void before() {
		String driverPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", driverPath + "/src/test/resources/drivers/chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().window().maximize();
	}

	@After
	public void after() {
		driver.quit();
	}

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
