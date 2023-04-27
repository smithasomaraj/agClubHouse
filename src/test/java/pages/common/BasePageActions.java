package pages.common;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePageActions {
	
	private WebDriver driver;
//	public final int DEFAULT_TIMEOUT = Integer.parseInt(System.getProperty("defaultTimeOut"));
	public final int DEFAULT_TIMEOUT = 30;
	public BasePageActions(WebDriver driver){
		this.driver = driver;
	}
	
	protected WebElement findByVisibility(By locator) {
		return findByVisibility(locator, DEFAULT_TIMEOUT);
	}

	protected WebElement findByVisibility(By locator, int timeout) {
		return new WebDriverWait(driver, Duration.ofSeconds(timeout))
				.withMessage("Test Timed out: Object was not visible after " + timeout + " seconds\n" + "object By = \""
						+ locator.toString() + "\"")
				.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	protected WebElement findByPresence(By locator) {
		return this.findByPresence(locator, DEFAULT_TIMEOUT);
	}

	protected WebElement findByPresence(By locator, int timeout) {
		return new WebDriverWait(driver, Duration.ofSeconds(timeout))
				.withMessage("Test Timed out: Object was not present after " + timeout + " seconds\n"
						+ "object xpath = \"" + locator.toString() + "\"")
				.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

	protected WebElement findByClickability(By locator) {
		return this.findByClickability(locator, DEFAULT_TIMEOUT); }
	
	protected WebElement findByClickability(By locator, int timeout) {
		return new WebDriverWait(driver, Duration.ofSeconds(timeout))
				.withMessage("Test Timed out: Object was not clickable (enabled and visible) after " + timeout + " seconds\n" +
						"object xpath = \"" + locator.toString() + "\"")
				.until(ExpectedConditions.elementToBeClickable(locator));
	}

	
}
