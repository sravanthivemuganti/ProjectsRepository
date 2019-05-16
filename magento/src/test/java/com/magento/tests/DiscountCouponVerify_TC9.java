package com.magento.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.magento.BaseTest.MagentoBaseTest;
import com.magento.constants.DiscountCouponConstant;
import com.magento.pages.DiscountCouponPage;

public class DiscountCouponVerify_TC9 extends MagentoBaseTest implements DiscountCouponConstant{
	
	@Test
	public void discountCouponVerification() {
		driver.get(BaseURL);
		DiscountCouponPage pageObject=new DiscountCouponPage(driver);
		pageObject.getMobileLinkClick();
		pageObject.getIphoneAddtoCartClick();
		pageObject.setDiscountCouponValue();
		pageObject.getDiscountCouponApplyclick();
		Float subTotal=pageObject.getSubtotalValue();
		Float fivePercentofSubTotal=(subTotal*5)/100;
		Float discountPrice=pageObject.getDiscountPriceValue();
		try {
		Assert.assertEquals(discountPrice, fivePercentofSubTotal);
		}
		catch (Exception e) {
			System.out.println("Discount Not Applied");
			e.printStackTrace();
		}
		
	}
}
