package classTest;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class dependsOn {
	
	@Test (dependsOnMethods={"changePasswordTest"})
	public void logOutTest(){
		System.out.println("Log Out Test");
	}
	
	@Test ()
	public void logInTest(){
		System.out.println("Log in Test");
	}
	
	@Test (dependsOnMethods ={"logInTest"})
	public void changePasswordTest(){
		System.out.println("Change Password Test");
	}
	
	@Test ()
	public void skipTest(){
		System.out.println("Skip Test");
		throw new SkipException ("Function is not delivered by Dev Yet");
	}
	
	@Test (enabled=false)
	public void disableTest(){
		System.out.println("Disable Test");
	}

}
