package com.magento.constants;

public interface ChangeOrReorderPreviouslyAddedProductConstant {

	public static final String REORDER_XPATH_LOCATOR="//td[@class='number' and contains(text(),'100009342')]/parent::tr/td[6]/span/a[2]";
	public static final String QUANTITY_XPATH_LOCATOR="//input[@title='Qty']";
	public static final String UPDATE_XPATH_LOCATOR="//button[@title='Update']";
	public static final String GRANDTOTAL_XPATH_LOCATOR="//td/strong/span[@class='price']";
	public static final String PROCEED_TO_CHECKOUT_XPATH_LOCATOR="//button[@title='Proceed to Checkout']";
	public static final String BILLING_INFO_CONTINUE_XPATH_LOCATOR="//button[@title='Continue']";
	public static final String SHIPPING_METHOD_CONTINUE_XPATH_LOCATOR="//div[@id='shipping-method-buttons-container']/button";
	public static final String CHECK_MONEYORDER_RADIOBUTTON_XPATH_LOCATOR="//input[@id='p_method_checkmo']";
	public static final String PAYMENT_CONTINUE_XPATH_LOCATOR="//div[@id='payment-buttons-container']/button[@type='button']";
	public static final String PLACE_ORDER_BUTTON_XPATH_LOCATOR="//button[@title='Place Order']";
	public static final String ORDER_NUMBER_XPATH_LOCATOR="//p[contains(text(),'Your order')]/a";
}
