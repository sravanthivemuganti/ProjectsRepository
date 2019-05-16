package com.magento.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.magento.BaseTest.MagentoBaseTest;
import com.magento.constants.PurchaseProductConstant;
import com.magento.pages.PurchaseProductPage;

public class PurchaseProduct_TC6 extends MagentoBaseTest implements PurchaseProductConstant{
	
	@Test
	public void purchaseProductGenerateOrder() throws InterruptedException {
		PurchaseProductPage orderPage=new PurchaseProductPage(driver);
		driver.get(BASEURL);
		Thread.sleep(1000);
		orderPage.accountMenuClick();
		Thread.sleep(1000);
		orderPage.myAccountCick();
		Thread.sleep(1000);
		orderPage.setEmailAddressText();
		Thread.sleep(1000);
		orderPage.setPasswordText();
		Thread.sleep(1000);
		orderPage.loginButtonClick();
		Thread.sleep(1000);
		orderPage.myWishListClick();
		Thread.sleep(1000);
		orderPage.addToCartClick();
		Thread.sleep(1000);
		//orderPage.proceedToCheckoutClick();
		orderPage.estimateCountrySelect();
		Thread.sleep(1000);
//		orderPage.estimateRegionSelect();
		Thread.sleep(3000);
		orderPage.estimatePostcodeText();
		Thread.sleep(1000);
		orderPage.estimateButtonClick();
		Thread.sleep(1000);
		String actualFixedrate=orderPage.fixedRateValue();
		Thread.sleep(1000);
		String expectedFixedrate="$5.00";
		Thread.sleep(1000);
		Assert.assertEquals(actualFixedrate, expectedFixedrate);
		Thread.sleep(1000);
		orderPage.fixedRateRadioButtonClick();
		Thread.sleep(1000);
		orderPage.updateTotalButtonClick();
		Thread.sleep(1000);
		Float subTotal=orderPage.subTotalValue();
		Thread.sleep(1000);
		Float grandTotal=orderPage.grandTotalValue();
		Thread.sleep(1000);
		Float shipppingValue=orderPage.getShippingRateValue();
		Thread.sleep(1000);
		Float addSubtotalandShippingrate=subTotal+shipppingValue;
		Thread.sleep(1000);
		Assert.assertEquals(grandTotal,addSubtotalandShippingrate);
		Thread.sleep(1000);
		orderPage.proceedToCheckoutClick();
		Thread.sleep(1000);
		orderPage.selectBillingAddress();
		orderPage.setAddressValue();
		Thread.sleep(1000);
		orderPage.setCityValue();
		Thread.sleep(1000);
		orderPage.setStateValue();
		Thread.sleep(1000);
		orderPage.setPostCodeValue();
		Thread.sleep(1000);
		orderPage.setCountryValue();
		Thread.sleep(1000);
		orderPage.setTelephoneValue();
		Thread.sleep(1000);
		orderPage.billingContinueButtonClick();
		Thread.sleep(1000);
		orderPage.shippingMethodContinueButtonClick();
		Thread.sleep(1000);
		orderPage.checkMoneorderRadioButtonClick();
		Thread.sleep(1000);
		orderPage.paymentInformationContinueButtonClick();
		Thread.sleep(1000);
		orderPage.placeOrderButtonClick();
		Thread.sleep(1000);
		String generatedOrderNumber=orderPage.getGenerateOrderNumber();
		Thread.sleep(1000);
		Assert.assertTrue(true, generatedOrderNumber);
		Thread.sleep(1000);
	}
}
