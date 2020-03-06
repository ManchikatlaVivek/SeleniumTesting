package io.vlabs.selenium.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTestJava01 {

	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver", "C:\\Eclipse Installation\\workspace-tomcat\\testng-basics\\drivers\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver",
				"C:\\Eclipse Installation\\workspace-tomcat\\SeleniumTesting\\drivers\\chromedriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");

		driver.quit();

	}

}
