package com.apex.testng.my_selenium_testng_tests;

import java.io.File;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.common.collect.Table.Cell;

public class FacebookSignupAccount {

	WebDriver driver = null;

	@BeforeTest
	public void startTest() {
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
	}

	@Test
	public void firstName() throws IOException {
		
 
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebElement fname = driver.findElement(By.xpath("//input[@name='firstname']"));
		fname.sendKeys("Sravanthi");
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(Keys.TAB);
		
		try {
		if (fname.getText().equals("")) {
			driver.findElement(By.xpath("//input[@name='firstname']")).click();
			Assert.assertEquals(driver.findElement(By.xpath("//*[@class='_5633 _5634 _53ij']")).getText(),"What’s your name?");
		}
		}
		catch(Exception e) {
			System.out.println(fname);
		}
	}
}
