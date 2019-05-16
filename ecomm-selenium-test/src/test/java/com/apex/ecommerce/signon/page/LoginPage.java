package com.apex.ecommerce.signon.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.apex.ecommerce.signon.constant.LoginConstant;

public class LoginPage implements LoginConstant {

	@FindBy(name = LoginConstant.EMAIL_NAME_LOCATOR)
	private WebElement emailElem;
	@FindBy(name = LoginConstant.PASSWORD_NAME_LOCATOR)
	private WebElement pwdElem;
	@FindBy(linkText = LoginConstant.LOGINBUTTON_LINKTEXT_LOCATOR)
	private WebElement loginBtnElem;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clckOnLoginButton(String emailid, String password) {
		emailElem.sendKeys(emailid);
		pwdElem.sendKeys(password);
		loginBtnElem.click();
	}

	public void setUserName(String emailid) {
		emailElem.sendKeys(emailid);
	}

	public void setPassword(String password) {
		pwdElem.sendKeys(password);
	}

	public void clickSubmit() {
		loginBtnElem.click();
	}

}
