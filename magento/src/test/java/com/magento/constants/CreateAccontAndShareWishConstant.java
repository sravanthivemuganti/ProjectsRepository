package com.magento.constants;

public interface CreateAccontAndShareWishConstant {
	
	//url
	public static final String BASEURL="http://live.guru99.com/index.php/";
	
	//My Account Registration
	public static final String ACCOUNT_MENU_XPATH_LOCATOR="//a[@data-target-element='#header-account']";
	public static final String MYACCOUNT_LINKTEXT_LOCATOR="My Account";
	public static final String CREATE_AN_ACCOUNT_XPATH_LOCATOR="//a[@title='Create an Account']";
	public static final String FIRSTNAME_ID_LOCATOR="firstname";
	public static final String MIDDLENAME_ID_LOCATOR="middlename";
	public static final String LASTNAME_ID_LOCATOR="lastname";
	public static final String EMAILADDRESS_ID_LOCATOR="email_address";
	public static final String PASSWORD_ID_LOCATOR="password";
	public static final String CONFIRM_PASSWORD_ID_LOCATOR="confirmation";
	public static final String NEWSLETTER_ID_LOCATOR="is_subscribed";
	public static final String REGISTER_BUTTON_XPATH_LOCATOR="//button[@title='Register']";
	
	//Share WishList
	public static final String LOGIN_LINKTEXT_LOCATOR="Log In";
	public static final String LOGIN_EMAIL_XPATH_LOCATOR="//input[@name='login[username]']";
	public static final String LOGIN_PASSWORD_XPATH_LOCATOR="//input[@name='login[password]']";
	public static final String LOGIN_BUTTON_XPATH_LOCATOR="//button[@name='send']";
	public static final String TV_MENU_LINKTEXT_LOCATOR="TV";
	public static final String LGLCD_ADDTO_WISHLIST_XPATH_LOCATOR="//a[contains(text(),'LG LCD')]/parent::h2/parent::div/div[3]/ul/li/a";
	public static final String SHARE_WISHLIST_XPATH_LOCATOR="//button[@name='save_and_share']";
	public static final String SHARE_EMAIL_ADDRESSES_XPATH_LOCATOR="//textarea[@name='emails']";
	public static final String SHARE_WISHLIST_MESSAGE_XPATH_LOCATOR="//textarea[@id='message']";
	public static final String SHARE_EMAIL_SHAREWISHLIST_BUTTON_XPATH_LOCATOR="//button[@title='Share Wishlist']";
	public static final String SHARE_WISHLIST_SUCCESS_MESSAGE_XPATH_LOCATOR="//li[@class='success-msg']";
	
}
