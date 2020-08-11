package groupTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Validations {

	@Test(groups="smoke")
	public void validateTitles() {

		System.out.println("Beginning");
		String expected_title = "Yahoo.com";
		String actual_title = "Google.com";

	/*	if (expected_title.equals(actual_title)) {
			System.out.println("Test case is Passed");
		} else {
			System.out.println("Test is Failed");
		}*/
	System.out.println("Validating Titles");
	Assert.assertEquals(actual_title, expected_title);
	//Assert.assertTrue(false, "Element Not Found");
	//Assert.fail("Failing the test as condition is not met");
	
	System.out.println("Validating Image");
	Assert.assertEquals(true, false);
	
	System.out.println("Validating Text Boxes");
	Assert.assertEquals(true, false);
		
	System.out.println("Ending");

	}

}
