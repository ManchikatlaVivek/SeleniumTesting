/*
 * This code is for checking the static webTables in the HTML page.
 */
package io.vlabs.selenium.java;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HTMLWebTables {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:/Eclipse Installation/workspace-tomcat/SeleniumTesting/drivers/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		// /html/body/div[6]/div[1]/div[1]/div[3]/div/table/tbody/tr[2]/td[1]
		// /html/body/div[6]/div[1]/div[1]/div[3]/div/table/tbody/tr[3]/td[1]
		// /html/body/div[6]/div[1]/div[1]/div[3]/div/table/tbody/tr[4]/td[1]
		
		List<WebElement> rowList = driver.findElements(By.xpath("/html/body/div[6]/div[1]/div[1]/div[3]/div/table/tbody/tr"));
		
		System.out.println("Total Number of rows is : "+rowList.size());
		String prevXpath = "/html/body/div[6]/div[1]/div[1]/div[3]/div/table/tbody/tr[";
		String afterXpath = "]/td[1]";
		for(int i=2;i<=rowList.size();i++) {
			
			String rowText = driver.findElement(By.xpath(prevXpath+i+afterXpath)).getText();
			System.out.println(rowText);
		}
		System.out.println("***********************************************************");
		// Finding number of columns.
		// /html/body/div[6]/div[1]/div[1]/div[3]/div/table/tbody/tr[1]/th[1]
		// /html/body/div[6]/div[1]/div[1]/div[3]/div/table/tbody/tr[1]/th[2]
		// /html/body/div[6]/div[1]/div[1]/div[3]/div/table/tbody/tr[1]/th[3]
		
		List<WebElement> colList = driver.findElements(By.xpath("/html/body/div[6]/div[1]/div[1]/div[3]/div/table/tbody/tr[1]/th"));
		System.out.println("Total number of Columns is : "+colList.size());
		
		prevXpath = "/html/body/div[6]/div[1]/div[1]/div[3]/div/table/tbody/tr[1]/th[";
		afterXpath = "]";
		for(int i=1;i<=colList.size();i++) {
			String colText = driver.findElement(By.xpath(prevXpath+i+afterXpath)).getText();
			System.out.println(colText);
		}
		
		System.out.println("***********************************************************");
		// finding first row and print all columns.
		// /html/body/div[6]/div[1]/div[1]/div[3]/div/table/tbody/tr[2]/td[1]
		// /html/body/div[6]/div[1]/div[1]/div[3]/div/table/tbody/tr[2]/td[2]
		// /html/body/div[6]/div[1]/div[1]/div[3]/div/table/tbody/tr[2]/td[3]
		
		List<WebElement> firstRowColList = driver.findElements(By.xpath("/html/body/div[6]/div[1]/div[1]/div[3]/div/table/tbody/tr[2]/td"));
		System.out.println("First row total number of columns are : "+firstRowColList.size());
		
		prevXpath = "/html/body/div[6]/div[1]/div[1]/div[3]/div/table/tbody/tr[2]/td[";
		afterXpath = "]";
		for(int i=1;i<=firstRowColList.size();i++) {
			String firstRowColText = driver.findElement(By.xpath(prevXpath+i+afterXpath)).getText();
			System.out.println(firstRowColText);
		}

	}

}
