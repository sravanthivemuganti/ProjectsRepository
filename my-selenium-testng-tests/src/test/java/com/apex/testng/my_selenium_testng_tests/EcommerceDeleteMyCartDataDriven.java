package com.apex.testng.my_selenium_testng_tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EcommerceDeleteMyCartDataDriven extends EcommerceBaseUserLogin {

	@BeforeTest
	public void openProductTab() {
		driver.findElement(By.xpath(MYCART_XPATH_LOCATOR)).click();
	}
	@Test(dataProvider="ProductId")
	public void deleteMyCart(String productid) {
			try {
				String path = "//input[starts-with(@name,'qty_" + productid + "')]";
				System.out.println(path);
				driver.findElement(
						By.xpath(path + "/parent::td[@class='font']/preceding-sibling::td[@class='font']/a/img"))
						.click();
				Alert alert = driver.switchTo().alert();
				Assert.assertEquals(alert.getText(), "Are you sure you want to remove this product from your cart");
				alert.accept();
				Assert.assertEquals(driver.findElement(By.xpath("//td[@class='msg']/span")).getText(),
						"Item has been deleted from your basket");
			} catch (Exception e) {
				System.out.println(productid + " This product is not in the list");
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
