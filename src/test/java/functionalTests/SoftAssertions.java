package functionalTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertions {
	
	@Test
	public void softAssertions() {

	System.out.println("Beginning");
	String expected_title = "Yahoo.com";
	String actual_title = "Google.com";
	
	SoftAssert softAssert = new SoftAssert(); //Create an object of SoftAssert() class in order to use soft assertions
	
	System.out.println("Validating Titles");
		/*
		 * softAssert.assertEquals(actual_title, expected_title, "Titles Mismatch");
		 * 
		 * System.out.println("Validating Image"); softAssert.assertEquals(true, false,
		 * "Image Not Found");
		 * 
		 * System.out.println("Validating Text Boxes"); softAssert.assertEquals(true,
		 * false, "Textbox Not Found");
		 * 
		 * System.out.println("Ending");
		 * 
		 * softAssert.assertAll(); //This one statement will report result of each step
		 */	
	}
}
