package com.apex.test.samples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EcoomerceUserLogin {
	WebDriver driver=null;
	@BeforeTest
	public void setupTest() {
		driver=new FirefoxDriver();
		driver.get("http://www.ecommerce.saipratap.net/customerlogin.php");
	}
	@Test
	public void loginWithBlank() throws InterruptedException {
		driver.findElement(By.name("email")).sendKeys("");
		driver.findElement(By.name("password")).sendKeys("");	
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(2000);
	}
	@Test
	public void loginWithBlankUserId() throws InterruptedException {
		driver.findElement(By.name("email")).sendKeys("");
		driver.findElement(By.name("password")).sendKeys("pwd2");	
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(2000);
	}
	@Test
	public void loginWithBlankPassword() throws InterruptedException {
		driver.findElement(By.name("email")).sendKeys("vgs.godha@gmail.com");
		driver.findElement(By.name("password")).sendKeys("");	
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(2000);
	}
	@Test
	public void loginWithInvalidCredentials() throws InterruptedException {
		driver.findElement(By.name("email")).sendKeys("test2@gmail.com");
		driver.findElement(By.name("password")).sendKeys("pwd2");	
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(2000);
	}
	@Test
	public void loginWithValidCredentials() throws InterruptedException {
		driver.findElement(By.name("email")).sendKeys("vgs.godha@gmail.com");
		driver.findElement(By.name("password")).sendKeys("vgs");	
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(2000);
	}
	@Test
	public void loginWithInvalidEmail() throws InterruptedException {
		driver.findElement(By.name("email")).sendKeys("test2@gmail.com");
		driver.findElement(By.name("password")).sendKeys("pwd2");
		String email=driver.getPageSource();
		System.out.println(email);
		//driver.findElement(By.linkText("Login")).click();
		Thread.sleep(2000);
	}
}
