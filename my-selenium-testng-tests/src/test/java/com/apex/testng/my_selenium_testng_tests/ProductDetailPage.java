package com.apex.testng.my_selenium_testng_tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductDetailPage extends EcommerceBaseUserLogin implements EcommerceInterfaceConstant{

	@Test
	public void productDetailPage() {
		//Click Product tab
		driver.findElement(By.xpath(PRODUCT_A)).click();
		//validating opened correct page
		Assert.assertEquals(driver.getCurrentUrl(), "http://www.ecommerce.saipratap.net/products.php");
		//Click on View item
		driver.findElement(By.xpath(DELL19R_VIEWITEM_XPATH)).click();
		//Validating navigated to correct page
		Assert.assertTrue(driver.getCurrentUrl().contains("http://www.ecommerce.saipratap.net/proddetail.php?"), "http://www.ecommerce.saipratap.net/proddetail.php?");
		//Click to Enlarge
		driver.findElement(By.xpath("//img[@src='images/enlarge.gif']")).click();
		//Validating pop up window of enlar
		Assert.assertTrue(true,"//div[@class='sample_popup']");
		//Close the pop up window
		driver.findElement(By.xpath("//img[@id='popup_exit2']")).click();
		//Validating pop up window closed
		Assert.assertTrue(false,"//div[@class='sample_popup']");
		//Click on Add to Wishlist
		
		/*
		 * driver.findElement(By.xpath("//img[@src='images/wish.jpg']")).click(); Alert
		 * alert=driver.switchTo().alert(); Assert.assertEquals(alert.getText()
		 * ,"Do you want to add this product in to your Wishlist?"); alert.accept();
		 * Assert.assertEquals(driver.findElement(By.xpath("//span[@class='msg']")).
		 * getText(),"Item is already on your wishlist");
		 */	
		String s=driver.findElement(By.xpath("//td[@class='font']/strong/following-sibling::span")).getText();
		System.out.println(s);
		
	}
}
