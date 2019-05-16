package com.apex.ecommerce.signon;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.apex.ecommerce.core.ApexBaseTest;
import com.apex.ecommerce.signon.constant.LoginConstant;
import com.apex.ecommerce.signon.page.LoginPage;
import com.thoughtworks.selenium.webdriven.commands.IsElementPresent;

public class LoginTest extends ApexBaseTest implements LoginConstant {

	@Test
	public void testSuccessLogon() {
		// create the page pass the driver
		LoginPage loginpage = new LoginPage(driver);
		// perform action
		loginpage.clckOnLoginButton("vgs_godha@gmail.com", "vgs");
		// validate
		String expectedMessage="Ez Shop Online";
		String actualMessage=driver.getTitle();
		Assert.assertEquals(actualMessage, expectedMessage);
	}
	@Test
	public void testBlankUserIdAndPassword() {
		LoginPage loginpage = new LoginPage(driver);
		loginpage.setUserName("");
		loginpage.setPassword("");
		loginpage.clickSubmit();
		//loginpage.clckOnLoginButton("", "");
		String expectedMessage="Invalid Username / Password!";
		String actualMessage=driver.findElement(By.xpath(INVALIDMESSAGE_XPATH_LOCATOR)).getText();
		Assert.assertEquals(actualMessage, expectedMessage);
	}
	@Test
	public void testBlankUserId() {
		LoginPage loginpage = new LoginPage(driver);
		loginpage.setUserName("");
		loginpage.setPassword("vgs");
		loginpage.clickSubmit();
		String expectedMessage="Invalid Username / Password!";
		String actualMessage=driver.findElement(By.xpath(INVALIDMESSAGE_XPATH_LOCATOR)).getText();
		Assert.assertEquals(actualMessage, expectedMessage);
	}

	@Test
	public void testBlankPwd() {
		LoginPage loginpage = new LoginPage(driver);
		loginpage.setUserName("vgs_godha@gmail.com");
		loginpage.setPassword("");
		loginpage.clickSubmit();
		String expectedMessage="Invalid Username / Password!";
		String actualMessage=driver.findElement(By.xpath(INVALIDMESSAGE_XPATH_LOCATOR)).getText();
		Assert.assertEquals(actualMessage, expectedMessage);
	}

	@Test
	public void maskPassword() {
		LoginPage loginpage=new LoginPage(driver);
		loginpage.setUserName("vgs_godha@gmail.com");
		loginpage.setPassword("vgs");
		WebElement pwdElem=driver.findElement(By.name(PASSWORD_NAME_LOCATOR));				
		boolean isEncrypted=pwdElem.getAttribute("type").equals("password");
		System.out.println(isEncrypted);
	}
}
