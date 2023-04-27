package pages.clubhouse;

import java.time.Duration;

import org.junit.rules.ExpectedException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.common.BasePageActions;

public class Login extends BasePageActions{

	WebDriver driver;
	
	public Login(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	private final String emailAddress_id = "email";
	
	private final String password_id = "password";
	
	private final String loginBtn_xpath = "//button/span[contains(text(),'Login')]";
	
	private final String forgotPasswordLink_xpath = "//a[contains(text(),'Forgot password?')]";

	private final String rememberMeChkBox_xpath = "//input[@id='rememberMe']";
	
	private final String rememberMeLbl_xpath = "//label[@for='rememberMe']";
	
	private final String userNamePwdIncorrectMsg_xpath = "//div[contains(text(),'Username or password is incorrect')]";
	
	//-------------Getters------------------
	public WebElement getEmailAddress() {
		return findByVisibility(By.id(emailAddress_id));
	}
	
	public WebElement getPassword() {
		return findByVisibility(By.id(password_id));
	}
	
	public WebElement getLoginBtn() {
		return findByVisibility(By.xpath(loginBtn_xpath));
	}
	
	
	public WebElement getForgotPasswordLink() {
		return findByVisibility(By.xpath(forgotPasswordLink_xpath)); 
	}

	public WebElement getRememberMeChkBox() {
		return findByVisibility(By.xpath(rememberMeChkBox_xpath));
	}

	public WebElement getRememberMeLbl() {
		return findByVisibility(By.xpath(rememberMeLbl_xpath));
	}
	
	public WebElement getUserNamePwdIncorrectMsg() {
		return findByVisibility(By.xpath(userNamePwdIncorrectMsg_xpath));
	}
	
	//-----------------  Methods  -------------------
	
	public void pageVerification() {
		getEmailAddress();
		getPassword();
		getLoginBtn();
		getForgotPasswordLink();
		getRememberMeChkBox();
		getRememberMeLbl();
	}
	
	public void goToClubHouse() {
		driver.get(System.getProperty("baseUrl"));
	}
	public void loginToClubHouse(String email, String pwd) {
		goToClubHouse();
		getEmailAddress().clear();
		getEmailAddress().sendKeys(email);
		getPassword().clear();
		getPassword().sendKeys(pwd);
		getLoginBtn().click();
	}
	
	//-----------------  Validations  -------------------
	public void verifyInvalidUserCredentials() {
		new WebDriverWait(driver, Duration.ofSeconds(5)).withMessage("Invalid credentials message is not visible")
		.until(ExpectedConditions.visibilityOf(getUserNamePwdIncorrectMsg()));
	}
}
