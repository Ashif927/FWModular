package classTest;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class prioritySkipDisable {
	
	@Test (priority=3)
	public void logOutTest(){
		System.out.println("Log Out Test");
	}
	
	@Test (priority=1)
	public void logInTest(){
		System.out.println("Log in Test");
	}
	
	@Test (priority=2)
	public void changePasswordTest(){
		System.out.println("Change Password Test");
	}
	
	@Test (priority=4)
	public void skipTest(){
		System.out.println("Skip Test");
		
		throw new SkipException ("Function is not delivered by Dev Yet");
	}
	
	@Test (priority=5, enabled=false)
	public void disableTest(){
		System.out.println("Disable Test");
	}

}
