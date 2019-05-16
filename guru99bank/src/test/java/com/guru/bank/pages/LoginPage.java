package com.guru.bank.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.guru.bank.constants.LoginConstant;

public class LoginPage implements LoginConstant{

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);	
	}
	@FindBy(name=USER_ID_NAME_LOCATOR)
	WebElement userIdTextElem;
	@FindBy(name=PASSWORD_NAME_LOCATOR)
	WebElement passwordTextElem;
	@FindBy(name=LOGIN_BUTTON_NAME_LOCATOR)
	WebElement loginbuttonElem;
	
	public void userIdText() {
		userIdTextElem.sendKeys("mngr190100");
	}
	public void passwordText() {
		passwordTextElem.sendKeys("eunurY");
	}
	public void loginButtonClick() {
		loginbuttonElem.click();
	}
}
