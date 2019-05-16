package com.apex.ecommerce.Order.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.apex.ecommerce.Order.constant.OrderConstant;
import com.apex.ecommerce.core.BaseProductPage;

public class AddToCartPage extends BaseProductPage  implements OrderConstant {

	@FindBy(xpath=OrderConstant.VIEWITEM_XPATH_LOCATOR1)
	WebElement viewItemElem1;
	@FindBy(xpath=OrderConstant.VIEWITEM_XPATH_LOCATOR2)
	WebElement viewItemElem2;
	@FindBy(xpath=PRODUCT_DETAIL_XPATH_lOCATOR)
	WebElement productDetailHeadingElem;
	@FindBy(xpath=OrderConstant.ADDTOCART_XPATH_lOCATOR)
	WebElement addToCartElem;
	@FindBy(xpath=SHOPPING_CART_XPATH_lOCATOR)
	WebElement shoppingCartHeadingElem;
		
	public AddToCartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);	
		
	}
	//AddToCartTest.java
	public String viewItemPath(int productId) {
		String path=VIEWITEM_XPATH_LOCATOR1+productId+VIEWITEM_XPATH_LOCATOR2;
		System.out.println(path);
		return path;
	}
	//AddToCartDataDrivenTest.java
	public String viewItemPath(String productId) {
		String path=VIEWITEM_XPATH_LOCATOR1+productId+VIEWITEM_XPATH_LOCATOR2;
		System.out.println(path);
		return path;
	}
//	public void viewItemClick(String path) {
//		System.out.println(path);
//		System.out.println(driver.findElement(By.xpath(path)));
//		driver.findElement(By.xpath(path)).click();
//		}
	public String productDetailHeadingText() {
		String getHeading=productDetailHeadingElem.getText();
		return getHeading;
	}
	
	public void clickAddToCart() {
		addToCartElem.click();

	}
	public String shoppingCartHeadingText() {
		String getShoppingCartHeading=shoppingCartHeadingElem.getText();
		return getShoppingCartHeading;
	}
}
