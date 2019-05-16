package com.guru.bank.basetest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.guru.bank.constants.LoginConstant;
public class BaseTest implements LoginConstant{
	protected WebDriver driver;
	
	@BeforeClass
	public void setupBrowser() {
		driver=new FirefoxDriver();
		driver.get(BASEURL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
}
