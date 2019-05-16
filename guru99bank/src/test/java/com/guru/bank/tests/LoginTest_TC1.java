package com.guru.bank.tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import com.guru.bank.basetest.BaseTest;
import com.guru.bank.pages.LoginPage;

public class LoginTest_TC1 extends BaseTest {
	
	@Test
	public void loginWithValidData() {
		LoginPage loginpage=new LoginPage(driver);
		loginpage.userIdText();
		loginpage.passwordText();
		loginpage.loginButtonClick();
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
				System.out.println("inside if");
		else {
			try {
				System.out.println("inside try");
		Alert alert=driver.switchTo().alert();
		alert.accept();
			}
			catch(Exception e) {
				System.out.println("inside catch");
			}
		}
//		try {
//			assertEquals(driver.getTitle(), "Guru99 Bank Manager HomePage");
//		}
//		catch (Exception e) {
//			e.printStackTrace();
//		}
	}

}
