package com.apex.ecommerce.signon;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.apex.ecommerce.core.ApexBaseTest;
import com.apex.ecommerce.signon.constant.LostPasswordConstant;
import com.apex.ecommerce.signon.page.LostPasswordPage;

import junit.framework.Assert;

public class LostPasswordTest extends ApexBaseTest implements LostPasswordConstant {
	/*--- Missing @ symbol in email---*/
	@Test
	public void lostPasswordMissingAtSymbol() {
	LostPasswordPage lostpasspage=new LostPasswordPage(driver);
	lostpasspage.clicklostPassword();
	lostpasspage.setEmailId("aashugmail.com");
	lostpasspage.clickSendMailButton();
	Alert alert=driver.switchTo().alert();
	Assert.assertEquals("Email must contain a Valid E-Mail address.\n", alert.getText());
	alert.accept();
	}
	
	/*--- Missing .(dot) symbol in email---*/
	@Test
	public void lostPasswordMissingDot() {
		LostPasswordPage lostpasspage=new LostPasswordPage(driver);
		lostpasspage.clicklostPassword();
		lostpasspage.setEmailId("aashu@gmailcom");
		lostpasspage.clickSendMailButton();
		Alert alert=driver.switchTo().alert();
		Assert.assertEquals("Email must contain a Valid E-Mail address.\n", alert.getText());
		alert.accept();
	}
	
	/*--- Invalid email which is not in the database---*/
	@Test
	public void lostPasswordInValidEmailId() {
		LostPasswordPage lostpasspage=new LostPasswordPage(driver);
		lostpasspage.clicklostPassword();
		lostpasspage.setEmailId("login@gmail.com");
		lostpasspage.clickSendMailButton();
		String actual=driver.findElement(By.xpath(ERRORMESSAGE_XPATH_LOCATOR)).getText();
		String expected="This email address wasn't found in our database you can create a new account if you wish by clicking the ACCOUNT button in the main menu.";
		Assert.assertEquals(actual, expected);
	}
	
	/*--- Valid email---*/
	@Test
	public void lostPasswordValidEmailId() {
		LostPasswordPage lostpasspage=new LostPasswordPage(driver);
		lostpasspage.clicklostPassword();
		lostpasspage.setEmailId("aashu@gmail.com");
		lostpasspage.clickSendMailButton();
		Assert.assertEquals(driver.getTitle(), "Ez Shop Online");
	}
}
