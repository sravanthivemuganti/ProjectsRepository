package com.magento.constants;

public interface PurchaseProductConstant {
	public static final String BASEURL="http://live.guru99.com/";
	public static final String ACCOUNT_MENU_XPATH_LOCATOR="//a[@data-target-element='#header-account']";
	public static final String MYACCOUNT_LINKTEXT_LOCATOR="My Account";
	public static final String EMAIL_ADDRESS_XPATH_LOCATOR="//input[@name='login[username]']";
	public static final String PASSWORD_XPATH_LOCATOR="//input[@name='login[password]']";
	public static final String LOGIN_BUTTON_XPATH_LOCATOR="//button[@name='send']";
	public static final String MYWISHLIST_XPATH_LOCATOR="//*[@id=\"top\"]/body/div/div/div[2]/div/div[1]/div/div[2]/ul/li[8]/a";
	public static final String ADDTOCART_XPATH_LOCATOR="//button[@title='Add to Cart']";
	public static final String ESTIMATE_COUNTRY_ID_LOCATOR="country";
	public static final String ESTIMATE_REGION_ID_LOCATOR="region";
	public static final String ESTIMATE_POSTCODE_ID_LOCATOR="postcode";
	public static final String ESTIMATE_BUTTON_XPATH_LOCATOR="//button[@title='Estimate']";
	public static final String FIXED_RATE_XPATH_LOCATOR="//input[@name='estimate_method']/parent::li/label/span";
	public static final String FIXED_RATE_RADIOBUTTON_XPATH_LOCATOR="//input[@name='estimate_method']";
	public static final String UPDATE_TOTAL_BUTTON_XPATH_LOCATOR="//button[@title='Update Total']";
	public static final String SUBTOTAL_XPATH_LOCATOR="//td[contains(text(),'Subtotal')]/following-sibling::td/span";
	public static final String GRAND_TOTAL_XPATH_LOCATOR="//strong[contains(text(),'Grand Total')]/parent::td/following-sibling::td/strong/span";
	public static final String SHIPPING_RATE_XPATH_LOCATOR="//table[@id='shopping-cart-totals-table']/tbody/tr[2]/td[2]/span";
	public static final String PROCEEDTO_CHECKOUT_XPATH_LOCATOR="//button[@title='Proceed to Checkout']";
	
	public static final String SELECT_BILLING_ADDRESS_XPATH_LOCATOR="//select[@id='billing-address-select']";
	public static final String ADDRESS_XPATH_LOCATOR="//input[@id='billing:street1']";
	public static final String CITY_XPATH_LOCATOR="//input[@id='billing:city']";
	public static final String STATE_XPATH_LOCATOR="//Select[@id='billing:region_id']";
	public static final String POSTCODE_XPATH_LOCATOR="//input[@id='billing:postcode']";
	public static final String COUNTRY_XPATH_LOCATOR="//select[@id='billing:country_id']";
	public static final String TELEPHONE_XPATH_LOCATOR="//input[@id='billing:telephone']";
	public static final String BILLING_CONTINUE_XPATH_LOCATOR="//button[@title='Continue']";
	public static final String SHIPPING_METHOD_CONTINUE_XPATH_LOCATOR="//div[@id='shipping-method-buttons-container']/button";
	public static final String CHECK_MONEYORDER_RADIOBUTTON_XPATH_LOCATOR="//input[@id='p_method_checkmo']";
	public static final String PAYMENT_INFORMATION_CONTINUE_XPATH_LOCATOR="//div[@id='payment-buttons-container']/button";
	public static final String PLACE_ORDER_BUTTON_XPATH_LOCATOR="//button[@title='Place Order']";
	public static final String ORDER_RECEIVED_MESSGAE_XPATH_LOCATOR="//div/h1";
	public static final String GENERATED_ORDER_NUMBER_XPATH_LOCATOR="//p[contains(text(),'Your order # is: ')]/a";

}
