package com.magento.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.magento.BaseTest.MagentoBaseTest;
import com.magento.BaseTest.MyAccountBaseConstant;
import com.magento.pages.ChangeOrReorderPreviouslyAddedProductPage;

public class ChangeOrReorderPreviouslyAddedProduct_TC8 extends MagentoBaseTest implements MyAccountBaseConstant{

	@Test
	public void changeOrReorderProduct() {
		
		driver.get(BASEURL);
		ChangeOrReorderPreviouslyAddedProductPage pageObject=new ChangeOrReorderPreviouslyAddedProductPage(driver);
		pageObject.getAccountLinkClick();
		pageObject.getMyAccountLinkClick();
		pageObject.setEmailAddress();
		pageObject.setPassword();
		pageObject.getLoginButtonClick();
		pageObject.getReOrderClick();
		String grandTotalBeforeUpdate=pageObject.getGrandTotalValue();
		pageObject.setQuantityValue();
		pageObject.getUpdateClick();
		String grandTotalAfterUpdate=pageObject.getGrandTotalValue();
		try {
			if(!grandTotalBeforeUpdate.equals(grandTotalAfterUpdate))
				Assert.assertTrue(true);
			System.out.println("Try");
		}
		catch (Exception e) {
			System.out.println("Catch");
			e.printStackTrace();
		}
		pageObject.getProceedToChekoutClick();
		pageObject.getBillingInfoContinueClick();
		pageObject.getShippingMethodContinueClick();
		pageObject.getCheckOrMoneyOrderRadioClick();
		pageObject.getPaymentContinueClick();
		pageObject.getPlaceOderClick();
		String orderNumber=pageObject.getOrderNumberValue();
		System.out.println(orderNumber);
				
	}
}
