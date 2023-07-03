package step_definitions.clubhouse;

import java.util.concurrent.TimeUnit;

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
	
	@Given("Login to clubhouse as {string}")
	public void login_to_clubhouse(String accountReference) {
		login.loginToClubHouse(accountReference);
	}
	@Then("verify invalid login message")
	public void verify_invalid_login_message() {
		login.verifyInvalidUserCredentials();
	}
	
	@Given("select Forgot Password Link")
	public void select_forgot_password_link() {
	    login.getForgotPasswordLink().click();
	}
	@Then("verify I am redirected to the correct url")
	public void verify_i_am_redirected_to_the_correct_url() {
	    login.verifyResetPasswordUrl();
	}
}
