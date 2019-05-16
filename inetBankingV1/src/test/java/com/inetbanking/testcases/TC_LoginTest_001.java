package com.inetbanking.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageobjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass {

	@Test
	public void loginTest() {
		driver.get(baseUrl);
		logger.info("URL is opened");
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Username Entered");
		lp.setPassword(password);
		logger.info("Password Entered");
		lp.clickSubmit();
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
			 Assert.assertTrue(true);
			 logger.info("Login test passed");
		}
		else
			{
			Assert.assertFalse(false);
			logger.warn("Login test failed");
			}
		
	}
}
