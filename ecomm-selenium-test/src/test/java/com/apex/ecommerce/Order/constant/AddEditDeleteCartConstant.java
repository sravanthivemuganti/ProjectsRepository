package com.apex.ecommerce.Order.constant;

public interface AddEditDeleteCartConstant {
	//Add to cart
	public static final String PRODUCT_10002="//a[contains(@href,'10002')]/img";
	public static final String PRODUCT_10003="//a[contains(@href,'10003')]/img";
	public static final String PRODUCT_10004="//a[contains(@href,'10004')]/img";
	public static final String PRODUCT_10005="//a[contains(@href,'10005')]/img";
	public static final String PRODUCT_10009="//a[contains(@href,'10009')]/img";
	//EDIT Qty
	public static final String QUANTITY_10002 ="//input[contains(@name,'qty_10002')]";
	public static final String QUANTITY_10003 ="//input[contains(@name,'qty_10003')]";
	public static final String QUANTITY_10004 ="//input[contains(@name,'qty_10004')]";
	public static final String QUANTITY_10005 ="//input[contains(@name,'qty_10005')]";
	public static final String QUANTITY_10009 ="//input[contains(@name,'qty_10009')]";
	//Edit to cart
	public static final String PRODUCT_EDIT_10002="//input[contains(@name,'qty_10002')]/parent::td/preceding-sibling::td[3]";
	public static final String PRODUCT_EDIT_10003="//input[contains(@name,'qty_10003')]/parent::td/preceding-sibling::td[3]";
	public static final String PRODUCT_EDIT_10004="//input[contains(@name,'qty_10004')]/parent::td/preceding-sibling::td[3]";
	public static final String PRODUCT_EDIT_10005="//input[contains(@name,'qty_10005')]/parent::td/preceding-sibling::td[3]";
	public static final String PRODUCT_EDIT_10009="//input[contains(@name,'qty_10009')]/parent::td/preceding-sibling::td[3]";
}
