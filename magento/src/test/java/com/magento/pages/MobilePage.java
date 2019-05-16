package com.magento.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.magento.constants.MobileConstant;

public class MobilePage implements MobileConstant {

	@FindBy(linkText=MOBILE_LINKTEXT_LOCATOR)
	WebElement mobileElem;
	@FindBy(xpath=SONYXPERIALISTCOST_XPATH_LOCATOR)
	WebElement sonyXperiaListCostElem;
	@FindBy(xpath=SONYXPERIAIMAGE_XPATH_LOCATOR)
	WebElement sonyXperiaImageLinkElem;
	@FindBy(xpath=SONYXPERIADETAILCOST_XPATH_LOCATOR)
	WebElement sonyXperiaDetailCostElem;
	@FindBy(xpath=SONYXPERIAADDTOCART_XPATH_LOCATOR)
	WebElement sonyXperiaAdToCartElem;
	@FindBy(xpath=SONYXPERIA_QTY_XPATH_LOCATOR)
	WebElement sonyXperiaQuantityElem;
	@FindBy(xpath=SONYXPERIA_QTY_UPDATEBUTTON_XPATH_LOCATOR)
	WebElement sonyXperiaQtyUpdateElem;
	@FindBy(xpath=SONYXPERIA_QTY_UPDATE_ERRORMESSAGE_XPATH_LOCATOR)
	WebElement sonyXperiaUpdateErrorMessageElem;
	@FindBy(xpath=EMPTYCART_XPATH_LOCATOR)
	WebElement emptyCartElem;
	@FindBy(css=EMPTYCART_SUCCESSMESSAGE_CSSSELECTOR_LOCATOR)
	WebElement emptyCartSuccessMessageElem;
	@FindBy(xpath=SONYXPERIA_ADDTOCOMPARE_XPATH_LOCATOR)
	WebElement sonyXperiaAddToCompareElem;
	@FindBy(xpath=IPHONE_ADDTOCOMPARE_XPATH_LOCATOR)
	WebElement iphoneAddToCompareElem;
	@FindBy(xpath=COMPARE_BUTTON_XPATH_LOCATOR)
	WebElement compareButtonElem;
	@FindBy(xpath=COMPARE_POPUPWINDOW_CLOSEBUTTON_XPATH_LOCATOR)
	WebElement comparePopupWindowCloseButtonElem;
	@FindBy(xpath=COMPARE_POPUPWINDOW_HEADING_XPATH_LOCATOR)
	WebElement comparePopupWindowHeadingElem;
	public MobilePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void mobileLinkClick() {
		mobileElem.click();
	}
	//Test case 2
	public String sonyXperiaListCost() {
		String sonyXperiaListCost=sonyXperiaListCostElem.getText();
		return sonyXperiaListCost;
	}
	public void sonyXperiaImageLinkClick() {
		sonyXperiaImageLinkElem.click();
	}
	public String sonyXperiaDetailCost() {
		String sonyXperiaListCost=sonyXperiaDetailCostElem.getText();
		return sonyXperiaListCost;
	}
	//Test Case 3
	public void sonyXperiaAddtoCartClick() {
		sonyXperiaAdToCartElem.click();
	}
	public void sonyXperiaQuantity() {
		sonyXperiaQuantityElem.clear();
		sonyXperiaQuantityElem.sendKeys("1000");
	}
	public void sonyXperiaQtyUpdateClick() {
		sonyXperiaQtyUpdateElem.click();
	}
	public String sonyXperiaQtyUpdateErrorMessage() {
		String errorMessage=sonyXperiaUpdateErrorMessageElem.getText();
		return errorMessage;
	}
	public void emptyCartClick() {
		emptyCartElem.click();
	}
	public String emptyCartSuccessMessage() {
		String message=emptyCartSuccessMessageElem.getText();
		return message;
	}
	public void addToCompareSonyXperia() {
		sonyXperiaAddToCompareElem.click();
	}
	public void addToCompareIphone() {
		iphoneAddToCompareElem.click();
	}
	public void compareProductsButtonClick() {
		compareButtonElem.click();
	}
	public void comparePopupWindowCloseButtonClick() {
		comparePopupWindowCloseButtonElem.click();
	}
	public String comparepopupWindowHeading() {
		String getHeading=comparePopupWindowHeadingElem.getText();
		return getHeading;
	}
}
