package com.apex.ecommerce.register;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.apex.ecommerce.core.ApexBaseTest;
import com.apex.ecommerce.register.constant.RegisterConstant;
import com.apex.ecommerce.register.page.Registerpage;

public class RegisterTest extends RegisterBaseTest implements RegisterConstant {
	@Test
	public void testSuccessSignup()
			throws InterruptedException {
		Registerpage Regpage = new Registerpage(driver);
		Regpage.signupPage("M", "abhi", "vydhyala", "1", "2", "2000", "abhi@gamil.com", "211", "street", "town", "county", "country", "postcode",
				"34343434", "244343", "aaa", "aaa", "0", "1");
		Assert.assertEquals(driver.getTitle(), "Ez Shop Online");
	}
	@Test
	public void testSignupAlreadyExistUser()
			throws InterruptedException {
		Registerpage Regpage = new Registerpage(driver);
		Regpage.signupPage("M", "aashritha", "vydhyala", "1", "2", "2000", "aashu@gamil.com", "211", "street", "town", "county", "country", "postcode",
				"34343434", "244343", "aaa", "aaa", "0", "1");
		Assert.assertEquals(driver.findElement(By.xpath(EXISTUSER_XPATH_LOCATOR)).getText(), "This email address is already registered.");
	}
	@Test
	public void testSignupCheckTermsandCondition()
			throws InterruptedException {
		Registerpage Regpage = new Registerpage(driver);
		Regpage.signupPage("M", "aashritha", "vydhyala", "1", "2", "2000", "aashu@gamil.com", "211", "street", "town", "county", "country", "postcode",
				"34343434", "244343", "aaa", "aaa", "0", "0");
		Assert.assertEquals(driver.findElement(By.xpath(ERRMESSAGEFOR_TERMSANDCONDITIONS_XPATH_LOCATOR)).getText(), "You must agree to the terms and conditions before you can sign up.");
	}
}
