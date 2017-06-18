package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class config {
	// log - log4j
	// baseURL - Compnay website
	// set up browsers
	// start the suite
	// end suite
	
 public WebDriver chdriver= null;
	
	@BeforeSuite
	public void beforeSuite(){
		System.out.println("*** TEST SUITE STARTED ");
		// DB Connection
		// suite start time
	}
	@AfterSuite
	public void afterSuite(){
		System.out.println("*** TEST SUITE ENDED ");
		// close db
		// suite end time
		
	}
	
	@BeforeTest
	public void beforeTest (){
		System.out.println("Before the test");
		System.out.println("Open Browse");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ashif\\workspace\\drivers\\chromedriver.exe");
		chdriver = new ChromeDriver();
		//For getting website in browser
		chdriver.get("https:\\www.facebook.com");
		
	}
	@AfterTest
	public void afterTest (){
		System.out.println("After the test");
		System.out.println("Close Browser");
		
	}
	

}
