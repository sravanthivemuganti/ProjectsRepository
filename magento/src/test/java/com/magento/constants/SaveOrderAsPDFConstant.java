package com.magento.constants;

public interface SaveOrderAsPDFConstant {
	public static final String MYORDERS_XPATH_LOCATOR="//a[contains(text(),'My Orders')]";
	public static final String ORDERS_NUMBER_XPATH_LOCATOR="//td[@class='number' and contains(text(),'100009342')]";
	public static final String ORDERS_NUMBER_STATUS_XPATH_LOCATOR="//td[@class='number' and contains(text(),'100009342')]/following-sibling::td[4]/em";
	public static final String VIEW_ORDERS_XPATH_LOCATOR="//td[@class='number' and contains(text(),'100009342')]/following-sibling::td[5]/span/a";
	public static final String PRINT_ORDERS_XPATH_LOCATOR="//a[contains(text(),'Print Order')]";
}
