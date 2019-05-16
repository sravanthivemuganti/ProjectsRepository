package com.apex.ecommerce.Order;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.apex.ecommerce.Order.constant.OrderConstant;
import com.apex.ecommerce.Order.page.EditMyCartPage;
import com.apex.ecommerce.core.BaseEditDeleteProductPage;

public class EditMyCartTest extends BaseEditDeleteProductPage implements OrderConstant {

	@Test
	public void editMyCart() {
		EditMyCartPage edircartpage=new EditMyCartPage(driver);
		Scanner input=new Scanner(System.in);
		System.out.print("Enter Number of products you want to Update: ");
		int numberOfproducts=input.nextInt();
		
		for(int i=1;i<=numberOfproducts;i++)
		{
			System.out.print("Enter ProductId: ");
			String productId=input.next();
			
			try {
				String quantityPath=edircartpage.quantityText(productId);
				driver.findElement(By.xpath(quantityPath)).clear();
				driver.findElement(By.xpath(quantityPath)).sendKeys("50");
				String editPath=edircartpage.editButtonClick(productId);
				driver.findElement(By.xpath(editPath)).click();
				String actualMessage=edircartpage.messageDisplayed();
				String expectedMessage="Your basket has been updated";
				Assert.assertEquals(actualMessage, expectedMessage);
			}
			catch (Exception e) {
				System.out.println(productId+" This product is not in the list");
			}
		}
	}
}
