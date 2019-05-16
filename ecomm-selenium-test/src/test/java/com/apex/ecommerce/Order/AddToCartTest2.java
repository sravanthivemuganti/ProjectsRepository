package com.apex.ecommerce.Order;

import java.util.Scanner;

import org.testng.annotations.Test;
import com.apex.ecommerce.Order.page.AddToCartPage2;
import com.apex.ecommerce.core.BaseProductPage;

public class AddToCartTest2 extends BaseProductPage {

	@Test
	public void successAddToCart() {

		AddToCartPage2 acp = new AddToCartPage2(driver);
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Number of products you want to add: ");
		int numberOfproducts = input.nextInt();
		acp.viewItemClick(numberOfproducts);
	}
}
