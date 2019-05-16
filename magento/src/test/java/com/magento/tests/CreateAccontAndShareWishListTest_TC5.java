package com.magento.tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.magento.BaseTest.MagentoBaseTest;
import com.magento.constants.CreateAccontAndShareWishConstant;
import com.magento.pages.CreateAccontAndShareWishListPage;

public class CreateAccontAndShareWishListTest_TC5 extends MagentoBaseTest implements CreateAccontAndShareWishConstant{
	@Test
	public void SuccessfulRegister() throws InterruptedException {
		CreateAccontAndShareWishListPage pageObject=new CreateAccontAndShareWishListPage(driver);
		//Step1:Go to http://live.guru99.com
		driver.get(BASEURL);
		//Step2:Click onMy Account Link
		pageObject.accountMenuClick();
		pageObject.myAccountClick();
		//Step3: Click Create Account link and fill New User informationexcept Email Id 
		pageObject.createAnAccountClick();
		pageObject.firstNameText();
		pageObject.middleNameText();
		pageObject.lastNameText();
		pageObject.emailAddressText();
		pageObject.passwordText();
		pageObject.confirmPasswordText();
		pageObject.newsLetterCheckBoxClick();
		Thread.sleep(3000);
		//Step4:Click register
		pageObject.registerButtonClick();
		//Step5:Verify registration is done
		String actualTitle=driver.getTitle();
		String expectedTitle="My Account";
		try {
		assertEquals(actualTitle, expectedTitle);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public void ShareWishList() {
		CreateAccontAndShareWishListPage pageObject=new CreateAccontAndShareWishListPage(driver);
		driver.get(BASEURL);
		pageObject.accountMenuClick();
		pageObject.loginLinkClick();
		pageObject.emailAddressLoginText();
		pageObject.passwordLoginText();
		pageObject.loginButtonClick();
		//Step6:Go To TV Menu
		pageObject.tvLinClick();
		//Step7:Add Product in your wishlist -- product=LG LCD
		pageObject.lgLcdAddToWishListClick();
		//Step8:Click share WishList
		pageObject.shareWishListButtonClick();
		//Step9:In next page enter Email and a message and click SHARE WISHLIST
		pageObject.shareEmailAddressTextArea();
		pageObject.shareWishListMessageTextArea();
		pageObject.shareEmailWishListButtonClick();
		//step10:Check wish list is shared
		String actualMessage=pageObject.shareWishListSuccessMessageGetText();
		String expectedMessage="Your Wishlist has been shared.";
		try {
			assertEquals(actualMessage, expectedMessage);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
