package com.apex.ecommerce.signon;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.apex.ecommerce.core.ApexBaseTest;
import com.apex.ecommerce.signon.constant.LoginConstant;
import com.apex.ecommerce.signon.page.LoginPage;

public class LoginTestDataDriven extends ApexBaseTest implements LoginConstant {
	@Test(dataProvider = "loginData")
	public void testSuccessLogon(String user, String pwd) {
		// create the page pass the driver
		LoginPage loginpage = new LoginPage(driver);
		// perform action
		// loginpage.clckOnLoginButton("vgs_godha@gmail.com", "vgs");
		loginpage.clckOnLoginButton(user, pwd);
		// validate
		try {
			Assert.assertEquals(driver.findElement(By.xpath(LOGGEDINSUCCESS_XPATH_LOCATOR)).getText(),
					"You have Logged In successfully.");
		} catch (Exception e) {
			Assert.assertEquals(driver.findElement(By.xpath(INVALIDMESSAGE_XPATH_LOCATOR)).getText(),
					"Invalid Username / Password!");
		}
	}

	@DataProvider(name = "loginData")
	private String[][] getData() throws IOException {
		String path = System.getProperty("user.dir") + "/src/test/java/com/apex/ecommerce/utils/login.xlsx";
		FileInputStream file = new FileInputStream(path);
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("sheet1");
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
