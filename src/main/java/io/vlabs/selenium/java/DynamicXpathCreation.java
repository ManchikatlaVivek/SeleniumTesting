package io.vlabs.selenium.java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpathCreation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Eclipse Installation\\workspace-tomcat\\SeleniumTesting\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
		//*[@id="tblcrtac"]/tbody/tr[3]/td[3]/input
//		Here the name element starts with pattern "name".
		driver.findElement(By.xpath("//input[contains(@name,'name')]")).sendKeys("User Name");
		
		driver.findElement(By.xpath("//input[starts-with(@name,'name')]")).sendKeys("Second Name");
	

	}

}
