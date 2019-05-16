package com.apex.testng.my_selenium_testng_tests;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EcommerceAddToCart2 extends EcommerceBaseUserLogin {

	@BeforeMethod
	public void openProductTab() {
		driver.findElement(By.xpath(PRODUCT_A)).click();
	}

	@Test
	public void addToCart() {	
		Integer quantityBeforeAdd = 0;
			
		for (int i = 2; i <= 10; i++) {
			try {
				String path = "//a[starts-with(@href,'proddetail.php?proid=1000" + i + "')]/img";
				System.out.println(path);
				driver.findElement(By.xpath(path)).click();
				// click mycart
				driver.findElement(By.xpath(MYCART_XPATH_LOCATOR)).click();

				// get quantity of product before add to cart

				try {
					quantityBeforeAdd = Integer.parseInt(
							driver.findElement(By.xpath("//input[@name='qty_1000" + i + "']")).getAttribute("value"));
					System.out.println("quantityBeforeAdd " + quantityBeforeAdd);
					driver.navigate().back();
				} catch (Exception e) {
					driver.navigate().back();
				}
				driver.findElement(By.xpath(ADDTOCART_XPATH_lOCATOR)).click();
				Integer quantityAfterAdd = Integer.parseInt(
						driver.findElement(By.xpath("//input[@name='qty_1000" + i + "']")).getAttribute("value"));
				System.out.println("quantityAfterAdd " + quantityAfterAdd);
				Assert.assertTrue(quantityBeforeAdd < quantityAfterAdd);
				driver.findElement(By.xpath(PRODUCT_A)).click();
			} catch (Exception e) {
				System.out.println();
			}
		}
	}
}
