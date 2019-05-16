package com.magento.tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.magento.BaseTest.MagentoBaseTest;
import com.magento.constants.MobileConstant;
import com.magento.pages.MobilePage;

public class VerifyProductAddToCartMaxQuantity_TC3 extends MagentoBaseTest implements MobileConstant{
	@Test
	public void SuccessVerifyAddtocartMaxQuantity() {
	MobilePage mobilepage=new MobilePage(driver);
	//Step1:Go to http://live.guru99.com
	driver.get(BASEURL);
	//Step2:Click on mobile menu
	mobilepage.mobileLinkClick();
	//Step3:In the list of all mobile,click on "ADD TO CART"for Sony Xperia mobile
	mobilepage.sonyXperiaAddtoCartClick();
	//Step4:Chande Qty value to 1000 and click "UPDATE" button
	mobilepage.sonyXperiaQuantity();
	mobilepage.sonyXperiaQtyUpdateClick();
	String actualErrorMessage=mobilepage.sonyXperiaQtyUpdateErrorMessage();
	String expectedErrorMessage="* The maximum quantity allowed for purchase is 500.";
	try {
		assertEquals(actualErrorMessage, expectedErrorMessage);
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	//Step5:Then click on "EMTY CART"link in the footer of list of all mobiles. 
	mobilepage.emptyCartClick();
	String actualMessage=mobilepage.emptyCartSuccessMessage();
	//Step6:verify cart is empty
	String expectedMessage="SHOPPING CART IS EMPTY";
	try {
	assertEquals(actualMessage, expectedMessage);
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	}	
}
