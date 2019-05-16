package com.apex.ecommerce.signon.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.apex.ecommerce.signon.constant.LostPasswordConstant;

public class LostPasswordPage implements LostPasswordConstant{
	public LostPasswordPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath=LOSTPASSWORD_XPATH_LOCATOR)
	public WebElement clickLostPasswordElem;
	@FindBy(xpath=LostPasswordConstant.EMAIL_XPATH_LOCATOR)
	private WebElement emailElem;
	@FindBy(xpath=LostPasswordConstant.SENDMAILBUTTON_XPATH_LOCATOR)
	private WebElement sendmailButtonElem;
	public void clicklostPassword() {
		clickLostPasswordElem.click();
	}
	public void setEmailId(String emailid) {
		emailElem.sendKeys(emailid);
	}
	public void clickSendMailButton() {
		sendmailButtonElem.click();
	}

}
