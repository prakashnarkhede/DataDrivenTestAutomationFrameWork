/**
 * 
 */
package com.automationtalks.RegressionSuite;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.automationtalks.TestBaseLibrary.TestBase;

/**
 * Author: Prakash Narkhede
 * Blog: www.AutomationTalks.com
 * LinkedIn: https://www.linkedin.com/in/panarkhede89/
 */
public class VehicalInsuranceCalculator {
	TestBase tb = new TestBase();
	
	WebDriver driver;
	
	@BeforeMethod
	public void ApplicationLogin() {
		driver = tb.launchBrowser();
		
		driver.get("file:///E:/dummyProject/app.html");
	}
	
	@Test
	public void motorCycleInsuranceCalculation() {
		System.out.println("Test1");
	}
	@Test
	public void motorCycleInsuranceCalculation1() {
		System.out.println("Test2");
	}
	
	@AfterMethod
	public void tearDown() {
		if(driver != null) {
			driver.close();			
		}
	}
	
	
}
