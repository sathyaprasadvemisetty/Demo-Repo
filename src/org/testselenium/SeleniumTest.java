package org.testselenium;

import java.io.File;
import java.nio.charset.Charset;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class SeleniumTest {
	public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://accounts.google.com/SignUp?hl=en-GB");
		driver.findElement(By.xpath("//label[@id='gmail-address-label']//input")).click();
		String s = driver.getPageSource();		
		System.out.println(s);

	}

}
