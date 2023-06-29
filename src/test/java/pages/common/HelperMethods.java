package pages.common;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HelperMethods {
	
	/***
	 * <p>purpose: Have the automation wait a specified time. <br>
	 * @param lWaitTime = the wait time for the system to wait <br>
	 * @param timeUnit = the time unit describing lWaitTime<br>
	 * 		= "MINUTES" | "SECONDS" | "MILISECONDS" | "MICROSECONDS"</p>
	 */
	public void addSystemWait (long lWaitTime, TimeUnit timeUnit) {

		try {
			timeUnit.sleep(lWaitTime);
		} catch (InterruptedException e)
		{
			System.err.println("InterruptedException" + e.getMessage());
		}
	}
	
	public void clickElementByJavaScript(WebDriver driver, WebElement ele) {
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", ele);
	}
	
	 public Calendar getCurrentTimeAsCalendar() {
	        Calendar today = Calendar.getInstance();
	        return today;
	    }

	    
	    public String getCalendarDateAsString(Calendar date) {
	        SimpleDateFormat sdf = new SimpleDateFormat("MMM d, h:mm a");
	        sdf.setTimeZone(date.getTimeZone());
	        return sdf.format(date.getTime());
	    }  
	    public Calendar addNumberOfMonthsToCalendarDate(Calendar date, int numMonths) {
	    	
	        Calendar endDate = Calendar.getInstance();
	        endDate.setTime(date.getTime());
	        endDate.add(Calendar.MONTH, numMonths);
	        return endDate;
	    }

	
		public Calendar addNumberOfDaysToCalendarDate(Calendar date, int days) {
	        Calendar endDate = Calendar.getInstance();
	        endDate.setTime(date.getTime());
	        endDate.add(Calendar.HOUR, +24 * days);
	        return endDate;
	    }

	    
	    public Calendar addNumberOfMinutesToCalendarDate(Calendar date, int mins) {
	        Calendar endDate = Calendar.getInstance();
	        endDate.setTime(date.getTime());
	        endDate.add(Calendar.MINUTE, mins);
	        return endDate;
	    }
	
	    
}
