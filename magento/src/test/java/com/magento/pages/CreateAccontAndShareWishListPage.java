package com.magento.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.magento.constants.CreateAccontAndShareWishConstant;

public class CreateAccontAndShareWishListPage implements CreateAccontAndShareWishConstant{
	
	public CreateAccontAndShareWishListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath=ACCOUNT_MENU_XPATH_LOCATOR)
	WebElement accountMenuElem;
	@FindBy(linkText=MYACCOUNT_LINKTEXT_LOCATOR)
	WebElement myAccountElem;
	@FindBy(xpath=CREATE_AN_ACCOUNT_XPATH_LOCATOR)
	WebElement createAnAccountElem;
	@FindBy(id=FIRSTNAME_ID_LOCATOR)
	WebElement firstNameElem;
	@FindBy(id=MIDDLENAME_ID_LOCATOR)
	WebElement midleNameElem;
	@FindBy(id=LASTNAME_ID_LOCATOR)
	WebElement lastNameElem;
	@FindBy(id=EMAILADDRESS_ID_LOCATOR)
	WebElement emailAddressElem;
	@FindBy(id=PASSWORD_ID_LOCATOR)
	WebElement passwordElem;
	@FindBy(id=CONFIRM_PASSWORD_ID_LOCATOR)
	WebElement confirmPasswordElem;
	@FindBy(id=NEWSLETTER_ID_LOCATOR)
	WebElement newsLetterCheckboxElem;
	@FindBy(xpath=REGISTER_BUTTON_XPATH_LOCATOR)
	WebElement registerButtonElem;

//wishlist
	@FindBy(linkText=LOGIN_LINKTEXT_LOCATOR)
	WebElement loginLinkElem;
	@FindBy(xpath=LOGIN_EMAIL_XPATH_LOCATOR)
	WebElement emailAddressLoginElem;
	@FindBy(xpath=LOGIN_PASSWORD_XPATH_LOCATOR)
	WebElement passwordLoginElem;
	@FindBy(xpath=LOGIN_BUTTON_XPATH_LOCATOR)
	WebElement loginButtonElem;
	@FindBy(linkText=TV_MENU_LINKTEXT_LOCATOR)
	WebElement tvlinkElem;
	@FindBy(xpath=LGLCD_ADDTO_WISHLIST_XPATH_LOCATOR)
	WebElement lgLcdAddToWishListLinkElem;
	@FindBy(xpath=SHARE_WISHLIST_XPATH_LOCATOR)
	WebElement shareWishListButtonElem;
	@FindBy(xpath=SHARE_EMAIL_ADDRESSES_XPATH_LOCATOR)
	WebElement shareEmailAddressesTextAreaElem;
	@FindBy(xpath=SHARE_WISHLIST_MESSAGE_XPATH_LOCATOR)
	WebElement shareWishListMessageTextAreaElem;
	@FindBy(xpath=SHARE_EMAIL_SHAREWISHLIST_BUTTON_XPATH_LOCATOR)
	WebElement shareEmailShareWishListButtonElem;
	@FindBy(xpath=SHARE_WISHLIST_SUCCESS_MESSAGE_XPATH_LOCATOR)
	WebElement shareWishListSuccessMessageElem;
	
	public void accountMenuClick() {
		accountMenuElem.click();
	}
	public void myAccountClick() {
		myAccountElem.click();
	}
	public void createAnAccountClick() {
		createAnAccountElem.click();
	}
	public void firstNameText() {
		firstNameElem.sendKeys("Sravanthi");
	}
	public void middleNameText() {
		midleNameElem.sendKeys("Goda");
	}
	public void lastNameText() {
		lastNameElem.sendKeys("Vemuganti");
	}
	public void emailAddressText() {
		emailAddressElem.sendKeys("vgs.godha@gmail.com");
	}
	public void passwordText() {
		passwordElem.sendKeys("vgsgodha");
	}
	public void confirmPasswordText() {
		confirmPasswordElem.sendKeys("vgsgodha");
	}
	public void newsLetterCheckBoxClick() {
		newsLetterCheckboxElem.click();
	}
	public void registerButtonClick() {
		registerButtonElem.click();
	}
	
//Wish List
	public void loginLinkClick() {
		loginLinkElem.click();
	}
	public void emailAddressLoginText() {
		emailAddressLoginElem.sendKeys("vgs.godha@gmail.com");		
	}
	public void passwordLoginText() {
		passwordLoginElem.sendKeys("vgsgodha");
	}
	public void loginButtonClick() {
		loginButtonElem.click();
	}
	public void tvLinClick() {
		tvlinkElem.click();
	}
	public void lgLcdAddToWishListClick() {
		lgLcdAddToWishListLinkElem.click();
	}
	public void shareWishListButtonClick() {
		shareWishListButtonElem.click();
	}
	public void shareEmailAddressTextArea() {
		shareEmailAddressesTextAreaElem.sendKeys("vgs.godha@gmail.com");
	}
	public void shareWishListMessageTextArea() {
		shareWishListMessageTextAreaElem.sendKeys("This product added in my wish list\n I am planning to buy.");
	}
	public void shareEmailWishListButtonClick() {
		shareEmailShareWishListButtonElem.click();
	}
	public String shareWishListSuccessMessageGetText() {
		String getTextToValidate=shareWishListSuccessMessageElem.getText();
		return getTextToValidate;
	}
}
