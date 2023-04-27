package pages.clubhouse;

import org.openqa.selenium.WebDriver;

import pages.common.BasePageActions;

public class Home extends BasePageActions{
	

	WebDriver driver;
	
	public Home(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	private final String  controlMenu = "//span[contains(text(),'Control')]";
	private final String  eventsMenu = "//a[contains(text(),'Events')]";
	private final String  storeMenu = "//a[contains(text(),'Store')]";
	
	private final String selectAllChkBox_id =  "selectAll";
	private final String selectAllLbl_xpath = "//button/span[contains(text(),'Login')]";
	
	private final String  gridOption = "//span[contains(text(),'Grid')]";
	private final String  listOption = "//span[contains(text(),'List')]";
	
	private final String  logOut= "//span[contains(text(),'Logout')]";

//	loadRoundBtn_xpath = 
}
