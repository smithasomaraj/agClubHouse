package pages.clubhouse;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import pages.common.BasePageActions;
import pages.common.UserAccount;

public class Login extends BasePageActions{

	WebDriver driver;
	private String userFileName= null;
	Map<String, UserAccount> userAccountMap = new HashMap<String, UserAccount>();
	
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
	public void loginToClubHouse(String accountReference) {
		loadUserAccounds();
		UserAccount currentAccount = userAccountMap.get(accountReference);
		loginToClubHouse(currentAccount.getUserId(),currentAccount.getPassword());
	}
	public void loadUserAccounds() {
		loadFileName();
		Gson gson = new Gson();
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(userFileName));
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		Type type = new TypeToken<List<UserAccount>>() {}.getType();
		List<UserAccount> allUsers = gson.fromJson(Objects.requireNonNull(reader), type);
		for(UserAccount account : allUsers) {
			userAccountMap.put(account.getAccountReference(), account);
		}
	}
	
	public void loadFileName() {
		switch(System.getProperty("server")) {
		case "qa":
			userFileName = "userAccountsQA.json";
		}
	}
	//-----------------  Validations  -------------------
	
	public void verifyInvalidUserCredentials() {
		new WebDriverWait(driver, Duration.ofSeconds(5)).withMessage("Invalid credentials message is not visible")
		.until(ExpectedConditions.visibilityOf(getUserNamePwdIncorrectMsg()));
	}
	
	public void verifyResetPasswordUrl() {
		new WebDriverWait(driver, Duration.ofSeconds(5)).withMessage("Invalid URL")
		.until(ExpectedConditions.urlContains(System.getProperty("forgotPwdUrl")));
	}
}
