package com.magento.constants;

public interface DiscountCouponConstant {

	public static final String BaseURL="http://live.guru99.com/";
	public static final String MOBILE_LINKTEXT_LOCATOR="MOBILE";
	public static final String IPHONE_ADDTOCART_XPATH_LOCATOR="//a[contains(text(),'IPhone')]/parent::h2/parent::div/div[3]/button";
	public static final String DISCOUNT_COUPON_ID="coupon_code";
	public static final String DISCOUNT_COUPON_APPLY_XPATH_LOCATOR="//button[@title='Apply']";
	public static final String SUBTOTAL_XPATH_LOCATOR="//td[contains(text(),'Subtotal')]/following-sibling::td/span";
	public static final String DISCOUNT_COUPON_APPLIED_PRICE="//td[contains(text(),'Discount')]/following-sibling::td/span";
}
