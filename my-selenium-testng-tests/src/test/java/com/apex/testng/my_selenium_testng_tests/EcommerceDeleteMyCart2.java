package com.apex.testng.my_selenium_testng_tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EcommerceDeleteMyCart2 extends EcommerceBaseUserLogin {

	@Test
	public void deleteMyCart() {
		driver.findElement(By.xpath(MYCART_XPATH_LOCATOR)).click();
		for (int i = 1; i <=10; i++) {
			try {
				String path = "//input[starts-with(@name,'qty_1000"+i+"')]";
				System.out.println(path);
				driver.findElement(
						By.xpath(path + "/parent::td[@class='font']/preceding-sibling::td[@class='font']/a/img"))
						.click();
				Alert alert=driver.switchTo().alert();
				Assert.assertEquals(alert.getText(), "Are you sure you want to remove this product from your cart");
				alert.accept();
				Assert.assertEquals(driver.findElement(By.xpath("//td[@class='msg']/span")).getText(),"Item has been deleted from your basket");
			} catch (Exception e) {
				System.out.println();
			}
		}
	}
}
