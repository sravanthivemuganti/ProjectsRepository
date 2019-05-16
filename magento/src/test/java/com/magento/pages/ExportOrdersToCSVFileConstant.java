package com.magento.pages;

public interface ExportOrdersToCSVFileConstant {

	public static final String BASEURL="http://live.guru99.com/index.php/backendlogin/";
	public static final String USERNAME="user01";
	public static final String PASSWORD="guru99com";
	public static final String USER_ID_LOCATOR="username";
	public static final String PASSSWORD_ID_LOCATOR="login";
	public static final String LOGIN_BUTTON_XPATH_LOCATOR="//input[@title='Login']";
	public static final String POPUPWINDOW_CLOSE_XPATH_LOCATOR="//a[@title='close']";
	public static final String SALES_XPATH_LOCATOR="//ul[@id='nav']/li/a";
	public static final String ORDERS_XPATH_LOCATOR="//span[contains(text(),'Orders')]";
	public static final String EXPORT_XPATH_LOCATOR="//span[contains(text(),'Export')]";
	
	
}
