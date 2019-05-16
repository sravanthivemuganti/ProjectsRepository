package com.apex.testng.my_selenium_testng_tests;

import java.awt.event.ActionEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EcommerceWishList extends EcommerceBaseClass implements EcommerceInterfaceConstant{

	@Test
	public void myWishList() {
		driver.findElement(By.name(EMAIL_CONSTANT)).sendKeys("vgs_godha@gmail.com");
		driver.findElement(By.name(PASSWORD_CONSTANT)).sendKeys("vgs");
		driver.findElement(By.linkText(LOGIN_CLICK_CONSTANT)).click();
		Actions action=new Actions(driver);
		WebElement we=driver.findElement(By.xpath("//a[@href='changeaccountinfo.php']"));
		action.moveToElement(we).build().perform();
		driver.findElement(By.xpath("//a[@href='mywishlist.php']")).click();
	
		driver.findElement(By.xpath(FRNDEMAIL_CONSTANT)).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath(FRNDNAME_CONSTANT)).sendKeys("abc");
		driver.findElement(By.xpath(WISHLIST_SUBMIT_CONSTANT)).click();
		Assert.assertEquals(driver.findElement(By.xpath(MESSAGE_SENT_CONSTANT)).getText(), "Email has been sent");
		
	}
	
}
