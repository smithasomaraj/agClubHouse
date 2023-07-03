package pages.clubhouse;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.common.BasePageActions;
import pages.common.HelperMethods;

public class Home extends BasePageActions{
	

	WebDriver driver;
	HelperMethods helperMethods = new HelperMethods();
	public Home(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	private final String  controlMenu_xpath = "//span[contains(text(),'Control')]";

	private final String  eventsMenu_xpath = "//span[contains(text(),'Events')]";
	private final String  reservationsMenu_xpath = "//span[contains(text(),'Reservations')]";
	private final String  agStoreMenu_xpath = "//span[contains(text(),'aG Store')]";
	private final String  agMarketingHubMenu_xpath = "//span[contains(text(),'aG Marketing Hub')]";
	

	private final String selectAllChkBox_id =  "selectAll";
	private final String selectAllLbl_xpath = "//span[contains(text(),'Select')]";
	private final String  gridOption_xpath = "//span[contains(text(),'Grid')]";
	private final String  listOption_xpath = "//span[contains(text(),'List')]";
	
	private final String  logOut_xpath= "//span[contains(text(),'Logout')]";

	private final String  loadRoundIcon_xpath = "//div/div/span[contains(text(),'%s')]/parent::div/parent::div/following-sibling::div//button[@data-tip='Load Round']";

	private final String  sendMessageIcon_xpath = "//div/div/span[contains(text(),'%s')]/parent::div/parent::div/following-sibling::div//button[@data-tip='Send Message']";
	private final String  sendMessageLbl_xpath = "//div[@class='font-semibold text-sm poppins' and contains(text(),'Send Message')]";
	private final String  sendMessageTxtArea_xpath = "//textarea[@name='messageArea']";
	private final String  sendMessageBtn_xpath = "//button[contains(text(),'Send')]";
	private final String  sendMessage_xpath = "//div[@role='status' and contains(text(),'Your message has been sent')]";
	

	private final String  moveRoundIcon_xpath = "//div/div/span[contains(text(),'%s')]/parent::div/parent::div/following-sibling::div//button[@data-tip='Move Round']";
	private final String  selectSimToMoveLbl_xpath = "//div[contains(text(),'Select Sim To Move Round To:')]";
	private final String  selectSimTxtBox_xpath = "//span[@aria-live='polite']";
	private final String  minutesToAddLbl_xpath = "//div[contains(text(),'How many minutes to add?')]";
	private final String  minutesToAdd_xpath = "//input[@name='timeAddedToDestination']";
	private final String  moveRoundBtn_xpath = "//button[@type='submit' and contains(text(),'Move Round')]";
	
	//************Load Sim  ****************************
	private final String  loadFromSavedRoundLbl_xpath = "//span[contains(text(),'Load From Saved Round Settings')]";
	private final String  addPlayerLbl_xpath = "//span[contains(text(),'Add Players')]";


	private final String  addPlayerSearch_xpath = "//div[contains(text(),'Start typing to search...')]";
	private final String  addPlayerSearchInput_xpath = "//input[@id='startGameAddPlayers']";
	private final String  addPlayerDesc_xpath = "//small[contains(text(),'Search for players by name, email or Locker userna')]";
	private final String  addPlayerSearch2_xpath = "//input[@id='startGameAddPlayers']//ancestor::div";
	
	private final String  addQuickPlayerLbl_xpath = "//span[contains(text(),'Add Quick Player')]";
	
	private final String  selectRoundOrRangeLbl_xpath = " //span[contains(text(),'Select Round or Range')]";
	private final String  selectRoundOrRangeDesc_xpath = "//small[contains(text(),'Will this round be for a round or range')]";
	private final String  selectRoundOrRangeSelectBox_xpath = "//div[contains(text(),'Select...')]";
	
	private final String  setTimeLbl_xpath = "//span[contains(text(),'⏰ Set the Timer or End Time')]";
	private final String  setTimeDesc_xpath = "//small[contains(text(),'How many minutes do you want for the range timer?')]";
	private final String  setTimeInput_xpath = "//input[@name='time']";
	private final String  setTimeInputLbl_xpath = "//small[contains(text(),'Entering a number above will add minutes to the ti')]";
	
	private final String  selectPlayer_xpath = "//strong[normalize-space()='%s']";
	private final String  selectRange_xpath = " //div[contains(text(),'Range')]";
	private final String  selectRound_xpath = " //div[text()='Round']";
	private final String  selectRangeVenueTxtBox_xpath = "//div[contains(text(),'Select...')]";
	private final String  selectRangeVenue_xpath = "//div[contains(text(),'%s')]";
	private final String  addTime_xpath = "//input[@name='time']";
	
	private final String  rangeTime_xpath = "//input[@name='rangeTime']";
	private final String  selectCourceTxtBox_xpath = "//div[contains(text(),'Select...')]";
	private final String  courceName_xpath = "//div[contains(text(),'%s')]";
	private final String  selectHoles_xpath = "//div[normalize-space()='%s']";
	private final String  windSpeed_xpath = "//div[contains(text(),'%s')]";
	private final String  pinType_xpath = "//div[contains(text(),'%s')]";
	private final String  scoring_xpath = "//div[contains(text(),'%s')]";
	private final String  allowMulligansRadio_xpath = "//button[@name='roundInfo.mulligans']";
	private final String  autoDropRadio_xpath = "//button[@name='roundInfo.autoDrop']";
	 
	private final String sendToSim_xpath = "//button[contains(text(),'Send to Sim')]";
	
	//-------------Getters------------------
	
	public WebElement getControlMenu() {
		return findByVisibility(By.xpath(controlMenu_xpath));
	}

	public WebElement getEventsMenu() {
		return findByVisibility(By.xpath(eventsMenu_xpath)); 
	}
	public WebElement getReservationsMenu() {
		return findByVisibility(By.xpath(reservationsMenu_xpath)); 
	}

	public WebElement getAgStoreMenu() {
		return findByVisibility(By.xpath(agStoreMenu_xpath)); 
	}
	public WebElement getAgMarketingHubMenu() {
		return findByVisibility(By.xpath(agMarketingHubMenu_xpath)); 
	}
	public WebElement getSelectAllChkBox() {
		return findByVisibility(By.id(selectAllChkBox_id)); 
	}

	public WebElement getSelectAllLbl() {
		return findByVisibility(By.xpath(selectAllLbl_xpath));
	}

	public WebElement getGridOption() {
		return findByVisibility(By.xpath(gridOption_xpath)); 
	}

	public WebElement getListOption() {
		return findByVisibility(By.xpath(listOption_xpath)); 
	}

	public WebElement getLoadRoundIcon(String simName) {
		return findByVisibility(By.xpath(String.format(loadRoundIcon_xpath, simName)),DEFAULT_TIMEOUT); 
	}
	public WebElement getSendMessageIcon(String simName) {
		return findByVisibility(By.xpath(String.format(sendMessageIcon_xpath, simName)),DEFAULT_TIMEOUT); 
	}
	public WebElement getMoveRoundIcon(String simName) {
		return findByVisibility(By.xpath(String.format(moveRoundIcon_xpath, simName)),DEFAULT_TIMEOUT); 
	}
	public WebElement getSendMessageLbl() {
		return findByVisibility(By.xpath(sendMessageLbl_xpath)); 
	}
	public WebElement getSendMessageTxtArea() {
		return findByVisibility(By.xpath(sendMessageTxtArea_xpath)); 
	}
	public WebElement getSendMessageBtn() {
		return findByVisibility(By.xpath(sendMessageBtn_xpath)); 
	}
	public WebElement getSendMessage() {
		return findByVisibility(By.xpath(sendMessage_xpath)); 
	}
	public WebElement getSelectSimToMoveLbl() {
		return findByVisibility(By.xpath(selectSimToMoveLbl_xpath));
	}
	public WebElement getSelectSimTxtBox() {
		return findByVisibility(By.xpath(selectSimTxtBox_xpath));
	}
	public WebElement getMinutesToAddLbl() {
		return findByVisibility(By.xpath(minutesToAddLbl_xpath));
	}
	public WebElement getminutesToAdd() {
		return findByVisibility(By.xpath(minutesToAdd_xpath));
	}
	public WebElement getMoveRoundBtn() {
		return findByVisibility(By.xpath(moveRoundBtn_xpath));
	}
		

	
	public WebElement getLogOut() {
		return findByVisibility(By.xpath(logOut_xpath)); 
	}

	public WebElement getLoadFromSavedRoundLbl() {
		return findByVisibility(By.xpath(loadFromSavedRoundLbl_xpath)); 
	}
	
	public WebElement getAddPlayerLbl() {
		return findByVisibility(By.xpath(addPlayerLbl_xpath)); 
	}

	public WebElement getAddPlayerSearch() {
		return findByVisibility(By.xpath(addPlayerSearch_xpath));
	}

	public WebElement getAddPlayerSearch2() {
		return findByVisibility(By.xpath(addPlayerSearch2_xpath));
	}
	
	public WebElement getAddPlayerSearchInput() {
		return findByVisibility(By.xpath(addPlayerSearchInput_xpath));
	}
	
	public WebElement getSelectPlayer(String playerName) {
		return findByVisibility(By.xpath(String.format(selectPlayer_xpath, playerName)));
	}
	
	public WebElement getAddPlayerDesc() {
		return findByVisibility(By.xpath(addPlayerDesc_xpath));
	}

	public WebElement getAddQuickPlayerLbl() {
		return findByVisibility(By.xpath(addQuickPlayerLbl_xpath));
	}

	public WebElement getSelectRoundOrRangeLbl() {
		return findByVisibility(By.xpath(selectRoundOrRangeLbl_xpath));
	}

	public WebElement getSelectRoundOrRangeDesc() {
		return findByVisibility(By.xpath(selectRoundOrRangeDesc_xpath));  
	}

	public WebElement getSelectRoundOrRangeSelectBox() {
		return findByVisibility(By.xpath(selectRoundOrRangeSelectBox_xpath));
	}

	public WebElement getSetTimeLbl() {
		return findByVisibility(By.xpath(setTimeLbl_xpath)); 
	}

	public WebElement getSetTimeDesc() {
		return findByVisibility(By.xpath(setTimeDesc_xpath)); 
	}

	public WebElement getSetTimeInput() {
		return findByVisibility(By.xpath(setTimeInput_xpath));
	}

	public WebElement getSetTimeInputLbl() {
		return findByVisibility(By.xpath(setTimeInputLbl_xpath));
	}
	
	public WebElement getSelectRange() {
		return findByVisibility(By.xpath(selectRange_xpath));
	}
	
	public WebElement getSelectRound() {
		return findByVisibility(By.xpath(selectRound_xpath));
	}
	public WebElement getSelectRangeVenueTxtBox() {
		return findByVisibility(By.xpath(selectRangeVenueTxtBox_xpath));
	}
	public WebElement getSelectRangeVenue(String venue) {
		return findByVisibility(By.xpath(String.format(selectRangeVenue_xpath, venue)));
	}
	
	public WebElement getAddTime() {
		return findByVisibility(By.xpath(addTime_xpath));
	}
	public WebElement getRangeTime() {
		return findByVisibility(By.xpath(rangeTime_xpath));
	}
	public WebElement getCourceTxtBox() {
		return findByVisibility(By.xpath(selectCourceTxtBox_xpath));
	}
	
	public WebElement getSelectCourceName(String courceName) {
		return findByVisibility(By.xpath(String.format(courceName_xpath, courceName)));
	}
	public WebElement getSelectHoles(String holes) {
		return findByVisibility(By.xpath(String.format(selectHoles_xpath, holes)));
	}
	public WebElement getWindSpeed(String windSpeed) {
		return findByVisibility(By.xpath(String.format(windSpeed_xpath, windSpeed)));
	}
	public WebElement getSelectPinType(String pinType) {
		return findByVisibility(By.xpath(String.format(pinType_xpath, pinType)));
	}
	public WebElement getSelectScoring(String scoring) {
		return findByVisibility(By.xpath(String.format(scoring_xpath, scoring)));
	}
	
	public WebElement getAllowMulligans() {
		return findByVisibility(By.xpath(allowMulligansRadio_xpath));
	}
	public WebElement getAutoDropRadio_xpath() {
		return findByVisibility(By.xpath(autoDropRadio_xpath));
	}

	
	public WebElement getsendToSim() {
		return findByVisibility(By.xpath(sendToSim_xpath));
	}
	
	
	
	
	
	
	//-----------------  Methods  -------------------
	
	
	public void verifyHomePage() {
		getControlMenu();
		getEventsMenu(); 
		getReservationsMenu();
		getAgStoreMenu();
		getAgMarketingHubMenu();
		getSelectAllChkBox();
		getSelectAllLbl();
		getGridOption();
		getListOption();
		getLogOut();
	}
	
	public void verifyInitialLoadRunPage() {
		getLoadFromSavedRoundLbl();
		getAddPlayerLbl();
		getAddPlayerSearch();
		getAddPlayerDesc();
		getAddQuickPlayerLbl();
		getSelectRoundOrRangeLbl();
		getSelectRoundOrRangeDesc();
		getSelectRoundOrRangeSelectBox();
	}
	
	public void verifySendMessagePopUp() {
		getSendMessageLbl();
		getSendMessageTxtArea();
		getSendMessageBtn();
	}
	
	public void verifyMoveRoundPopUp() {
		getSelectSimToMoveLbl();
		getSelectSimTxtBox();
		getMinutesToAddLbl();
		getminutesToAdd();
		getMoveRoundBtn();
	}
	
	public void loadRange(String venue, String minutes) {
		getAddPlayerSearch().click();
		getAddPlayerSearchInput().sendKeys("smitha");
		new WebDriverWait(driver,Duration.ofSeconds(10))
		.until(ExpectedConditions.elementToBeClickable(getSelectPlayer("Smitha Somaraj(M)"))).click();
//		Select Range
		getSelectRoundOrRangeSelectBox().click();
		new WebDriverWait(driver,Duration.ofSeconds(5))
		.until(ExpectedConditions.elementToBeClickable(By.xpath(selectRange_xpath))).click();
//		Selecting Range venue
		getSelectRangeVenueTxtBox().click();
		new WebDriverWait(driver,Duration.ofSeconds(10))
		.until(ExpectedConditions.elementToBeClickable(getSelectRangeVenue(venue))).click();
		getAddTime().clear();
		getAddTime().sendKeys(minutes);
		
		getsendToSim().click();
	}
	
	public void loadRound(String minutes) {
		getAddPlayerSearch().click();
		getAddPlayerSearchInput().sendKeys("smitha");
		new WebDriverWait(driver,Duration.ofSeconds(10))
		.until(ExpectedConditions.elementToBeClickable(getSelectPlayer("Smitha Somaraj(M)"))).click();
		getAddPlayerSearch2().click();
		getAddPlayerSearchInput().sendKeys("troy");
		new WebDriverWait(driver,Duration.ofSeconds(10))
		.until(ExpectedConditions.elementToBeClickable(getSelectPlayer("Gulgin Troy(M)"))).click();
//		Select Round
		helperMethods.addSystemWait(5, TimeUnit.SECONDS);//.......................................remove
		getSelectRoundOrRangeSelectBox().click();
		new WebDriverWait(driver,Duration.ofSeconds(10))
		.until(ExpectedConditions.elementToBeClickable(By.xpath(selectRound_xpath))).click();
		helperMethods.addSystemWait(5, TimeUnit.SECONDS);//...........................remove
		getAddTime().clear();
		getAddTime().sendKeys(minutes);
//		Choose course options
		helperMethods.addSystemWait(5, TimeUnit.SECONDS);//...........................remove
		getRangeTime().sendKeys("3");
		helperMethods.addSystemWait(5, TimeUnit.SECONDS);//...........................remove
		getCourceTxtBox().click();
		new WebDriverWait(driver,Duration.ofSeconds(10))
		.until(ExpectedConditions.elementToBeClickable(getSelectCourceName("Aleria Gardens"))).click();
		helperMethods.addSystemWait(5, TimeUnit.SECONDS);//...........................remove
		getSelectHoles("Select Front 9").click();
//		getWindSpeed("Calm");
		helperMethods.addSystemWait(5, TimeUnit.SECONDS);//...........................remove
		getsendToSim ().click();
	}
	
	//-----------------------   Verifications --------------------------
	
	public void verifySendMessageStatus() {
		new WebDriverWait(driver, Duration.ofSeconds(5)).withMessage("Failed to send the message")
		.until(ExpectedConditions.visibilityOf(getSendMessage()));
	}
}
