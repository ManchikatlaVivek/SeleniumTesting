package io.vlabs.selenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFileUpload {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Eclipse Installation\\workspace-tomcat\\SeleniumTesting\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://html.com/input-type-file/");

		driver.findElement(By.id("fileupload"))
				.sendKeys("C:\\Eclipse Installation\\workspace-tomcat\\SeleniumTesting\\index.html");

	}

}
