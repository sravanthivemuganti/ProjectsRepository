package com.magento.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.magento.constants.PurchaseProductConstant;

public class PurchaseProductPage implements PurchaseProductConstant{
	public PurchaseProductPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath=ACCOUNT_MENU_XPATH_LOCATOR)
	WebElement accountMenuElem;
	@FindBy(linkText=MYACCOUNT_LINKTEXT_LOCATOR)
	WebElement myAccountLinkElem;
	@FindBy(xpath=EMAIL_ADDRESS_XPATH_LOCATOR)
	WebElement loginEmailAddressElem;
	@FindBy(xpath=PASSWORD_XPATH_LOCATOR)
	WebElement loginpasswordAddressElem;
	@FindBy(xpath=LOGIN_BUTTON_XPATH_LOCATOR)
	WebElement loginButtonElem;
	@FindBy(xpath=MYWISHLIST_XPATH_LOCATOR)
	WebElement myWishListLinkElem;
	@FindBy(xpath=ADDTOCART_XPATH_LOCATOR)
	WebElement addToCartElem;
	@FindBy(id=ESTIMATE_COUNTRY_ID_LOCATOR)
	WebElement estimateCountryElem;
	@FindBy(id=ESTIMATE_REGION_ID_LOCATOR)
	WebElement estimateRegionElem;
	@FindBy(id=ESTIMATE_POSTCODE_ID_LOCATOR)
	WebElement estimatePostcodeElem;
	@FindBy(xpath=ESTIMATE_BUTTON_XPATH_LOCATOR)
	WebElement estimateButtonElem;
	@FindBy(xpath=FIXED_RATE_XPATH_LOCATOR)
	WebElement fixedRateElem;
	@FindBy(xpath=FIXED_RATE_RADIOBUTTON_XPATH_LOCATOR)
	WebElement fixedRateRadioButtonElem;
	@FindBy(xpath=UPDATE_TOTAL_BUTTON_XPATH_LOCATOR)
	WebElement updateTotalButtonElem;
	@FindBy(xpath=SUBTOTAL_XPATH_LOCATOR)
	WebElement subTotalElem;
	@FindBy(xpath=GRAND_TOTAL_XPATH_LOCATOR)
	WebElement grandTotalElem;
	@FindBy(xpath=SHIPPING_RATE_XPATH_LOCATOR)
	WebElement shippingRateElem;
	@FindBy(xpath=PROCEEDTO_CHECKOUT_XPATH_LOCATOR)
	WebElement proceedToCheckoutElem;
	@FindBy(xpath=SELECT_BILLING_ADDRESS_XPATH_LOCATOR)
	WebElement selectBillingAddressElem;
	@FindBy(xpath=ADDRESS_XPATH_LOCATOR)
	WebElement addressElem;
	@FindBy(xpath=CITY_XPATH_LOCATOR)
	WebElement cityElem;
	@FindBy(xpath=STATE_XPATH_LOCATOR)
	WebElement stateElem;
	@FindBy(xpath=POSTCODE_XPATH_LOCATOR)
	WebElement postCodeElem;
	@FindBy(xpath=COUNTRY_XPATH_LOCATOR)
	WebElement countryElem;
	@FindBy(xpath=TELEPHONE_XPATH_LOCATOR)
	WebElement telephoneElem;
	@FindBy(xpath=BILLING_CONTINUE_XPATH_LOCATOR)
	WebElement billingContinueButoonElem;
	@FindBy(xpath=SHIPPING_METHOD_CONTINUE_XPATH_LOCATOR)
	WebElement shippingMethodContinueElem;
	@FindBy(xpath=CHECK_MONEYORDER_RADIOBUTTON_XPATH_LOCATOR)
	WebElement checkMoneorderRadioButtonElem;
	@FindBy(xpath=PAYMENT_INFORMATION_CONTINUE_XPATH_LOCATOR)
	WebElement paymentInformationContinueButtonElem;
	@FindBy(xpath=PLACE_ORDER_BUTTON_XPATH_LOCATOR)
	WebElement placeOrderButtonElem;
	@FindBy(xpath=ORDER_RECEIVED_MESSGAE_XPATH_LOCATOR)
	WebElement orderReceivedMessageElem;
	@FindBy(xpath=GENERATED_ORDER_NUMBER_XPATH_LOCATOR)
	WebElement generatedOrderNumberElem;
	
	public void accountMenuClick() {
		accountMenuElem.click();
	}
	public void myAccountCick() {
		myAccountLinkElem.click();
	}
	public void setEmailAddressText() {
		loginEmailAddressElem.sendKeys("vgs_godha@gmail.com");
	}
	public void setPasswordText() {
		loginpasswordAddressElem.sendKeys("sravanthi");
	}
	public void loginButtonClick() {
		loginButtonElem.click();
	}
	public void myWishListClick() {
		myWishListLinkElem.click();
	}
	public void addToCartClick() {
		addToCartElem.click();
	}
	public void estimateCountrySelect() {
		new Select(estimateCountryElem).selectByIndex(233);
	}
	public void estimateRegionSelect() {
		//new Select(estimateRegionElem).selectByIndex(12);
		estimateRegionElem.sendKeys("California");
	}
	public void estimatePostcodeText() {
		estimatePostcodeElem.sendKeys("542896");
	}
	public void estimateButtonClick() {
		estimateButtonElem.click();
	}
	public String fixedRateValue() {
		String fixedrate=fixedRateElem.getText();
		return fixedrate;
	}
	public void fixedRateRadioButtonClick() {
		fixedRateRadioButtonElem.click();
	}
	public void updateTotalButtonClick() {
		updateTotalButtonElem.click();
	}
	public Float subTotalValue() {
		String subtotal=subTotalElem.getText();
		Float subtotalFloat=Float.parseFloat(subtotal.substring(1));
		return subtotalFloat;
	}
	public Float grandTotalValue() {
		String grandTotal=grandTotalElem.getText();
		Float grandTotalFloat=Float.parseFloat(grandTotal.substring(1));
		return grandTotalFloat;
	}
	public Float getShippingRateValue() {
		String shippingRate=shippingRateElem.getText();
		Float shippingRateFloat=Float.parseFloat(shippingRate.substring(1));
		return shippingRateFloat;
	}
	public void proceedToCheckoutClick() {
		proceedToCheckoutElem.click();
	}

	public void  selectBillingAddress() {
		new Select(selectBillingAddressElem).selectByVisibleText("New Address");
	}
	public void  setAddressValue() {
		addressElem.clear();
		addressElem.sendKeys("ABC");
	}
	public void  setCityValue() {
		cityElem.clear();
		cityElem.sendKeys("New York");
	}
	public void  setStateValue() {
		Select state=new Select(stateElem);
		state.selectByVisibleText("New York");
	}
	public void  setPostCodeValue() {
		postCodeElem.clear();
		postCodeElem.sendKeys("542896");
	}
	public void  setCountryValue() {
		Select country=new Select(countryElem);
		country.selectByVisibleText("United States");
	}
	public void  setTelephoneValue() {
		telephoneElem.clear();
		telephoneElem.sendKeys("12345678");
	}
	public void  billingContinueButtonClick() {
		billingContinueButoonElem.click();
	}
	public void  shippingMethodContinueButtonClick() {
		shippingMethodContinueElem.click();
	}
	public void  checkMoneorderRadioButtonClick() {
		checkMoneorderRadioButtonElem.click();
	}
	public void  paymentInformationContinueButtonClick() {
		paymentInformationContinueButtonElem.click();
	}
	public void  placeOrderButtonClick() {
		placeOrderButtonElem.click();
	}
	public String  getOrderreceivedMessage() {
	String receivedMessage=orderReceivedMessageElem.getText();
	return receivedMessage;
	}
	public String  getGenerateOrderNumber() {
		String orderNumber=generatedOrderNumberElem.getText();
		return orderNumber;
	}
}
