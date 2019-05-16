package com.apex.ecommerce.register;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.apex.ecommerce.core.ApexBaseTest;
import com.apex.ecommerce.register.constant.RegisterConstant;
import com.apex.ecommerce.register.page.Registerpage;

public class RegisterTest2 extends RegisterBaseTest implements RegisterConstant {
	@Test(dataProvider = "SignupData")
	public void testSuccessSignup(String gender, String fname, String lname, String day, String month, String year,
			String email, String hno, String street, String town, String county, String country, String postcode,
			String mphone, String ephone, String pwd, String cpwd, String newsletter, String terms)
			throws InterruptedException {
		Registerpage Regpage = new Registerpage(driver);
		Regpage.signupPage(gender, fname, lname, day, month, year, email, hno, street, town, county, country, postcode,
				mphone, ephone, pwd, cpwd, newsletter, terms);
		try {
			if (driver.findElement(By.xpath("//div[@class='fntstyle']")).getText().contains("Thank you for signing up"))
				driver.navigate().back();
		} catch (Exception e) {
			if(driver.findElement(By.xpath(EXISTUSER_XPATH_LOCATOR)).getText().equals("This email address is already registered.")){
				Assert.assertEquals(driver.findElement(By.xpath(EXISTUSER_XPATH_LOCATOR)).getText(),"This email address is already registered.");
			}
			else
				Assert.assertEquals(driver.findElement(By.xpath(EXISTUSER_XPATH_LOCATOR)).getText(), "You must agree to the terms and conditions before you can sign up.");

		}
	}

	@DataProvider(name = "SignupData")
	public String[][] getData() throws IOException {
		String path = System.getProperty("user.dir") + "/src/test/java/com/apex/ecommerce/utils/signup.xlsx";

		System.out.println(path);
		FileInputStream file = new FileInputStream(path);
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("sheet2");
		int rowcount = sheet.getLastRowNum();
		int columncount = sheet.getRow(0).getLastCellNum();
		String[][] logindata = new String[rowcount][columncount];
		for (int i = 1; i <= rowcount; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < columncount; j++) {
				try {
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
