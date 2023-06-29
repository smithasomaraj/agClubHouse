package pages.clubhouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.junit.Assert;

import java.io.File;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import pages.common.BasePageActions;
import pages.common.GlobalVariables;
import pages.common.HelperMethods;

public class Events extends BasePageActions{
	
	WebDriver driver;
	HelperMethods helperMethods = new HelperMethods();
	
	public Events(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	private final String onlineEvents_xpath = "//h3[contains(text(),'Online Events')]";
	private final String createOnlineEvent_xpath = " //button[@id='btnOpenCreateNewRoundTray']";
	private final String eventName_xpath = "//input[@name='name']";
	private final String eventDesc_xpath = "//input[@name='description']";
	private final String eventImage_xpath ="//input[@name='file']";
	private final String tour_id = "eventTour";
	private final String selectTour_xpath = "//div[contains(text(),'%s')]";
	private final String competitionType_id = "eventCompetitionType";
	private final String competitionTypeInput_xpath = "//div[@id='eventCompetitionType']//input";
	private final String selectCompetitionType_xpath = "//div[contains(text(),'%s')]";
	private final String startDateLbl_xpath = "//span[contains(text(),'Start Date')]";
	private final String startDate_xpath = "//input[@name='startDate']";
	private final String endDate_xpath = "//input[@name='endDate']";
	private final String numberOfRounds_id = "eventRounds";
	private final String selectNumberOfRounds_xpath = "//div[contains(text(),'%s')]";
	private final String numberOfRoundsInput_xpath = "//div[@id='eventRounds']//input";
	private final String tournamentReplays_xpath = "//input[@name='replays']";
	private final String handicapMode_id = "eventHandicapMode";
	private final String selectHandicapMode_xpath = "//div[contains(text(),'%s')]";
	private final String eventGimmeDistance_id = "eventGimmeDistance";
	private final String selectGimmeDistance_xpath  =  "//div[contains(text(),'%s')]";
	private final String eventMulligans_id = "eventMulligans";
	private final String selectMulligans_xpath = "//div[contains(text(),'%s')]";
	private final String eventCourseId_id = "eventCourseId0";
	private final String eventCourseIdInput_xpath = "//div[@id='eventCourseId0']//input";
	private final String selectEventCourse_xpath = "//div[contains(text(),'%s')]";
	private final String holes_xpath="//div[@aria-labelledby='Holes']//button";
	private final String front9Holes_xpath =  "//div[contains(text(),'Select Front 9')]";
	private final String back9Holes_xpath =  "//div[contains(text(),'Select Back 9')]";
	private final String all18Holes_xpath =  "//div[contains(text(),'Select All 18')]";
	private final String pinType_id = "";
	private final String selectPinType_xpath = "//div[contains(text(),'%s')]";
	private final String mensTeeBlack_xpath = "//input[@id='Black'][@name='roundInfo[0].mensTees']/parent::div";
	private final String womensTeeBlack_xpath = "//input[@id='Black'][@name='roundInfo[0].womensTees']/parent::div";
	private final String groundCondnVeryDry_xpath = "//input[@id='VeryDry']/parent::div";
	private final String skySunny_xpath = "//input[@id='Sunny']/parent::div";
	private final String windSpeedCalm_xpath = "//input[@id='Calm']/parent::div";
	private final String windDirectionNorth_xpath = "//input[@id='North']/parent::div";
	private final String createEvent_xpath = "//button[contains(text(),'Create Event')]";
	
	
	private final String viewEventDetails_xpath = "//div[contains(.,'%s')]/following-sibling::div//button[contains(text(),'View Event Details')]";
	private final String closeEventDetails_xpath = "//div[contains(.,'%s')]/following-sibling::div//button[contains(text(),'Close')]";
	private final String editEventDetails_xpath = "//div[contains(.,'%s')]/following-sibling::div//button[contains(text(),'Edit')]";
	private final String deleteEventDetails_xpath = "//div[contains(.,'%s')]/following-sibling::div//button[contains(text(),'Delete')]";
	
	//-------------Getters------------------
	
	public WebElement getOnlineEvents() {
		return findByVisibility(By.xpath(onlineEvents_xpath)); 
	}
	public WebElement getCreateOnlineEvent() {
		return findByVisibility(By.xpath(createOnlineEvent_xpath)); 
	}
	public WebElement getEventName() {
		return findByVisibility(By.xpath(eventName_xpath)); 
	}
	public WebElement getEventDesc() {
		return findByVisibility(By.xpath(eventDesc_xpath)); 
	}
	public WebElement getEventImage(){
		return findByVisibility(By.xpath(eventImage_xpath)); 
	}
	public WebElement getTour() {
		return findByVisibility(By.id(tour_id)); 
	}
	public WebElement selectTour(String tourName) {
		
		return findByVisibility(By.xpath(String.format(selectTour_xpath, tourName)),DEFAULT_TIMEOUT);  
	}
	public WebElement getCompetitionType() {
		return findByVisibility(By.id(competitionType_id)); 
	}
	public WebElement getCompetitionTypeInput() {
		return findByPresence(By.xpath(competitionTypeInput_xpath)); 
	}
	
	public WebElement selectCompetitionType(String competitionType) {
		return findByVisibility(By.xpath(String.format(selectCompetitionType_xpath, competitionType)),DEFAULT_TIMEOUT);  
	}
	public WebElement getStartDate() {
		return findByVisibility(By.xpath(startDate_xpath)); 
	}
	public WebElement getStartDateLbl() {
		return findByVisibility(By.xpath(startDateLbl_xpath)); 
	}
	public WebElement getEndDate() {
		return findByVisibility(By.xpath(endDate_xpath)); 
	}
	public WebElement getNumberOfRounds() {
		return findByVisibility(By.id(numberOfRounds_id)); 
	}
	public WebElement getNumberOfRoundsInput() {
		return findByPresence(By.xpath(numberOfRoundsInput_xpath)); 
	}
	public WebElement selectNumberOfRounds(String rounds) {
		return findByVisibility(By.xpath(String.format(selectNumberOfRounds_xpath, rounds)),DEFAULT_TIMEOUT);  
	}
	public WebElement getTournamentReplays() {
		return findByVisibility(By.xpath(tournamentReplays_xpath)); 
	}
	public WebElement getHandicapMode() {
		return findByVisibility(By.id(handicapMode_id)); 
	}
	public WebElement selectHandicapMode(String mode) {
		return findByVisibility(By.xpath(String.format(selectHandicapMode_xpath, mode)),DEFAULT_TIMEOUT);
	}
	public WebElement getEventGimmeDistance() {
		return findByVisibility(By.id(eventGimmeDistance_id)); 
	}
	public WebElement selectGimmeDistance(String distance) {
		return findByVisibility(By.xpath(String.format(selectGimmeDistance_xpath, distance)),DEFAULT_TIMEOUT);
	}
	public WebElement getMulligans() {
		return findByVisibility(By.id(eventMulligans_id)); 
	}
	public WebElement selectMulligans(String OnOff) {
		return findByVisibility(By.xpath(String.format(selectMulligans_xpath, OnOff)),DEFAULT_TIMEOUT); 
	}
	public WebElement getCourse() {
		return findByVisibility(By.id(eventCourseId_id)); 
	}
	public WebElement getCourseInput() {
		return findByPresence(By.xpath(eventCourseIdInput_xpath)); 
	}
	public WebElement selectEventCourse(String cource) {
		return findByVisibility(By.xpath(String.format(selectEventCourse_xpath, cource)),DEFAULT_TIMEOUT);
	}
	public WebElement getHoles() {
		return findByPresence(By.xpath(holes_xpath)); 
	}
	public WebElement getFront9Holes() {
		return findByVisibility(By.xpath(front9Holes_xpath)); 
	}
	public WebElement getBack9Holes() {
		return findByVisibility(By.xpath(back9Holes_xpath)); 
	}
	public WebElement getAll18Holes() {
		return findByVisibility(By.xpath(all18Holes_xpath)); 
	}
	public WebElement getPinType() {
		return findByVisibility(By.id(pinType_id)); 
	}
	public WebElement selectPinType(String pinType) {
		return findByVisibility(By.xpath(String.format(selectPinType_xpath, pinType)),DEFAULT_TIMEOUT); 
	}
	public WebElement getMensTeeBlack() {
		return findByVisibility(By.xpath(mensTeeBlack_xpath)); 
	}
	public WebElement getWomensTeeBlack() {
		return findByVisibility(By.xpath(womensTeeBlack_xpath)); 
	}
	public WebElement getGroundCondnVeryDry() {
		return findByVisibility(By.xpath(groundCondnVeryDry_xpath)); 
	}
	public WebElement getSkySunny() {
		return findByVisibility(By.xpath(skySunny_xpath)); 
	}
	public WebElement getWindSpeedCalm() {
		return findByVisibility(By.xpath(windSpeedCalm_xpath)); 
	}
	public WebElement getWindDirectionNorth() {
		return findByVisibility(By.xpath(windDirectionNorth_xpath)); 
	}
	public WebElement getCreateEvent() {
		return findByVisibility(By.xpath(createEvent_xpath)); 
	}
	public WebElement getViewEventDetails(String eventName) {
		return findByVisibility(By.xpath(String.format(viewEventDetails_xpath, eventName)),DEFAULT_TIMEOUT); 
	}
	public WebElement getEditEventDetails(String eventName) {
		return findByVisibility(By.xpath(String.format(editEventDetails_xpath, eventName)),DEFAULT_TIMEOUT); 
	}
	public WebElement getCloseEventDetails(String eventName) {
		return findByVisibility(By.xpath(String.format(closeEventDetails_xpath, eventName)),DEFAULT_TIMEOUT); 
	}
	public WebElement getDeleteEventDetails(String eventName) {
		return findByVisibility(By.xpath(String.format(deleteEventDetails_xpath, eventName)),DEFAULT_TIMEOUT); 
	}
	
	
	//-----------------  Methods  -------------------
	
	public void createOnlineEvents() {
		getCreateOnlineEvent().click();
		String eventName = "Automation Event";
		String eventDesc = "Automation created events";
		getEventName().sendKeys(eventName);
		getEventDesc().sendKeys(eventDesc);
		GlobalVariables.addGlobalVariable("eventName", eventName);
		GlobalVariables.addGlobalVariable("eventDesc", eventDesc);
		File file = new File("files/download.jpg");
		getEventImage().sendKeys(file.getAbsolutePath());
		
		getTour().click();
		findByScrollIntoViewBottomOfScreen(By.xpath(String.format(selectTour_xpath, "Automation Tour")));
		helperMethods.addSystemWait(1, TimeUnit.SECONDS );
		selectTour("Automation Tour").click();
		helperMethods.addSystemWait(2, TimeUnit.SECONDS );
		
		getCompetitionType().click();
		helperMethods.addSystemWait(1, TimeUnit.SECONDS );
		selectCompetitionType("Stroke").click();
		helperMethods.addSystemWait(1, TimeUnit.SECONDS );
		
		Calendar startCal = helperMethods.addNumberOfDaysToCalendarDate(Calendar.getInstance(),1);
		getStartDate().sendKeys(helperMethods.getCalendarDateAsString(startCal));
		
		Calendar endCal = helperMethods.addNumberOfDaysToCalendarDate(Calendar.getInstance(),5);
		getEndDate().sendKeys(helperMethods.getCalendarDateAsString(endCal));
		getStartDateLbl().click();
		helperMethods.addSystemWait(2, TimeUnit.SECONDS );
		
		getNumberOfRounds().click();
		helperMethods.addSystemWait(1, TimeUnit.SECONDS );
		selectNumberOfRounds("One");
		helperMethods.addSystemWait(1, TimeUnit.SECONDS );
		
		getTournamentReplays().clear();
		getTournamentReplays().sendKeys("1");
		getHandicapMode().click();
		helperMethods.addSystemWait(1, TimeUnit.SECONDS );
		selectHandicapMode("Off").click();
		helperMethods.addSystemWait(1, TimeUnit.SECONDS );
		
		getEventGimmeDistance().click();
		helperMethods.addSystemWait(1, TimeUnit.SECONDS );
		selectGimmeDistance("Off").click();
		helperMethods.addSystemWait(2, TimeUnit.SECONDS );
		
		findByScrollIntoViewBottomOfScreen(getAll18Holes());
		getMulligans().click();
		helperMethods.addSystemWait(1, TimeUnit.SECONDS );
		selectMulligans("Off").click();
		helperMethods.addSystemWait(1, TimeUnit.SECONDS );
		
		getCourse().click();
		helperMethods.addSystemWait(1, TimeUnit.SECONDS );
		selectEventCourse("Aleria Gardens").click();;
		helperMethods.addSystemWait(1, TimeUnit.SECONDS );
		
		getFront9Holes().click();
//		getPinType().click();
//		helperMethods.addSystemWait(1, TimeUnit.SECONDS );
//		selectPinType("Novice");
		
		helperMethods.addSystemWait(1, TimeUnit.SECONDS );
//		driver.findElement(By.xpath("//div[contains(text(),'Mens Tee')]")).click();
//		helperMethods.addSystemWait(1, TimeUnit.SECONDS );
		getMensTeeBlack().click();
		helperMethods.addSystemWait(1, TimeUnit.SECONDS );
		findByScrollIntoViewBottomOfScreen(getCreateEvent());
		
		helperMethods.addSystemWait(1, TimeUnit.SECONDS );
		getWomensTeeBlack().click();
		helperMethods.addSystemWait(1, TimeUnit.SECONDS );
		getGroundCondnVeryDry().click();
		helperMethods.addSystemWait(1, TimeUnit.SECONDS );
		getSkySunny().click();
		helperMethods.addSystemWait(1, TimeUnit.SECONDS );
		getWindSpeedCalm().click();
		helperMethods.addSystemWait(1, TimeUnit.SECONDS );
		getWindDirectionNorth().click();
		helperMethods.addSystemWait(1, TimeUnit.SECONDS );
		getCreateEvent().click();
	}
	
	public void verifyEventCreation() {
		
	}
	
	public void editEvent(String eventName) {
		getViewEventDetails(eventName).click();
		helperMethods.addSystemWait(1, TimeUnit.SECONDS );
		getEditEventDetails(eventName).click();
	}
	public void verifyDisabledElement() {
		helperMethods.addSystemWait(1, TimeUnit.SECONDS );
		Assert.assertFalse(getEventImage().isEnabled());
		helperMethods.addSystemWait(1, TimeUnit.SECONDS );
		Assert.assertFalse(getCompetitionTypeInput().isEnabled());
		helperMethods.addSystemWait(1, TimeUnit.SECONDS );
		Assert.assertFalse(getStartDate().isEnabled());
		helperMethods.addSystemWait(1, TimeUnit.SECONDS );
		Assert.assertFalse(getNumberOfRoundsInput().isEnabled());
		helperMethods.addSystemWait(1, TimeUnit.SECONDS );
		Assert.assertFalse(getTournamentReplays().isEnabled());
		findByScrollIntoViewBottomOfScreen(getHoles());
		helperMethods.addSystemWait(1, TimeUnit.SECONDS );
		Assert.assertFalse(getCourseInput().isEnabled());
		helperMethods.addSystemWait(1, TimeUnit.SECONDS );
		Assert.assertFalse(getHoles().isEnabled());
	}
}
