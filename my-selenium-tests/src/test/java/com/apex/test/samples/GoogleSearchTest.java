package com.apex.test.samples;

import org.openqa.selenium.By;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearchTest {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Starting google test");
		//Create the driver
		WebDriver driver=new FirefoxDriver();
		//Open the page
		driver.get("http://www.google.com");
		//Search element
		WebElement searchBox=driver.findElement(By.name("q"));
		//set the data
		searchBox.sendKeys("Java Book");
		Thread.sleep(1000);
		//click
		WebElement searchButton=driver.findElement(By.name("btnK"));
		searchButton.click();
		//verify
		//close the browser
		driver.close();
		System.out.println("Ending google test");

	}
	
}
