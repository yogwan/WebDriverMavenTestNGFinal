package functionalTests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTestCase {

	@BeforeMethod
	public void launchBrowser() {

		System.out.println("Launching Browser");
	}
	
	@AfterMethod
	public void closeBrowser() {
	
	System.out.println("Closing Browser");
	}

	@BeforeTest
	public void createDBConn() {
	
	System.out.println("Creating DB Connection");
	}
		
	@AfterTest
	public void closeDBConn() {
		
	System.out.println("Closing DB Connection");
	}
			
	@Test(priority = 2)
	public void doLogin() {

		System.out.println("Executing Login Test Case");

	}

	@Test(priority = 1)
	public void doUserRegistration() {

		System.out.println("Do User Registration Test Case");

	}
}
