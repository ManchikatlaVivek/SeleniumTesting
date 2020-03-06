package io.vlabs.selenium.java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MatrimonyRegister {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Eclipse Installation\\workspace-tomcat\\SeleniumTesting\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

		driver.get(
				"https://www.kalyanmatrimony.com/online-matrimony-website?utm_source=google&utm_medium=cpc&utm_campaign=Ad_Category&gclid=EAIaIQobChMIu_D_lr7-5wIVkwsrCh1WaAA0EAAYASAAEgIKZfD_BwE");

		driver.findElement(By.id("username")).sendKeys("Selenium Testing");

		driver.findElement(By.id("radio1")).click();

//		Handle the dropdown
		Select select = new Select(driver.findElement(By.id("profilecreatedfor")));
		select.selectByVisibleText("Sister");

		select = new Select(driver.findElement(By.id("mothertongue")));
		select.selectByVisibleText("Telugu");

		select = new Select(driver.findElement(By.id("religion")));
		select.selectByVisibleText("Hindu");

//		Thread.sleep(500);
		select = new Select(driver.findElement(By.id("caste")));
		select.selectByVisibleText("Padmasali");

		select = new Select(driver.findElement(By.id("countryId")));
		select.selectByVisibleText("+91, India");

		driver.findElement(By.id("mobileNumber")).sendKeys("9999998979");

		driver.findElement(By.id("email")).sendKeys("abcd.sister@gmail.com");

		driver.findElement(By.id("password")).sendKeys("abcd1234");

		driver.findElement(By.id("term")).click();

	}

}
