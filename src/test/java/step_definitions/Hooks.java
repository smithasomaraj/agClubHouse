package step_definitions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import pages.common.CoreAutomation;

public class Hooks {

	WebDriver driver;

	public Hooks(CoreAutomation automation) {
		driver = automation.getDriver();
	}

	@Before
	public void beforeCallingScenario(Scenario scenario) {
		System.out.println("================Starting Scenario============= " + scenario.getName() + "\n");
	}

	@After
	public void afterCallingScenario(Scenario scenario) {
		 //validate if scenario has failed
        if(scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) driver ).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName()); 
        } 
		System.out.println("================Ending Scenario============== " + scenario.getName() + "\n");
		driver.quit();
	}

}
