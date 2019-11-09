package com.automationtalks.TestBaseLibrary;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Author: Prakash Narkhede
 * Blog: www.AutomationTalks.com
 * LinkedIn: https://www.linkedin.com/in/panarkhede89/
 */

public class TestBase {
	
	public WebDriver launchBrowser() {
		
		//use webDriver manager to manage driver executable automatically
		WebDriverManager.chromedriver().setup();
	//	WebDriverManager.firefoxdriver().setup();
	//	WebDriverManager.iedriver().setup();
		
		//launch chrome browser
		WebDriver driver = new ChromeDriver();
		
		//set implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
	}

}
