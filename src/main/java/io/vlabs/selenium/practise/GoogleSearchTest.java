package io.vlabs.selenium.practise;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearchTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:/Eclipse Installation/workspace-tomcat/SeleniumTesting/drivers/geckodriver.exe");
//		System.setProperty("webdriver.chrome.driver",				"C:/Eclipse Installation/workspace-tomcat/SeleniumTesting/drivers/chromedriver.exe");

		WebDriver driver = new FirefoxDriver();
//		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();

		driver.get("https://www.google.com/");

//		driver.findElement(By.xpath("//input[@role='combobox']")).sendKeys("testing");
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("testing ");

		List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']/li/descendant::div[@class='sbl1']"));
		System.out.println(list.size());
		
		for(WebElement listItem: list) {
			System.out.println(listItem.getText());
			if(listItem.getText().contains("testing life cycle")) {
				listItem.click();
				break;
			}
		}
	}

}
