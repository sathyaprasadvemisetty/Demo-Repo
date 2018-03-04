package org.testselenium;

import java.util.List;
import java.util.Properties;
import java.util.Random;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ApplicationLibrary extends PublicLibrary{
    
    public static PropertiesFileReader reader;
    public Properties prope;
    public static WebElement element;
	public  void amozonLogin() throws InterruptedException {
		reader = new PropertiesFileReader();
		prope = reader.loadPropFile("/Users/sathyaprasad/eclipse-workspace/seleniumpractice/src/data/OR.properties");
		driver.findElement(By.xpath(prope.getProperty("aSignInMessage"))).click();
		driver.findElement(By.id(prope.getProperty("aUsername"))).sendKeys("vemishettysathya@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath(prope.getProperty("aContinueBtn"))).click();
		driver.findElement(By.id(prope.getProperty("aPassword"))).sendKeys("moksha");
		driver.findElement(By.id(prope.getProperty("aSignInBtn"))).click();
		Assert.assertEquals(prope.getProperty("pageTitle"), driver.getTitle());
	}
	
	public void searchForProduct() {
		driver.findElement(By.id(prope.getProperty("aSearchproduct"))).sendKeys("shirts for mens casual");
		driver.findElement(By.xpath(prope.getProperty("aSearchicon"))).click();
			
	}
	
	public void selectingRandomProduct(String productName) throws InterruptedException {
		String mainWindow = driver.getWindowHandle();
		Random r = new Random();
		driver.findElement(By.xpath("(//ul[@id='s-results-list-atf']/li/div/div[3]/div[1]/a)["+1+r.nextInt(40)+"]")).click();
		Thread.sleep(3000);
		Set<String> pagehandles = driver.getWindowHandles();
		for(String pagehandle:pagehandles) {
			if(!pagehandle.equals(mainWindow)) {
				driver.switchTo().window(pagehandle);
				System.out.println(driver.findElement(By.xpath(prope.getProperty("aProductNameInDetailsPage"))).getText());
			}
		}
	}
	
	public void toolTipselect() {
		driver.findElement(By.xpath(prope.getProperty("gmailusername"))).click();
		Actions action = new Actions(driver);
		//action.moveToElement(toElement);
		
		
	}
	
	
	
}
