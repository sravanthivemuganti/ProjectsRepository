package com.magento.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.magento.BaseTest.MyAccountBaseConstant;
import com.magento.BaseTest.MyAccountBasePage;
import com.magento.constants.ChangeOrReorderPreviouslyAddedProductConstant;

public class ChangeOrReorderPreviouslyAddedProductPage extends MyAccountBasePage implements MyAccountBaseConstant,ChangeOrReorderPreviouslyAddedProductConstant{

	public ChangeOrReorderPreviouslyAddedProductPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath=REORDER_XPATH_LOCATOR)
	WebElement reOrderElem;
	@FindBy(xpath=QUANTITY_XPATH_LOCATOR)
	WebElement quantityElem;
	@FindBy(xpath=UPDATE_XPATH_LOCATOR)
	WebElement updateElem;
	@FindBy(xpath=GRANDTOTAL_XPATH_LOCATOR)
	WebElement grandTotalElem;
	@FindBy(xpath=PROCEED_TO_CHECKOUT_XPATH_LOCATOR)
	WebElement proceedToChekoutElem;
	@FindBy(xpath=BILLING_INFO_CONTINUE_XPATH_LOCATOR)
	WebElement billingInfoContinueElem;
	@FindBy(xpath=SHIPPING_METHOD_CONTINUE_XPATH_LOCATOR)
	WebElement shippingMethodContinueElem;
	@FindBy(xpath=CHECK_MONEYORDER_RADIOBUTTON_XPATH_LOCATOR)
	WebElement checkOrMoneyOrderElem;
	@FindBy(xpath=PAYMENT_CONTINUE_XPATH_LOCATOR)
	WebElement paymentContinueElem;
	@FindBy(xpath=PLACE_ORDER_BUTTON_XPATH_LOCATOR)
	WebElement placeOderElem;
	@FindBy(xpath=ORDER_NUMBER_XPATH_LOCATOR)
	WebElement orderNumberElem;
	
	public void getReOrderClick() {
		reOrderElem.click();
	}
	public void setQuantityValue() {
		quantityElem.clear();
		quantityElem.sendKeys("10");
	}
	public void getUpdateClick() {
		updateElem.click();
	}
	public String getGrandTotalValue() {
		return grandTotalElem.getText();
	}
	public void getProceedToChekoutClick() {
		proceedToChekoutElem.click();
	}
	public void getBillingInfoContinueClick() {
		billingInfoContinueElem.click();
	}
	public void getShippingMethodContinueClick() {
		shippingMethodContinueElem.click();
	}
	public void getCheckOrMoneyOrderRadioClick() {
		checkOrMoneyOrderElem.click();
	}
	public void getPaymentContinueClick() {
		paymentContinueElem.click();
	}
	public void getPlaceOderClick() {
		placeOderElem.click();
	}
	public String getOrderNumberValue() {
		return orderNumberElem.getText();
	}
}
