package com.apex.ecommerce.Order.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.apex.ecommerce.Order.constant.OrderConstant;
import com.apex.ecommerce.core.BaseEditDeleteProductPage;

public class DeleteMyCartPage extends BaseEditDeleteProductPage implements OrderConstant {
	public DeleteMyCartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath=DELETE_MESSAGE_XPATH_LOCATOR)
	WebElement deleteMessageTextElem;
			
	public String deleteButtonClick(String productId) {
		String deletePath=QUANTITY_XPATH_LOCATOR1+productId+QUANTITY_XPATH_LOCATOR2+DELETEBUTTON_XPATH_LOCATOR;
		return deletePath;
	}
	public String messageDisplayed() {
		String message=deleteMessageTextElem.getText();
		return message;
	}	
}
