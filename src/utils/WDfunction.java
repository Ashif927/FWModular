package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WDfunction {
	
	public static WebDriver chdriver;
	
	public void typeByXpath (String locators, String value){
		chdriver.findElement (By.xpath(locators)).clear();
		chdriver.findElement (By.xpath(locators)).sendKeys(value);
	};
	public void typeByName (String locators, String value){
		chdriver.findElement(By.name(locators)).sendKeys(value);
	};
	public void typeByID (String locators, String value){
		chdriver.findElement(By.id(locators)).sendKeys(value);
	};


}
