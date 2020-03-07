package io.vlabs.selenium.project.java;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class MatrimonyRegister {

	static WebDriver driver;

	public static void main(String[] args) throws IOException {

		Properties prop = new Properties();
		FileInputStream stream = new FileInputStream(
				"C:/Eclipse Installation/workspace-tomcat/SeleniumTesting/src/main/resources/config.properties");

		prop.load(stream);

		String browser = prop.getProperty("BROWSER");
		if (browser.equals("CHROME")) {
			System.out.println("chrome name is : " + prop.getProperty("CHROME_WEBDRIVER_NAME"));
			System.setProperty(prop.getProperty("CHROME_WEBDRIVER_NAME"), prop.getProperty("CHROME_DRIVER_PATH"));
			driver = new ChromeDriver();
		} else if (browser.equals("FIREFOX")) {
			System.setProperty(prop.getProperty("FIREFOX_WEBDRIVER_NAME"), prop.getProperty("FIREFOX_DRIVER_PATH"));
			driver = new FirefoxDriver();
		} else {
			System.setProperty(prop.getProperty("IE_WEBDRIVER_NAME"), prop.getProperty("IE_DRIVER_PATH"));
			driver = new InternetExplorerDriver();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(prop.getProperty("URL"));

		/*
		 * Start filling data in Register page
		 */

		driver.findElement(By.xpath(prop.getProperty("USERNAME_XPATH"))).sendKeys(prop.getProperty("USERNAME_VALUE"));

		driver.findElement(By.xpath(prop.getProperty("GENDER_XPATH"))).click();

		Select select = new Select(driver.findElement(By.xpath(prop.getProperty("PROFILE_CREATED_FOR_XPATH"))));
		select.selectByVisibleText(prop.getProperty("PROFILE_CREATED_FOR_VALUE"));

		select = new Select(driver.findElement(By.xpath(prop.getProperty("MOTHER_TONGUE_XPATH"))));
		select.selectByVisibleText(prop.getProperty("MOTHER_TONGUE_VALUE"));

		select = new Select(driver.findElement(By.xpath(prop.getProperty("RELIGION_XPATH"))));
		select.selectByVisibleText(prop.getProperty("RELIGION_VALUE"));

		select = new Select(driver.findElement(By.xpath(prop.getProperty("CASTE_XPATH"))));
		select.selectByVisibleText(prop.getProperty("CASTE_VALUE"));

		select = new Select(driver.findElement(By.xpath(prop.getProperty("COUNTRY_ID_XPATH"))));
		select.selectByVisibleText(prop.getProperty("COUNTRY_ID_VALUE"));

		driver.findElement(By.xpath(prop.getProperty("MOBILE_NUMBER_XPATH")))
				.sendKeys(prop.getProperty("MOBILE_NUMBER_VALUE"));

		driver.findElement(By.xpath(prop.getProperty("EMAIL_XPATH"))).sendKeys(prop.getProperty("EMAIL_VALUE"));

		driver.findElement(By.xpath(prop.getProperty("PASSWORD_XPATH"))).sendKeys(prop.getProperty("PASSWORD_VALUE"));

		driver.findElement(By.xpath(prop.getProperty("TERMS_COND_XPATH"))).click();

	}

}
