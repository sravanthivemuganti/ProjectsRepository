package com.magento.BaseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountBasePage extends MagentoBaseTest implements MyAccountBaseConstant{

	
	@FindBy(xpath=ACCOUNT_MENU_XPATH_LOCATOR)
	WebElement accountLinkElem;
	@FindBy(linkText=MYACCOUNT_LINKTEXT_LOCATOR)
	WebElement myAccountLinkElem;
	@FindBy(xpath=EMAIL_ADDRESS_XPATH_LOCATOR)
	WebElement emailAddressElem;
	@FindBy(xpath=PASSWORD_XPATH_LOCATOR)
	WebElement passwordElem;
	@FindBy(xpath=LOGIN_BUTTON_XPATH_LOCATOR)
	WebElement loginButtonElem;
	
	
	public void getAccountLinkClick() {
		accountLinkElem.click();
	}
	public void getMyAccountLinkClick() {
		myAccountLinkElem.click();
	}
	public void setEmailAddress() {
		emailAddressElem.sendKeys("vgs_godha@gmail.com");
	}
	public void setPassword() {
		passwordElem.sendKeys("sravanthi");
	}
	public void getLoginButtonClick() {
		loginButtonElem.click();
	}
}
