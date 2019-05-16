package com.apex.testng.my_selenium_testng_tests;

import java.util.Scanner;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EcommerceDeleteMyCart extends EcommerceBaseUserLogin {

	@Test
	public void deleteMyCart() {
		driver.findElement(By.xpath(MYCART_XPATH_LOCATOR)).click();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Number of products you want to Delete: ");
		int numberOfproducts = input.nextInt();

		for (int i = 1; i <= numberOfproducts; i++) {
			System.out.print("Enter ProductId: ");
			int productId = input.nextInt();

			try {
				String path = "//input[starts-with(@name,'qty_" + productId + "')]";
				System.out.println(path);
				driver.findElement(
						By.xpath(path + "/parent::td[@class='font']/preceding-sibling::td[@class='font']/a/img"))
						.click();
				Alert alert = driver.switchTo().alert();
				Assert.assertEquals(alert.getText(), "Are you sure you want to remove this product from your cart");
				alert.accept();
				Assert.assertEquals(driver.findElement(By.xpath("//td[@class='msg']/span")).getText(),
						"Item has been deleted from your basket");
			} catch (Exception e) {
				System.out.println(productId + " This product is not in the list");
			}
		}
	}
}
