package io.vlabs.selenium.java;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserPopUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:/Eclipse Installation/workspace-tomcat/SeleniumTesting/drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

		driver.get("http://www.popuptest.com/goodpopups.html");

		driver.findElement(By.xpath("//a[contains(text(),'Good PopUp #1')]")).click();
/*
 * Window Id's are generated at run time only. we cannot find these id's in the HTML page.
 * getWindowHandles() returns the set of windowHanldes of Type<String>
 */
		Set<String> handles = driver.getWindowHandles();

		Iterator<String> it = handles.iterator();

		String parentWindowHanlderId = it.next();
		System.out.println("Parent Window id: "+parentWindowHanlderId);

		String childWindowHandlerId = it.next();
		System.out.println("Child Window id: "+childWindowHandlerId);

		driver.switchTo().window(childWindowHandlerId);

		Thread.sleep(2000);

		System.out.println("Child Title : " + driver.getTitle());

		driver.close();

		driver.switchTo().window(parentWindowHanlderId);

		Thread.sleep(2000);

		System.out.println("Parent Title : " + driver.getTitle());

	}

}
