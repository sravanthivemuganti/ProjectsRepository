package com.magento.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExportOrdersToCSVFilePage implements ExportOrdersToCSVFileConstant {

	@FindBy(id = USER_ID_LOCATOR)
	WebElement userNameElem;
	@FindBy(id = PASSSWORD_ID_LOCATOR)
	WebElement passwordElem;
	@FindBy(xpath = LOGIN_BUTTON_XPATH_LOCATOR)
	WebElement loginButtonElem;
	@FindBy(xpath = SALES_XPATH_LOCATOR)
	WebElement salesElem;
	@FindBy(xpath = ORDERS_XPATH_LOCATOR)
	WebElement ordersElem;
	@FindBy(xpath = EXPORT_XPATH_LOCATOR)
	WebElement exportElem;

	public ExportOrdersToCSVFilePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void setUserNmaeElem() {
		userNameElem.sendKeys(USERNAME);
	}

	public void setPasswordElem() {
		passwordElem.sendKeys(PASSWORD);
	}

	public void getLoginButtonClick() {
		loginButtonElem.click();
	}

	public void getSalesClick() {
		salesElem.click();
	}

	public void getOrdersClick() {
		ordersElem.click();
	}

	public void getExportClick() {
		exportElem.click();
	}
}
