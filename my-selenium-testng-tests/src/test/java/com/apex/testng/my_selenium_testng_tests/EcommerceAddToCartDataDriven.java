package com.apex.testng.my_selenium_testng_tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EcommerceAddToCartDataDriven extends EcommerceBaseUserLogin {

	@BeforeTest
	public void openProductTab() {
		driver.findElement(By.xpath(PRODUCT_A)).click();
	}

	@Test(dataProvider="ProductId")
	public void addToCart(String productId) {	
		//System.out.println(productId);
			try {
				String path = "//a[starts-with(@href,'proddetail.php?proid=" + productId + "')]/img";
				//System.out.println(path);
				driver.findElement(By.xpath(path)).click();
				driver.findElement(By.xpath(ADDTOCART_XPATH_lOCATOR)).click();
				driver.findElement(By.xpath(PRODUCT_A)).click();
			}
			catch(Exception e) {
				System.out.println(productId + " This product is not available");
			}
	}
	@DataProvider(name="ProductId")
	private Object[][] getData() throws IOException {
		String path = System.getProperty("user.dir") + "/src/test/java/com/apex/ecommerce/data/ProductId.xlsx";
		FileInputStream file = new FileInputStream(path);
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("sheet1");
		int rowcount = sheet.getLastRowNum();
		//System.out.println(rowcount);
		int columncount = sheet.getRow(0).getLastCellNum();
		//System.out.println(columncount);
		String[][] logindata = new String[rowcount][columncount];
		for (int i = 1; i <= rowcount; i++) {
			for (int j = 0; j < columncount; j++) {
				try {
					//System.out.println(i+" "+j);
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
