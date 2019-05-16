package com.apex.testng.my_selenium_testng_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EcommerceEditMyCart2 extends EcommerceBaseUserLogin implements EcommerceInterfaceConstant {

	@Test
	public void myCartEdit(){
		driver.findElement(By.xpath(MYCART_XPATH_LOCATOR)).click();
		
		for(int i=1;i<=10;i++)
		{
			try {
			String path="//input[starts-with(@name,'qty_1000"+i+"')]";
			System.out.println(path);
			driver.findElement(By.xpath(path)).clear();		
			driver.findElement(By.xpath(path)).sendKeys("5");			
			driver.findElement(By.xpath(path+"/parent::td[@class='font']/preceding-sibling::td[@class='font_w']")).click();
			Assert.assertEquals(driver.findElement(By.xpath("//span[@class='msg']")).getText(), "Your basket has been updated");
			}
			catch(Exception e){
				System.out.println();
			}
		}
	}
	
}
