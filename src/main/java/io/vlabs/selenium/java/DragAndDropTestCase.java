package io.vlabs.selenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropTestCase {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Eclipse Installation\\workspace-tomcat\\SeleniumTesting\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://jqueryui.com/droppable/");

	// the below two lines are working, choose any one of them for testing;
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
//		driver.switchTo().frame(0);

		Thread.sleep(3000);

		Actions action = new Actions(driver);

		action.clickAndHold(driver.findElement(By.xpath("//*[@id=\"draggable\"]")))
				.moveToElement(driver.findElement(By.xpath("//*[@id=\"droppable\"]"))).release().build().perform();

	}

}
