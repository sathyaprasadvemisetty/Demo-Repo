package org.testselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class PublicLibrary {

	public static WebDriver driver;
	
	@BeforeClass
	public static void invokeBrowser() {
		
		System.setProperty("webdriver.chrome.driver","resources/chromedriver");
		driver = new ChromeDriver();
		//driver.get("https://www.amazon.in/");
		driver.get("https://accounts.google.com/SignUp?hl=en-GB");
	}
	
	@AfterClass
	public static void tearDown() {
		//driver.quit();
	}
	
	
	
}
