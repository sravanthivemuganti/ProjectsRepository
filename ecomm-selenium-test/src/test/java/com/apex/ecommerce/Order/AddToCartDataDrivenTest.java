package com.apex.ecommerce.Order;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.apex.ecommerce.Order.page.AddToCartPage;
import com.apex.ecommerce.core.BaseProductPage;

public class AddToCartDataDrivenTest extends BaseProductPage {

	@Test(dataProvider = "ProductId")
	public void addToCart(String productId) {
		// System.out.println(productId);
		AddToCartPage acp = new AddToCartPage(driver);
		try {
			String path = acp.viewItemPath(productId);
			driver.findElement(By.xpath(path)).click();
			String actualProductDetailHeading = acp.productDetailHeadingText();
			String expectedProductDetailHeading = "Product Detail";
			try {
				Assert.assertEquals(actualProductDetailHeading, expectedProductDetailHeading);
			} catch (Exception e) {
				e.printStackTrace();
			}
			// Click AddToCArt
			acp.clickAddToCart();
			// Verify Shopping Cart page opend
			String actualShoppingCartHeading = acp.shoppingCartHeadingText();
			String expectedShoppingCartHeading = "Your shopping cart";
			try {
				Assert.assertEquals(actualShoppingCartHeading, expectedShoppingCartHeading);
			} catch (Exception e) {
				e.printStackTrace();
			}
			// Go Back to product page to view another item
			driver.findElement(By.xpath(PRODUCT_A)).click();
		} catch (Exception e) {
			System.out.println(" This product is not available");
		}
	}

	@DataProvider(name = "ProductId")
	private Object[][] getData() throws IOException {
		String path = System.getProperty("user.dir") + "/src/test/java/com/apex/ecommerce/utils/ProductId.xlsx";
		FileInputStream file = new FileInputStream(path);
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("sheet1");
		int rowcount = sheet.getLastRowNum();
		// System.out.println(rowcount);
		int columncount = sheet.getRow(0).getLastCellNum();
		// System.out.println(columncount);
		String[][] logindata = new String[rowcount][columncount];
		for (int i = 1; i <= rowcount; i++) {
			for (int j = 0; j < columncount; j++) {
				try {
					// System.out.println(i+" "+j);
					XSSFCell cell = sheet.getRow(i).getCell(j);
					DataFormatter formatter = new DataFormatter();
					logindata[i - 1][j] = formatter.formatCellValue(cell);
				} catch (Exception e) {
					logindata[i - 1][j] = "";
				}
			}
		}
		return logindata;
	}

}
