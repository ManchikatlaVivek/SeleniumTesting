package io.vlabs.selenium.java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigationBackAndForward {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Eclipse Installation\\workspace-tomcat\\SeleniumTesting\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		
		driver.get("https://www.google.com/");
		
		driver.navigate().to("https://www.amazon.in/");
		
		driver.navigate().back();

	}

}
