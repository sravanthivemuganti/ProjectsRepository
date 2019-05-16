package com.apex.testng.my_selenium_testng_tests;

import java.awt.Robot;

import static org.testng.Assert.assertTrue;

import java.awt.Robot;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class EcommerceUserLostpassword extends EcommerceBaseClass {

	@Test
	public void lostPasswordClick() {
		driver.findElement(By.xpath("//a[contains(text(),'Lost Password?')]")).click();
	}

	@Test
	public void checkLostPassword() throws InterruptedException {
		Assert.assertTrue(driver.findElement(By.xpath("//a[contains(text(),'Lost Password?')]")).getText(), true);
		Thread.sleep(2000);
	}

	@Test
	public void lostPasswordSendInvalidMail1() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='mail_address']")).sendKeys("vgsgmail.com");
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		Alert alert = driver.switchTo().alert();
		// System.out.println(alert.getText());
		Assert.assertEquals("Email must contain a Valid E-Mail address.\n", alert.getText());
		Thread.sleep(2000);
		alert.accept();
	}

	@Test
	public void lostPasswordSendInvalidMail2() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='mail_address']")).clear();
		driver.findElement(By.xpath("//input[@id='mail_address']")).sendKeys("vgs@gmailcom");
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		Alert alert = driver.switchTo().alert();
		Assert.assertEquals("Email must contain a Valid E-Mail address.\n", alert.getText());
		Thread.sleep(2000);
		alert.accept();
	}

	@Test
	public void lostPasswordSendMail() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='mail_address']")).clear();
		driver.findElement(By.xpath("//input[@id='mail_address']")).sendKeys("vgs.godha@gmail.com");
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//div[@class='fntstyle']")).getText(), true);
	}
}
