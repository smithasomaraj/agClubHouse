package step_definitions.clubhouse;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.clubhouse.Events;
import pages.clubhouse.Home;
import pages.common.CoreAutomation;
import pages.common.HelperMethods;

public class Events_stepDefinitions {
	WebDriver driver;
	HelperMethods helperMethods;
	Events events;
	Home home;
	
	public Events_stepDefinitions(CoreAutomation automation) {
		driver = automation.getDriver();
		events = new Events(driver);
		home = new Home(driver);
		helperMethods = new HelperMethods();
	}
	
	@And("select events menu item")
	public void selectEventsMenuItem() {
		home.getEventsMenu().click();
		
	}
	@Then("Select Online Events")
	public void selectOnlineEvents() {
		events.getOnlineEvents().click();
	}
	
	@And("Create an Online Event")
	public void createAnOnlineEvent() {
		events.createOnlineEvents();
	}
	
	@And("verify the event is created successfully")
	public void verifyEventCreatedSuccessfully() {
		events.verifyEventCreation();
	}
	
	@Then("I edit the newly created event")
	public void editEvents() {
		events.editEvent("6.12.23 test");
		events.verifyDisabledElement();
	}
    
}
 