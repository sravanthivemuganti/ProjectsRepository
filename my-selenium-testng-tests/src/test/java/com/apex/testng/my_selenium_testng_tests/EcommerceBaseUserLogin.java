package com.apex.testng.my_selenium_testng_tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class EcommerceBaseUserLogin implements EcommerceInterfaceConstant{
	WebDriver driver;
	@BeforeTest
	public void loginUser() {
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.ecommerce.saipratap.net/customerlogin.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.name(EMAIL_CONSTANT)).sendKeys("vgs_godha@gmail.com");
		driver.findElement(By.name(PASSWORD_CONSTANT)).sendKeys("vgs");		
		driver.findElement(By.linkText(LOGIN_CLICK_CONSTANT)).click();
	}
	@AfterTest
	public void tearDown() {
		driver.close();
	}
}
