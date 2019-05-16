package com.apex.ecommerce.core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.apex.ecommerce.Order.constant.OrderConstant;
import com.apex.ecommerce.signon.constant.LoginConstant;

public class BaseProductPage implements OrderConstant,LoginConstant{
	protected WebDriver driver = null;

	@BeforeMethod
	public void openProductTab() {
		driver = new FirefoxDriver();
		driver.get("http://www.ecommerce.saipratap.net/customerlogin.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.name(EMAIL_NAME_LOCATOR)).sendKeys("vgs_godha@gmail.com");
		driver.findElement(By.name(PASSWORD_NAME_LOCATOR)).sendKeys("vgs");
		driver.findElement(By.linkText(LOGINBUTTON_LINKTEXT_LOCATOR)).click();	
		driver.findElement(By.xpath(PRODUCT_A)).click();
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
