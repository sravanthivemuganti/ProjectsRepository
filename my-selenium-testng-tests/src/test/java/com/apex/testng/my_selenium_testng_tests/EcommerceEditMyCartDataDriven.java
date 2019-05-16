package com.apex.testng.my_selenium_testng_tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EcommerceEditMyCartDataDriven extends EcommerceBaseUserLogin implements EcommerceInterfaceConstant {

	@Test(dataProvider="ProductId_Edit")
	public void myCartEdit(String productId,String quantity){
		driver.findElement(By.xpath(MYCART_XPATH_LOCATOR)).click();
		try {
			String path="//input[starts-with(@name,'qty_"+productId+"')]";
			//System.out.println(path);
			driver.findElement(By.xpath(path)).clear();	
			driver.findElement(By.xpath(path)).sendKeys(""+quantity+"");			
			driver.findElement(By.xpath(path+"/parent::td[@class='font']/preceding-sibling::td[@class='font_w']")).click();
			Assert.assertEquals(driver.findElement(By.xpath("//span[@class='msg']")).getText(), "Your basket has been updated");
			}
			catch(Exception e){
				System.out.println(productId+" This product is not in the list");
			}
	}
	
	@DataProvider(name="ProductId_Edit")
	private Object[][] getData() throws IOException {
		String path = System.getProperty("user.dir") + "/src/test/java/com/apex/ecommerce/data/ProductId_Update.xlsx";
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
