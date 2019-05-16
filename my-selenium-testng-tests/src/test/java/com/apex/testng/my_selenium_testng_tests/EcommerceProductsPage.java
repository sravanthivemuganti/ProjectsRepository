package com.apex.testng.my_selenium_testng_tests;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EcommerceProductsPage extends EcommerceBaseUserLogin implements EcommerceInterfaceConstant {
	
	@Test
	public void productTab() {
		driver.findElement(By.xpath(PRODUCT_A)).click();
		driver.findElement(By.xpath(DELL19R_VIEWITEM_XPATH)).click();
		driver.findElement(By.xpath(DEll19R_ADDTOCART_XPATH)).click();
		driver.findElement(By.xpath(DEll19R_CHECKOUT_XPATH)).click();
		driver.findElement(By.xpath(CHECKOUT_CONFIRM_XPATH)).click();

		//2 Postage
		driver.findElement(By.xpath(CHECKOUT_CONFIRM_HOUSENO_XPATH)).sendKeys("1234");
		driver.findElement(By.xpath(CHECKOUT_CONFIRM_STREET_XPATH)).sendKeys("Palm Ave");
		driver.findElement(By.xpath(CHECKOUT_CONFIRM_CITY_XPATH)).sendKeys("Fremont");
		driver.findElement(By.xpath(CHECKOUT_CONFIRM_CODE_XPATH)).sendKeys("123456");
		driver.findElement(By.xpath(CHECKOUT_CONFIRM_STATE_XPATH)).sendKeys("CA");
		driver.findElement(By.xpath(CHECKOUT_CONFIRM_COUNTRY_XPATH)).sendKeys("US");
		driver.findElement(By.xpath(CHECKOUT_CONFIRM_UPDATE_BUTTON_XPATH)).click();
		driver.findElement(By.xpath(CHECKOUT_CONFIRM_SHIPPINGMETHOD_XPATH)).click();
		driver.findElement(By.xpath(CHECKOUT_CONFIRM_CONTINUE_XPATH)).click();
		
		//3 Pay
		driver.findElement(By.xpath(CHECKOUT_CONFIRM_HOUSENO_XPATH)).sendKeys("1234");
		driver.findElement(By.xpath(CHECKOUT_CONFIRM_STREET_XPATH)).sendKeys("Palm Ave");
		driver.findElement(By.xpath(CHECKOUT_CONFIRM_CITY_XPATH)).sendKeys("Fremont");
		driver.findElement(By.xpath(CHECKOUT_CONFIRM_CODE_XPATH)).sendKeys("123456");
		driver.findElement(By.xpath(CHECKOUT_CONFIRM_STATE_XPATH)).sendKeys("CA");
		driver.findElement(By.xpath(CHECKOUT_CONFIRM_COUNTRY_XPATH)).sendKeys("US");
		driver.findElement(By.xpath(CHECKOUT_CONFIRM_UPDATE_BUTTON_XPATH)).click();
		driver.findElement(By.xpath(CHECKOUT_CONFIRM_CONTINUE_XPATH)).click();
		driver.findElement(By.xpath(CHECKOUT_CONFIRM_DISCOUNTCODE_XPATH)).sendKeys("DC10");
		driver.findElement(By.xpath(CHECKOUT_CONFIRM_CONTINUE_XPATH)).click();
		driver.findElement(By.xpath(WISHLIST_SUBMIT_CONSTANT)).click();	
	}
}
