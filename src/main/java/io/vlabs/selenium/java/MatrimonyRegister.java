package io.vlabs.selenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MatrimonyRegister {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Eclipse Installation\\workspace-tomcat\\testng-basics\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.kalyanmatrimony.com/online-matrimony-website?utm_source=google&utm_medium=cpc&utm_campaign=Ad_Category&gclid=EAIaIQobChMIu_D_lr7-5wIVkwsrCh1WaAA0EAAYASAAEgIKZfD_BwE");
		
		driver.findElement(By.id("username")).sendKeys("Hello World");

	}

}
