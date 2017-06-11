package facebooksignuptest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class fbSignuptst {
	
	
	WebDriver chdriver= null;
	
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
	}
	
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("---- before each test");
	}
	
	@AfterMethod
	public void afterMethod(){
		System.out.println("----- After each test");
	}
	@Test
	public void fbSignup (){
		System.out.println("fb signup test");
	 }
	 @Test
	 public void fbFotterLinks (){
	 	System.out.println("fb fotter link test");
	 } 

}
