package classTest;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.config;

public class frameworkTest extends config {
	@Test
	public void enterEmail(){
		System.out.println("enter email");
		chdriver.findElement(By.xpath("//*[@id='email']")).sendKeys("test@gmail.com");
	
	}
	@Test
	public void enterPassword(){
		System.out.println("enter password");
		chdriver.findElement(By.xpath("//*[@id='pass']")).sendKeys("test.pass");
	
	}

}
