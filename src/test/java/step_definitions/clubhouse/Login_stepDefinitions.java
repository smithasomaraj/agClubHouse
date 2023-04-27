package step_definitions.clubhouse;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.clubhouse.Login;
import pages.common.CoreAutomation;

public class Login_stepDefinitions {
	WebDriver driver;
	Login login;
	
	
	public Login_stepDefinitions(CoreAutomation automation) {
		driver = automation.getDriver();
		login = new Login(driver);
	}
	
	@Given("Go to clubhouse")
	public void go_to_clubhouse() {
		login.goToClubHouse();
	}

	@Then("I verify clubhouse login page")
	public void i_verify_clubhouse_home_page() {
		login.pageVerification();
	}

	@Given("Login to clubhouse with email {string} and password {string}")
	public void login_to_clubhouse(String email, String pwd) {
		login.loginToClubHouse(email, pwd);
	}
	
	@Then("verify invalid login message")
	public void verify_invalid_login_message() {
		login.verifyInvalidUserCredentials();
	}
	
}
