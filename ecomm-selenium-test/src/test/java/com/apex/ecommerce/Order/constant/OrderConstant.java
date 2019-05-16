package com.apex.ecommerce.Order.constant;

public interface OrderConstant {
	
	public static final String PRODUCT_A = "//a[contains(text(),'PRODUCTS')]";
	public static final String VIEWITEM_XPATH_LOCATOR1 = "//a[starts-with(@href,'proddetail.php?proid=";
	public static final String VIEWITEM_XPATH_LOCATOR2 = "')]/img";
	

	// MyCart
	public static final String MYCART_XPATH_LOCATOR = "//a[contains(text(),'MY CART')]";
	public static final String ADDTOCART_XPATH_lOCATOR = "//input[@value='Add to Cart']";
	public static final String PRODUCT_DETAIL_XPATH_lOCATOR = "//div[contains(text(),'Product Detail')]";
	public static final String SHOPPING_CART_XPATH_lOCATOR = "//div[contains(text(),'Your shopping cart')]";
	
	//Edit Delete Cart
	public static final String QUANTITY_XPATH_LOCATOR1="//input[starts-with(@name,'qty_";
	public static final String QUANTITY_XPATH_LOCATOR2="')]";
	public static final String EDITBUTTON_XPATH_LOCATOR="/parent::td[@class='font']/preceding-sibling::td[@class='font_w']";
	public static final String DELETEBUTTON_XPATH_LOCATOR="/parent::td[@class='font']/preceding-sibling::td[@class='font']/a/img";
	public static final String UPDATE_MESSAGE_XPATH_LOCATOR="//span[contains(text(),'Your basket has been updated')]";
	public static final String DELETE_MESSAGE_XPATH_LOCATOR="//span[contains(text(),'Item has been deleted from your basket')]";
	public static final String EMPTYCART_MESSAGE_XPATH_LOCATOR="//span[contains(text(),'Your Cart is Empty')]";
	
	
	

	public static final String DELL19R_VIEWITEM_XPATH = "//*[@id=\"rightcontent\"]/p[2]/a/img";
	public static final String DEll19R_ADDTOCART_XPATH = "//input[@value='Add to Cart']";
	public static final String DEll19R_CHECKOUT_XPATH = "//div[contains(text(),'Checkout')]";
	public static final String CHECKOUT_CONFIRM_XPATH = "//img[@src='images/continue.gif']";
	public static final String CHECKOUT_CONFIRM_SHIPPINGMETHOD_XPATH = "//input[@name='shipopt' and @value=2]";

	public static final String CHECKOUT_CONFIRM_HOUSENO_XPATH = "//input[@name='houseno']";
	public static final String CHECKOUT_CONFIRM_STREET_XPATH = "//input[@name='address']";
	public static final String CHECKOUT_CONFIRM_CITY_XPATH = "//input[@name='city']";
	public static final String CHECKOUT_CONFIRM_CODE_XPATH = "//input[@name='code']";
	public static final String CHECKOUT_CONFIRM_STATE_XPATH = "//input[@name='state']";
	public static final String CHECKOUT_CONFIRM_COUNTRY_XPATH = "//input[@name='country']";
	public static final String CHECKOUT_CONFIRM_UPDATE_BUTTON_XPATH = "//input[@name='Submit']";
	public static final String CHECKOUT_CONFIRM_CONTINUE_XPATH = "//img[@src='images/continue.gif']";
	public static final String CHECKOUT_CONFIRM_DISCOUNTCODE_XPATH = "//input[@name='dcode']";

}
