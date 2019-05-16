package com.apex.testng.my_selenium_testng_tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.apache.http.Header;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class NewTest extends EcommerceBaseClass implements EcommerceInterfaceConstant {

	@DataProvider(name = "LoginData")
	public String[][] getDat() throws IOException {
		String path = System.getProperty("user.dir") + "/src/test/java/com/apex/ecommerce/data/google_ids.xlsx";
		FileInputStream file = new FileInputStream(path);
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("sheet1");
		int rowcount = sheet.getLastRowNum();
		int columncount = sheet.getRow(0).getLastCellNum();
		// System.out.println(rowcount+" "+columncount);
		  String[][] logindata = new String[rowcount-1][columncount-2];
		
		for (int i = 1; i < rowcount; i++) {
			for (int j = 1; j < columncount-1; j++) {
				 System.out.println(i+" "+j);
				try {
					logindata[i - 1][j - 1] = sheet.getRow(i).getCell(j).getStringCellValue();
					System.out.println(logindata[i - 1][j - 1]);
				} catch (Exception e) {
					logindata[i - 1][j - 1] = "";
				}
			}
		}
		return logindata;
	}
	@Test(dataProvider = "LoginData")
	public void loginUser(String uname, String pwd) {
		
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
}