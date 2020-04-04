/*
 * @author Vivek Manchikatla
 * This is to test multi-level sub menus.
 * Hover to Menu1--> then Menu2 --> Then click
 * This is an assignment exercise to practise mouse hoverings and cusomt xpaths.
 */
package io.vlabs.selenium.java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SpiceJetTesting {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Eclipse Installation\\workspace-tomcat\\SeleniumTesting\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// lauch the test page
		driver.get("https://www.spicejet.com/");

		Actions actions = new Actions(driver);

//		Hover to first Menu1
		actions.moveToElement(driver.findElement(By.id("ctl00_HyperLinkLogin"))).build().perform();

//		Hover to sub menu Menu2
		actions.moveToElement(driver.findElement(By.linkText("SpiceClub Members"))).build().perform();
		
//		find the element and click.
		driver.findElement(By.linkText("Member Login")).click();
		
//		This is a custom xpath created to click on sign up link. You can run the step above or this one.
//		driver.findElement(By.xpath("//a[contains(text(),'Sign up')]")).click();
		

	}

}
