/*
 * This is a practise page for Selenium Testing for Kalyan Matrinoy Site.
 */
package io.vlabs.selenium.java;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PractiseKM {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:/Eclipse Installation/workspace-tomcat/SeleniumTesting/drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.kalyanmatrimony.com/");

		driver.findElement(By.xpath("//button[contains(text(),'REGISTER')]")).click();

		driver.findElement(By.id("username")).sendKeys("Selenium");

		Select select = new Select(driver.findElement(By.id("profilecreatedforpopup")));
		select.selectByVisibleText("Sister");

		select = new Select(driver.findElement(By.id("genderpopup")));
		select.selectByVisibleText("Female");

		select = new Select(driver.findElement(By.id("mothertonguepopup")));
		select.selectByVisibleText("Malayalam");

		select = new Select(driver.findElement(By.id("religionpopup")));
		select.selectByVisibleText("Christian - Catholic");

		select = new Select(driver.findElement(By.id("castepopup")));
		select.selectByVisibleText("Church of South India");

		select = new Select(driver.findElement(By.id("countryIdpopup")));
		select.selectByVisibleText("+93, Afghanistan");

		driver.findElement(By.id("mobileNumberpopup")).sendKeys("7889678967");

		driver.findElement(By.id("email")).sendKeys("abcd.test@test.com");

		driver.findElement(By.id("password")).sendKeys("test@123");

		driver.findElement(By.id("term")).click();

	}

}
