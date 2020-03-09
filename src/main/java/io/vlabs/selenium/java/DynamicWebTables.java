package io.vlabs.selenium.java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicWebTables {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver",
				"C:/Eclipse Installation/workspace-tomcat/SeleniumTesting/drivers/geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://freecrm.co.in/");

		// click on Login Button

		WebElement loginLocator = driver.findElement(By.xpath("//a/span[contains(text(),'Log In')]"));

		new WebDriverWait(driver, 5).ignoring(StaleElementReferenceException.class)
				.until(ExpectedConditions.elementToBeClickable(loginLocator));
		loginLocator.click();

//		update username and password
		driver.findElement(By.name("email")).sendKeys("");
		driver.findElement(By.name("password")).sendKeys("");
		driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
		
		Thread.sleep(3000);
		WebElement contactLocator = driver.findElement(By.xpath("//a/span[contains(text(),'Contacts')]"));
		//new WebDriverWait(driver, 20).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(contactLocator));
		contactLocator.click();
		
		//td[contains(text(),'ashok kumar')]/preceding-sibling::td/div/input
		driver.findElement(By.xpath("//td[contains(text(),'ashok kumar')]/preceding-sibling::td/div/label")).click();

	}

}
