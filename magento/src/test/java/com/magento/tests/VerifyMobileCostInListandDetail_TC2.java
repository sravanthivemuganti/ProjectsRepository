package com.magento.tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.magento.BaseTest.MagentoBaseTest;
import com.magento.constants.MobileConstant;
import com.magento.pages.MobilePage;

public class VerifyMobileCostInListandDetail_TC2 extends MagentoBaseTest implements MobileConstant {
	@Test
	public void verifyMobileCost() {
		MobilePage mobilepage=new MobilePage(driver);
		//Step1:Go to http://live.guru99.com
		driver.get(BASEURL);
		//Step2:Click on mobile menu
		mobilepage.mobileLinkClick();
		//Step3:In the list of all mobile,click on "ADD TO CART" for Sony Xperia mobile
		String SonyXperiaListCost=mobilepage.sonyXperiaListCost();
		//Step4:Click on Sony Xperia mobile
		mobilepage.sonyXperiaImageLinkClick();
		//Step5:Read the Sony Xperia mobile from detail page
		String SonyXperiaDetailCost=mobilepage.sonyXperiaDetailCost();
		//Step6: Compare value in step3 and step5
		try {
			assertEquals(SonyXperiaListCost, SonyXperiaDetailCost);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
