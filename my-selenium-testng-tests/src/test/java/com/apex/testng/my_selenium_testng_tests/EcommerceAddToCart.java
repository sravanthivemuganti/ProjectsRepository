package com.apex.testng.my_selenium_testng_tests;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EcommerceAddToCart extends EcommerceBaseUserLogin {

	@BeforeTest
	public void openProductTab() {
		driver.findElement(By.xpath(PRODUCT_A)).click();
	}
	@Test
	public void addToCart() {	
		
		Scanner input=new Scanner(System.in);
		System.out.print("Enter Number of products you want to add: ");
		int numberOfproducts=input.nextInt();
		for (int i = 1; i <= numberOfproducts; i++) {		
			System.out.print("Enter ProductId: ");
			int productId=input.nextInt();
			try {
				String path = "//a[starts-with(@href,'proddetail.php?proid=" + productId + "')]/img";
				System.out.println(path);
				driver.findElement(By.xpath(path)).click();
				Assert.assertEquals(driver.findElement(By.xpath("//div[contains(text(),'Product Detail')]")).getText(), "Product Detail");
				driver.findElement(By.xpath(ADDTOCART_XPATH_lOCATOR)).click();
				Assert.assertEquals(driver.findElement(By.xpath("//div[contains(text(),'Your shopping cart')]")).getText(), "Your shopping cart");
				driver.findElement(By.xpath(PRODUCT_A)).click();
			}
			catch(Exception e) {
				System.out.println(productId + " This product is not available");
			}
		}
	}
}
