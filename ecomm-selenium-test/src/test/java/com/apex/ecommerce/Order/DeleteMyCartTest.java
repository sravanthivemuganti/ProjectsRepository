package com.apex.ecommerce.Order;

import java.util.Scanner;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.apex.ecommerce.Order.constant.OrderConstant;
import com.apex.ecommerce.Order.page.DeleteMyCartPage;
import com.apex.ecommerce.core.BaseEditDeleteProductPage;

public class DeleteMyCartTest extends BaseEditDeleteProductPage implements OrderConstant {
	@Test
	public void deleteMyCart() {
		DeleteMyCartPage deletepage=new DeleteMyCartPage(driver);
		Scanner input=new Scanner(System.in);
		System.out.print("Enter Number of products you want to Update: ");
		int numberOfproducts=input.nextInt();
		
		for(int i=1;i<=numberOfproducts;i++)
		{
			System.out.print("Enter ProductId: ");
			String productId=input.next();
			try {
				String deletePath=deletepage.deleteButtonClick(productId);
				driver.findElement(By.xpath(deletePath)).click();
				Alert alert = driver.switchTo().alert();
				String actualAlertMessage=alert.getText();
				String expectedAlertMessage="Are you sure you want to remove this product from your cart";
				Assert.assertEquals(actualAlertMessage,expectedAlertMessage);
				alert.accept();
				String actualMessage=deletepage.messageDisplayed();
				String expectedMessage="Item has been deleted from your basket";
				Assert.assertEquals(actualMessage,expectedMessage);
				try {
				Assert.assertEquals(driver.findElement(By.xpath(EMPTYCART_MESSAGE_XPATH_LOCATOR)).getText(), "Your Cart is Empty");
				System.out.println("Cart is Empty");
				}
				catch (Exception e) {
					System.out.println("Cart is not empty");
				}
			}
			catch (Exception e) {
				System.out.println(productId + " This product is not in the list");
			}
		}
	}	
}
