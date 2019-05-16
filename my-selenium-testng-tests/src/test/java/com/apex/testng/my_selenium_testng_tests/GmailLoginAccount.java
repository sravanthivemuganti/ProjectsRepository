package com.apex.testng.my_selenium_testng_tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Keyboard;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GmailLoginAccount {

	WebDriver driver=null;
	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chrome\\chromedriver.exe");

		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.gmail.com");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	@Test
	public void firstNameTextBox() throws InterruptedException {
//		if(driver.findElement(By.xpath("//input[@name='firstname']")).isSelected());
//		{
//			Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"js_7k\"]")).getText(), "What’s your name?");;
//		}
		
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("vgs.godha@gmail.com");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("");
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/content/span")).click();
	// start to compose email	
//		driver.findElement(By.xpath("//*[@class='T-I J-J5-Ji T-I-KEL3']")).click();
//		driver.findElement(By.xpath("//*[@name='to']")).sendKeys("venuvydhyala@gmail.com");
//		driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys("Mail from Selenium Program");
//		driver.findElement(By.xpath("//*[@class='Am Al editable LW-avf']")).sendKeys("Hi mail to test from selenium program");
//		driver.findElement(By.xpath("//*[@class='T-I J-J5-Ji aoO T-I-atl L3']")).click();
	// end to compose email
		
		driver.findElement(By.xpath("//span[@class='gb_ya gbii']")).click();
		driver.findElement(By.xpath("//a[@id=\"gb_71\"]")).click();
	}
}