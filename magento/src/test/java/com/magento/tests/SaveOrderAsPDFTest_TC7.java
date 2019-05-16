package com.magento.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.magento.BaseTest.MagentoBaseTest;
import com.magento.BaseTest.MyAccountBaseConstant;
import com.magento.constants.SaveOrderAsPDFConstant;
import com.magento.pages.SaveOrderAsPDFPage;

public class SaveOrderAsPDFTest_TC7 extends MagentoBaseTest implements MyAccountBaseConstant {
	@Test
	public void saveOrderAsPdfFile() {
	SaveOrderAsPDFPage orderPage=new SaveOrderAsPDFPage(driver);
	driver.get(BASEURL);
	orderPage.getAccountLinkClick();
	orderPage.getMyAccountLinkClick();
	orderPage.setEmailAddress();
	orderPage.setPassword();
	orderPage.getLoginButtonClick();
	orderPage.getMyOrdersClick();
	String orderNumber=orderPage.getOrderNumberValue();
	try {
	Assert.assertTrue(true, orderNumber);
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	String orderNumberStatus=orderPage.getOrderNumberStatusValue();
	try {
		Assert.assertEquals(orderNumberStatus,"Pending");
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	orderPage.getViewOrdersClick();
	orderPage.getPrintOrdersClick();
	}
}
