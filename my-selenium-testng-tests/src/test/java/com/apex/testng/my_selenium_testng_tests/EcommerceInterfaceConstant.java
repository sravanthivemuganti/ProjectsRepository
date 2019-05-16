package com.apex.testng.my_selenium_testng_tests;

public interface EcommerceInterfaceConstant {
// Login
	String LOGIN_CLICK_CONSTANT = "Login";
	String PASSWORD_CONSTANT = "password";
	String EMAIL_CONSTANT = "email";
	
// Signup page Constants
	public static final String CONTINUE_CONSTANT = "continue";
	public static final String NEWSLETTER_CONSTANT = "newsletter";
	public static final String TERMS_CONSTANT = "terms";
	public static final String SUBMIT_CONSTANT = "Submit";
	public static final String CPASSWORD_CONSTANT = "cpassword";
	public static final String PASSWORD_SIGNUP_CONSTANT = "password";
	public static final String FAX_CONSTANT = "fax";
	public static final String PHONE_CONSTANT = "phone";
	public static final String POSTCODE_CONSTANT = "postcode";
	public static final String COUNTRY_CONSTANT = "country";
	public static final String STATE_CONSTANT = "state";
	public static final String CITY_CONSTANT = "city";
	public static final String ADD1_CONSTANT = "add1";
	public static final String HOUSENO_CONSTANT = "houseno";
	public static final String EMAIL_SIGNUP_CONSTANT = "email";
	public static final String YEAR_CONSTANT = "year";
	public static final String MONTH_CONSTANT = "month";
	public static final String DAY_CONSTANT = "day";
	public static final String LNAME_CONSTANT = "lname";
	public static final String FNAME_CONSTANT = "fname";
	public static final String EXISTUSER_XPATH_LOCATOR = "//span[@class='msg']";
	public static final String ERRMESSAGEFOR_TERMSANDCONDITIONS_XPATH_LOCATOR = "//span[@class='msg']";
	
	
// MywishList
	public static final String FRNDEMAIL_CONSTANT="//input[@name='frndemail']";
	public static final String FRNDNAME_CONSTANT="//input[@name=\"frndname\"]";
	public static final String WISHLIST_SUBMIT_CONSTANT="//input[@name='Submit']";
	public static final String MESSAGE_SENT_CONSTANT="//span[@class='msg']";

//Products tab
	public static final String PRODUCT_A="//a[contains(text(),'PRODUCTS')]";
	public static final String DELL19R_VIEWITEM_XPATH="//*[@id=\"rightcontent\"]/p[2]/a/img";
	public static final String DEll19R_ADDTOCART_XPATH="//input[@value='Add to Cart']";
	public static final String DEll19R_CHECKOUT_XPATH="//div[contains(text(),'Checkout')]";
	public static final String CHECKOUT_CONFIRM_XPATH="//img[@src='images/continue.gif']";
	public static final String CHECKOUT_CONFIRM_SHIPPINGMETHOD_XPATH="//input[@name='shipopt' and @value=2]";
	
	public static final String CHECKOUT_CONFIRM_HOUSENO_XPATH="//input[@name='houseno']";
	public static final String CHECKOUT_CONFIRM_STREET_XPATH="//input[@name='address']";
	public static final String CHECKOUT_CONFIRM_CITY_XPATH="//input[@name='city']";
	public static final String CHECKOUT_CONFIRM_CODE_XPATH="//input[@name='code']";
	public static final String CHECKOUT_CONFIRM_STATE_XPATH="//input[@name='state']";
	public static final String CHECKOUT_CONFIRM_COUNTRY_XPATH="//input[@name='country']";
	public static final String CHECKOUT_CONFIRM_UPDATE_BUTTON_XPATH="//input[@name='Submit']";
	public static final String CHECKOUT_CONFIRM_CONTINUE_XPATH="//img[@src='images/continue.gif']";
	public static final String CHECKOUT_CONFIRM_DISCOUNTCODE_XPATH="//input[@name='dcode']";
	
//MyCart
	public static final String MYCART_XPATH_LOCATOR="//a[contains(text(),'MY CART')]";
	public static final String ADDTOCART_XPATH_lOCATOR="//input[@value='Add to Cart']";

	
}