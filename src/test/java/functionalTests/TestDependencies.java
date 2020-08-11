package functionalTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDependencies {
	

	@Test(priority = 1)
	public void doUserRegistration() {

		System.out.println("Test Case 1:Do User Registration Test Case");
		//Assert.fail("User not registered successfully");

	}
	
	@Test(priority = 2, dependsOnMethods = "doUserRegistration")
	public void doLogin() {

		System.out.println("Test Case 2:Executing Login Test Case");
	}
	
	@Test(priority = 3, dependsOnMethods = "doUserRegistration", alwaysRun = true)
	public void doForgotPassword() {

		System.out.println("Test Case 3:Forgot Password Page");

	}

	@Test(priority = 4)
	public void doForgotUsername() {

		System.out.println("Test Case 4:Forgot UserName Page");

	}
	
}
