package io.vlabs.selenium.java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:/Eclipse Installation/workspace-tomcat/SeleniumTesting/drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

		driver.get("https://www.facebook.com/");
//		using custom created xpath for clicking the login button.
//		clickOn(driver,driver.findElement(By.xpath("//input[contains(@id,'u_0_b')]")),20);
//		clickOn(driver, driver.findElement(By.xpath("//input[@data-testid='royal_login_button']")), 20);
		clickOn(driver, driver.findElement(By.xpath("//input[@id='u_0_b']")), 20);
				

	}

	public static void clickOn(WebDriver driver, WebElement locator, int timeout) {
		new WebDriverWait(driver, timeout).ignoring(StaleElementReferenceException.class)
				.until(ExpectedConditions.elementToBeClickable(locator));
		
		locator.click();

	}

}
