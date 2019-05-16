package com.apex.testng.my_selenium_testng_tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class EcommerceLostPassword {
	WebDriver driver=null;
	
	@BeforeTest
	public void startMethod() {
		driver =new FirefoxDriver();
		driver.get("http://www.ecommerce.saipratap.net/customerlogin.php");
	}
	
}
