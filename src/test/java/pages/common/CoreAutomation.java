package pages.common;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class CoreAutomation {

	private WebDriver driver;
	Properties properties = new Properties();
	
	
	public CoreAutomation(){
		this.driver  = new ChromeDriver();
		init();
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void init() {
		loadProperties();
		System.setProperty("baseUrl", properties.getProperty("baseUrl"));
		System.setProperty("webdriver.chrome.driver", properties.getProperty("webdriver.chrome.driver"));
		System.setProperty("forgotPwdUrl", properties.getProperty("forgotPwdUrl"));
		System.setProperty("server", properties.getProperty("server"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	private void loadProperties() {
		
		InputStream stream;
		try {
			stream = new FileInputStream("config.properties");
			properties.load(stream);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


}
