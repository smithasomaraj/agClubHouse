package step_definitions.clubhouse;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.clubhouse.Home;
import pages.common.CoreAutomation;
import pages.common.HelperMethods;

public class Home_stepDefinitions {
	
	WebDriver driver;
	HelperMethods helperMethods;
	Home home;
	
	public Home_stepDefinitions(CoreAutomation automation) {
		driver = automation.getDriver();
		home = new Home(driver);
		helperMethods = new HelperMethods();
	}
	
	@Given("I verify clubhouse home page")
	public void verify_clubhouse_home_page() {
	    home.verifyHomePage();
	}

	@Then("I select loadRound buton")
	public void select_load_round_buton() throws InterruptedException {
		try {
		helperMethods.addSystemWait(5, TimeUnit.SECONDS);
		home.getLoadRoundIcon("Mo test sim 1").click();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	@And("verify initial load rond page")
		public void verifyInitialLoadRondPage() {
			home.verifyInitialLoadRunPage();
	}
	
	@Then("Load a Range with {string} for {string} minutes")
	public void load_a_range_with_for_minutes(String venue, String minutes) {
		home.loadRange(venue, minutes);
	}
	
	@Then("Load a Round for {string} minutes")
	public void load_a_round_for_minutes(String minutes) {
		home.loadRound(minutes);
		helperMethods.addSystemWait(5, TimeUnit.SECONDS);;
	}
	
	@Then("I select send message icon")
	public void selectSendMessageIcon() {
		helperMethods.addSystemWait(5, TimeUnit.SECONDS);;
		home.getSendMessageIcon("Mo test sim 1").click();
		
	}
	@And("verify send message popup")
	public void verifySendMessagePopup() {
		home.verifySendMessagePopUp();
		helperMethods.addSystemWait(10, TimeUnit.SECONDS);;
	}
	
	@Then("I send a message")
	public void sendMessage() {
		home.getSendMessageTxtArea().sendKeys("Hello from Admin");
		home.getSendMessageBtn().click();
	}
	@And("verify I got a success message")
	public void verifyIGotASuccessMessage() {
		home.verifySendMessageStatus();
	}
	  
	@Then("I select move round icon")
	public void selectMoveRoundIcon() {
		helperMethods.addSystemWait(5, TimeUnit.SECONDS);;
		home.getMoveRoundIcon("Mo test sim 1").click();
	}
	@And("verify move round popup")
	public void verifyMoveRoundPopup() {
		home.verifyMoveRoundPopUp();
		helperMethods.addSystemWait(10, TimeUnit.SECONDS);;
	}

}
