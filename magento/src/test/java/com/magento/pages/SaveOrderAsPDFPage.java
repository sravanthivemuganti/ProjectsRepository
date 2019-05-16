package com.magento.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.magento.BaseTest.MyAccountBaseConstant;
import com.magento.BaseTest.MyAccountBasePage;
import com.magento.constants.SaveOrderAsPDFConstant;

public class SaveOrderAsPDFPage extends MyAccountBasePage implements SaveOrderAsPDFConstant{

	public SaveOrderAsPDFPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath=MYORDERS_XPATH_LOCATOR)
	WebElement myOrdersElem;
	@FindBy(xpath=ORDERS_NUMBER_XPATH_LOCATOR)
	WebElement orderNumberElem;
	@FindBy(xpath=ORDERS_NUMBER_STATUS_XPATH_LOCATOR)
	WebElement orderNumberStatusElem;
	@FindBy(xpath=VIEW_ORDERS_XPATH_LOCATOR)
	WebElement viewOrdersElem;
	@FindBy(xpath=PRINT_ORDERS_XPATH_LOCATOR)
	WebElement printOrdersElem;
	
	public void getMyOrdersClick() {
		myOrdersElem.click();
	}
	public String getOrderNumberValue() {
		return orderNumberElem.getText();
	}
	public String getOrderNumberStatusValue() {
		return orderNumberStatusElem.getText();
	}
	public void getViewOrdersClick() {
		viewOrdersElem.click();
	}
	public void getPrintOrdersClick() {
		printOrdersElem.click();
	}
	
	
}
