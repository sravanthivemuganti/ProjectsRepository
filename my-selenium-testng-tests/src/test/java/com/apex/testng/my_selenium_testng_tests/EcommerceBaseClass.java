package com.apex.testng.my_selenium_testng_tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class EcommerceBaseClass {

	protected WebDriver driver = null;

	@BeforeMethod	
	public void loginTest() {
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chrome\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver","C:\\drivers\\geckodriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.ecommerce.saipratap.net/customerlogin.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

	}

	@AfterMethod
	public void endTest() {
		driver.close();
	}

}