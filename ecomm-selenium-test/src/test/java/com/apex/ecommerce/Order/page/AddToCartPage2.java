package com.apex.ecommerce.Order.page;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.apex.ecommerce.Order.constant.AddEditDeleteCartConstant;
import com.apex.ecommerce.Order.constant.OrderConstant;
import com.apex.ecommerce.core.BaseProductPage;

public class AddToCartPage2 extends BaseProductPage implements OrderConstant, AddEditDeleteCartConstant {

	@FindBy(xpath = OrderConstant.VIEWITEM_XPATH_LOCATOR1)
	WebElement viewItemElem1;
	@FindBy(xpath = OrderConstant.VIEWITEM_XPATH_LOCATOR2)
	WebElement viewItemElem2;
	@FindBy(xpath = PRODUCT_DETAIL_XPATH_lOCATOR)
	WebElement productDetailHeadingElem;
	@FindBy(xpath = OrderConstant.ADDTOCART_XPATH_lOCATOR)
	WebElement addToCartElem;
	@FindBy(xpath = SHOPPING_CART_XPATH_lOCATOR)
	WebElement shoppingCartHeadingElem;
	@FindBy(xpath = PRODUCT_10002)
	WebElement product10002Elem;
	@FindBy(xpath = PRODUCT_10003)
	WebElement product10003Elem;
	@FindBy(xpath = PRODUCT_10004)
	WebElement product10004Elem;
	@FindBy(xpath = PRODUCT_10005)
	WebElement product10005Elem;
	@FindBy(xpath = PRODUCT_10009)
	WebElement product10009Elem;
	@FindBy(xpath = PRODUCT_A)
	WebElement productElem;
	public AddToCartPage2(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}
	public void viewItemClick(int numberOfproducts) {
		Set<WebElement> viewItemPaths = new HashSet<WebElement>();
		viewItemPaths.clear();
		viewItemPaths.add(product10002Elem);
		viewItemPaths.add(product10003Elem);
		viewItemPaths.add(product10004Elem);
		viewItemPaths.add(product10005Elem);
		viewItemPaths.add(product10009Elem);
		Iterator<WebElement> itr = viewItemPaths.iterator();
		for (int elem = 0; elem < numberOfproducts; elem++) {
			productElem.click();
			itr.next().click();
			addToCartElem.click();
		}
	}
	public String productDetailHeadingText() {
		String getHeading = productDetailHeadingElem.getText();
		return getHeading;
	}
	public String shoppingCartHeadingText() {
		String getShoppingCartHeading = shoppingCartHeadingElem.getText();
		return getShoppingCartHeading;
	}
}
