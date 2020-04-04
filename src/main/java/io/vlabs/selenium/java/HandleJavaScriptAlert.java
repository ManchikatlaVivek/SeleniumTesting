package io.vlabs.selenium.java;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleJavaScriptAlert {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Eclipse Installation\\workspace-tomcat\\SeleniumTesting\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		// click on login button without filling any data.

		driver.findElement(By.name("proceed")).click();

		Alert alert = driver.switchTo().alert();

		System.out.println(alert.getText());

		alert.accept();
//		alert.dismiss();
	}

}
