package com.apex.ecommerce.Order;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.apex.ecommerce.Order.page.AddToCartPage;
import com.apex.ecommerce.core.BaseProductPage;

public class AddToCartTest extends BaseProductPage{
	
	@Test
	public void successAddToCart() {
		
	AddToCartPage acp=new AddToCartPage(driver);	
	Scanner input=new Scanner(System.in);
	System.out.print("Enter Number of products you want to add: ");
	int numberOfproducts=input.nextInt();
	
	for (int i = 1; i <= numberOfproducts; i++) {		
		System.out.print("Enter ProductId: ");
		int productId=input.nextInt();
	try {
		//Send ProductId to ViewItem
		String path=acp.viewItemPath(productId);
		driver.findElement(By.xpath(path)).click();
		//VeriFy product detail page opened
		String actualProductDetailHeading=acp.productDetailHeadingText();
		String expectedProductDetailHeading="Product Detail";
		try {
		Assert.assertEquals(actualProductDetailHeading,expectedProductDetailHeading);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		//Click AddToCArt
		acp.clickAddToCart();
		//Verify Shopping Cart page opend
		String actualShoppingCartHeading=acp.shoppingCartHeadingText();
		String expectedShoppingCartHeading="Your shopping cart";
		try {
		Assert.assertEquals(actualShoppingCartHeading,expectedShoppingCartHeading);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		//Go Back to product page to view another item
		driver.findElement(By.xpath(PRODUCT_A)).click();
		
		
	}
	catch(Exception e) {
		System.out.println(" This product is not available");
	}
	}
	}
}
