package com.apex.testng.my_selenium_testng_tests;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EcommerceEditMyCart extends EcommerceBaseUserLogin implements EcommerceInterfaceConstant {

	@Test
	public void myCartEdit(){
		driver.findElement(By.xpath(MYCART_XPATH_LOCATOR)).click();
		Scanner input=new Scanner(System.in);
		System.out.print("Enter Number of products you want to Update: ");
		int numberOfproducts=input.nextInt();
		
		for(int i=1;i<=numberOfproducts;i++)
		{
			System.out.print("Enter ProductId: ");
			int productId=input.nextInt();
			
			try {
			String path="//input[starts-with(@name,'qty_"+productId+"')]";
			System.out.println(path);
			System.out.print("Enter number of quantities: ");
			int quantity=input.nextInt();
			driver.findElement(By.xpath(path)).clear();	
			driver.findElement(By.xpath(path)).sendKeys(""+quantity+"");			
			System.out.println(path+"/parent::td[@class='font']/preceding-sibling::td[@class='font_w']");
			driver.findElement(By.xpath(path+"/parent::td[@class='font']/preceding-sibling::td[@class='font_w']")).click();
			Assert.assertEquals(driver.findElement(By.xpath("//span[@class='msg']")).getText(), "Your basket has been updated");
			}
			catch(Exception e){
				System.out.println(productId+" This product is not in the list");
			}
		}
	}
	
}
