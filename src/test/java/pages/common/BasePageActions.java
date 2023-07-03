package pages.common;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePageActions {
	
	private WebDriver driver;
//	public final int DEFAULT_TIMEOUT = Integer.parseInt(System.getProperty("defaultTimeOut"));
	public final int DEFAULT_TIMEOUT = 30;
	HelperMethods helperMethods = new HelperMethods();
	
	public BasePageActions(WebDriver driver){
		this.driver = driver;
	}
	
	protected WebElement findByVisibility(By locator) {
		return findByVisibility(locator, DEFAULT_TIMEOUT);
	}
	protected WebElement findByVisibility(WebElement element) {
		return findByVisibility(element, DEFAULT_TIMEOUT);
	}

	protected WebElement findByVisibility(By locator, int timeout) {
		return new WebDriverWait(driver, Duration.ofSeconds(timeout))
				.withMessage("Test Timed out: Object was not visible after " + timeout + " seconds\n" + "object By = \""
						+ locator.toString() + "\"")
				.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	protected WebElement findByVisibility(WebElement element, int timeout) {
		return new WebDriverWait(driver, Duration.ofSeconds(timeout))
				.withMessage("Test Timed out: Object was not visible after " + timeout + " seconds\n" )
				.until(ExpectedConditions.visibilityOf(element));
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

	protected WebElement findByScrollIntoViewBottomOfScreen(By locator) {
		WebElement element = this.findByPresence(locator);
		// true  = top of the element will be aligned to the top of the visible area of the scrollable ancestor
		// false = bottom of the element will be aligned to the bottom of the visible area of the scrollable ancestor
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);", element);
		new WebDriverWait(driver, Duration.ofSeconds(DEFAULT_TIMEOUT)).until(ExpectedConditions.visibilityOf(element));
		return this.findByVisibility(locator);
	}
	
	protected WebElement findByScrollIntoViewBottomOfScreen(WebElement element) {
		// true  = top of the element will be aligned to the top of the visible area of the scrollable ancestor
		// false = bottom of the element will be aligned to the bottom of the visible area of the scrollable ancestor
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);", element);
		new WebDriverWait(driver, Duration.ofSeconds(DEFAULT_TIMEOUT)).until(ExpectedConditions.visibilityOf(element));
		return this.findByVisibility(element);
	}
	protected void scrollIntoBottomOfScreen() {
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
		helperMethods.addSystemWait(3, TimeUnit.SECONDS );
	}

	protected void scrollIntoTopOfScreen() {
		WebElement element = driver.findElement(By.tagName("head"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
	}

}
