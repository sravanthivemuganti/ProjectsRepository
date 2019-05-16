package com.magento.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.magento.constants.DiscountCouponConstant;

public class DiscountCouponPage implements DiscountCouponConstant{

	public DiscountCouponPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText=MOBILE_LINKTEXT_LOCATOR)
	WebElement mobileLinkElem;
	@FindBy(xpath=IPHONE_ADDTOCART_XPATH_LOCATOR)
	WebElement iphoneAddtoCartElem;
	@FindBy(id=DISCOUNT_COUPON_ID)
	WebElement discountCouponElem;
	@FindBy(xpath=DISCOUNT_COUPON_APPLY_XPATH_LOCATOR)
	WebElement discountCouponApplyElem;
	@FindBy(xpath=SUBTOTAL_XPATH_LOCATOR)
	WebElement subtotalElem;
	@FindBy(xpath=DISCOUNT_COUPON_APPLIED_PRICE)
	WebElement discountPriceElem;
	public void getMobileLinkClick() {
		mobileLinkElem.click();
	}
	public void getIphoneAddtoCartClick() {
		iphoneAddtoCartElem.click();
	}
	public void setDiscountCouponValue() {
		discountCouponElem.clear();
		discountCouponElem.sendKeys("GURU50");
	}
	public void getDiscountCouponApplyclick() {
		discountCouponApplyElem.click();
	}
	public Float getSubtotalValue() {
		Float subTotal=Float.parseFloat(subtotalElem.getText().substring(1));
		return subTotal;
	}
	public Float getDiscountPriceValue() {
		Float discountPrice=Float.parseFloat(discountPriceElem.getText().substring(2));
		return discountPrice;
	}
	
	
}
