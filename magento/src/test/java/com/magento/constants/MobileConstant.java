package com.magento.constants;

public interface MobileConstant {
	public static final String BASEURL="http://live.guru99.com/index.php/";
	public static final String MOBILE_LINKTEXT_LOCATOR="MOBILE";
	public static final String MOBILESORTBY_XPATH_LOCATOR="//select[@title='Sort By']";
	
	public static final String SONYXPERIALISTCOST_XPATH_LOCATOR="//span[@id='product-price-1']/span";
	public static final String SONYXPERIAIMAGE_XPATH_LOCATOR="//img[@id='product-collection-image-1']";
	public static final String SONYXPERIADETAILCOST_XPATH_LOCATOR="//span[@id='product-price-1']/span";

	public static final String SONYXPERIAADDTOCART_XPATH_LOCATOR="//img[@id='product-collection-image-1']/ancestor::li/div/div[3]/button";
	public static final String SONYXPERIA_QTY_XPATH_LOCATOR="//a[contains(text(),'Sony')]/parent::h2/parent::td/following-sibling::td[2]/input";
	public static final String SONYXPERIA_QTY_UPDATEBUTTON_XPATH_LOCATOR="//a[contains(text(),'Sony')]/parent::h2/parent::td/following-sibling::td[2]/button";
	public static final String SONYXPERIA_QTY_UPDATE_ERRORMESSAGE_XPATH_LOCATOR="//a[contains(text(),'Sony')]/parent::h2/parent::td/p";
	public static final String EMPTYCART_XPATH_LOCATOR="//span[contains(text(),'Empty Cart')]";
	public static final String EMPTYCART_SUCCESSMESSAGE_CSSSELECTOR_LOCATOR="h1";
	
	public static final String SONYXPERIA_ADDTOCOMPARE_XPATH_LOCATOR="//li[1]/div/div[3]/ul/li[2]/a";
	public static final String IPHONE_ADDTOCOMPARE_XPATH_LOCATOR="//li[2]/div/div[3]/ul/li[2]/a";
	public static final String COMPARE_BUTTON_XPATH_LOCATOR="//button[@title='Compare']";
	public static final String COMPARE_POPUPWINDOW_CLOSEBUTTON_XPATH_LOCATOR="//button[@title='Close Window']";
	public static final String COMPARE_POPUPWINDOW_HEADING_XPATH_LOCATOR="//h1";
}
