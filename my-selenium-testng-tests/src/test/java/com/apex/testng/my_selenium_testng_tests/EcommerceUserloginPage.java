package com.apex.testng.my_selenium_testng_tests;

import static org.testng.Assert.assertTrue;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sun.jna.platform.unix.X11.Window;

import junit.framework.Assert;

public class EcommerceUserloginPage extends EcommerceBaseClass implements EcommerceInterfaceConstant {

	
	@Test(priority=1)
	public void loginWithBlank() {
			driver.findElement(By.name(EMAIL_CONSTANT)).sendKeys("");
		driver.findElement(By.name(PASSWORD_CONSTANT)).sendKeys("");
		driver.findElement(By.linkText(LOGIN_CLICK_CONSTANT)).click();
		Assert.assertEquals("Invalid Username / Password!",
				driver.findElement(By.xpath(".//span[@class='msg']")).getText());
	}

	@Test(priority=2)
	public void loginWithBlankUserId() {
		driver.findElement(By.name(EMAIL_CONSTANT)).sendKeys("");
		driver.findElement(By.name(PASSWORD_CONSTANT)).sendKeys("pwd2");
		driver.findElement(By.linkText(LOGIN_CLICK_CONSTANT)).click();
		Assert.assertEquals("Invalid Username / Password!",
				driver.findElement(By.xpath(".//span[@class='msg']")).getText());

	}

	@Test(priority=3)
	public void loginWithBlankPassword() {
		driver.findElement(By.name(EMAIL_CONSTANT)).sendKeys("vgs_godha@gmail.com");
		driver.findElement(By.name(PASSWORD_CONSTANT)).sendKeys("");
		driver.findElement(By.linkText(LOGIN_CLICK_CONSTANT)).click();
		Assert.assertEquals("Invalid Username / Password!",
				driver.findElement(By.xpath(".//span[@class='msg']")).getText());

	}

	@Test(priority=4)
	public void loginWithInvalidCredentials() {
		driver.findElement(By.name(EMAIL_CONSTANT)).sendKeys("test2@gmail.com");
		driver.findElement(By.name(PASSWORD_CONSTANT)).sendKeys("pwd2");
		driver.findElement(By.linkText(LOGIN_CLICK_CONSTANT)).click();
		Assert.assertEquals("Invalid Username / Password!",
				driver.findElement(By.xpath(".//span[@class='msg']")).getText());

	}

	@Test(priority=5)
	public void loginWithValidCredentials() throws InterruptedException {
		driver.findElement(By.name(EMAIL_CONSTANT)).sendKeys("vgs_godha@gmail.com");
		driver.findElement(By.name(PASSWORD_CONSTANT)).sendKeys("vgs");
		driver.findElement(By.linkText(LOGIN_CLICK_CONSTANT)).click();
		Assert.assertEquals("You have Logged In successfully.",driver.findElement(By.xpath("//div[@class='fntstyle']")).getText());
	}
}
