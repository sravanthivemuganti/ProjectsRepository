package com.apex.testng.my_selenium_testng_tests;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class EcommerceUserloginPageNew extends EcommerceBaseClass implements EcommerceInterfaceConstant {

	FileInputStream file;
	public static XSSFWorkbook workbook;
	XSSFSheet sheet;

	@Test(dataProvider = "loginData")
	public void loginWithBlank(String uname, String pwd) throws IOException {
		driver.findElement(By.name(EMAIL_CONSTANT)).sendKeys(uname);
		driver.findElement(By.name(PASSWORD_CONSTANT)).sendKeys(pwd);
		driver.findElement(By.linkText(LOGIN_CLICK_CONSTANT)).click();
		try {
			Assert.assertEquals("You have Logged In successfully.",
					driver.findElement(By.xpath("//div[@class='fntstyle']")).getText());
			driver.navigate().back();
		} catch (Exception e) {
			Assert.assertEquals("Invalid Username / Password!",
					driver.findElement(By.xpath(".//span[@class='msg']")).getText());
		}
	}

	@DataProvider(name = "loginData")
	private String[][] getData() throws IOException {
		String path = System.getProperty("user.dir") + "/src/test/java/com/apex/ecommerce/data/login.xlsx";
		file = new FileInputStream(path);
		workbook = new XSSFWorkbook(file);
		sheet = workbook.getSheet("sheet1");
		int rowcount = sheet.getLastRowNum();
		int columncount = sheet.getRow(0).getLastCellNum();
		String[][] logindata = new String[rowcount][columncount];
		for (int i = 1; i <= rowcount; i++) {
			for (int j = 0; j < columncount; j++) {
				try {
					logindata[i - 1][j] = sheet.getRow(i).getCell(j).getStringCellValue();
				} catch (Exception e) {
					logindata[i - 1][j] = "";
				}
			}
		}
		return logindata;
	}
}
