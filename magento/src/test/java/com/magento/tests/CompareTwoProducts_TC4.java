package com.magento.tests;

import static org.testng.Assert.assertEquals;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.magento.BaseTest.MagentoBaseTest;
import com.magento.constants.MobileConstant;
import com.magento.pages.MobilePage;

public class CompareTwoProducts_TC4 extends MagentoBaseTest implements MobileConstant {
	@Test
	public void compareTwoProducts() {
		MobilePage mobilepage = new MobilePage(driver);
		// Step1:Go to http://live.guru99.com
		driver.get(BASEURL);
		// Step2:Click on mobile menu
		mobilepage.mobileLinkClick();
		// Step3:in mobile products list,click on "ADD TO COMPARE" for 2 mobiles
		mobilepage.addToCompareSonyXperia();
		mobilepage.addToCompareIphone();
		// Step4:Click on "COMPARE" button
		mobilepage.compareProductsButtonClick();
		// Step5:Verify the popup window and check that the products are reflected in it
//		Set<String> handles = driver.getWindowHandles();
//		Iterator<String> itr = handles.iterator();
//		String parentwindow = itr.next();
		//switch to popup window
//		String popupWindow = itr.next();
//		driver.switchTo().window(popupWindow);
		//(or )
		for(String handles:driver.getWindowHandles())
			driver.switchTo().window(handles);
			
		String popupWindowHeading = mobilepage.comparepopupWindowHeading();
		String expectedPopupWindowHeading = "COMPARE PRODUCTS";
		try {
			assertEquals(popupWindowHeading, expectedPopupWindowHeading);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// Step6:close the Popup Windows
		mobilepage.comparePopupWindowCloseButtonClick();
	}
}
