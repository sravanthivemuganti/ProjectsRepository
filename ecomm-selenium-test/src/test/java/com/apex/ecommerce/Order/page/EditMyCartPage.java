package com.apex.ecommerce.Order.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.apex.ecommerce.Order.constant.AddEditDeleteCartConstant;
import com.apex.ecommerce.Order.constant.OrderConstant;
import com.apex.ecommerce.core.BaseEditDeleteProductPage;

public class EditMyCartPage extends BaseEditDeleteProductPage implements OrderConstant,AddEditDeleteCartConstant{

	public EditMyCartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath=QUANTITY_10002)
	WebElement quantity10002Elem;
	@FindBy(xpath=QUANTITY_10003)
	WebElement quantity10003Elem;
	@FindBy(xpath=QUANTITY_10004)
	WebElement quantity10004Elem;
	@FindBy(xpath=QUANTITY_10005)
	WebElement quantity10005Elem;
	@FindBy(xpath=QUANTITY_10009)
	WebElement quantity10009Elem;
	@FindBy(xpath=PRODUCT_EDIT_10002)
	WebElement editButton10002Elem;
	@FindBy(xpath=PRODUCT_EDIT_10003)
	WebElement editButton10003Elem;
	@FindBy(xpath=PRODUCT_EDIT_10004)
	WebElement editButton10004Elem;
	@FindBy(xpath=PRODUCT_EDIT_10005)
	WebElement editButton10005Elem;
	@FindBy(xpath=PRODUCT_EDIT_10009)
	WebElement editButton10009Elem;
	@FindBy(xpath=UPDATE_MESSAGE_XPATH_LOCATOR)
	WebElement updateMessageTextElem;
	
	public void editProducts() {
		
		
	}
	
	public String quantityText(String productId) {
		
	String quantityPath=QUANTITY_XPATH_LOCATOR1+productId+QUANTITY_XPATH_LOCATOR2;
	System.out.println(quantityPath);
	return quantityPath;
	}
	public String editButtonClick(String productId) {
		String editPath=QUANTITY_XPATH_LOCATOR1+productId+QUANTITY_XPATH_LOCATOR2+EDITBUTTON_XPATH_LOCATOR;
		return editPath;
	}
	public String messageDisplayed() {
		String message=updateMessageTextElem.getText();
		return message;
	}
}
