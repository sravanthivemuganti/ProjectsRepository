package com.apex.testng.my_selenium_testng_tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EcommerceSignupPage extends EcommerceSignupBaseClass implements EcommerceInterfaceConstant {

	@Test(dataProvider = "SignupData")
	public void signupPage(String gender, String fname, String lname, String day, String month, String year,
			String email, String hno, String street, String town, String county, String country, String postcode,
			String mphone, String ephone, String pwd, String cpwd, String newsletter, String terms)
			throws InterruptedException {
		driver.findElement(By.className(CONTINUE_CONSTANT)).click();
		if (gender.contentEquals("M"))
			driver.findElement(By.xpath("//input[@name='radiobutton' and @value=1]")).click();
		else if (gender.equalsIgnoreCase("F"))
			driver.findElement(By.xpath("//input[@name='radiobutton' and @value=2]")).click();

		driver.findElement(By.name(FNAME_CONSTANT)).sendKeys(fname);
		driver.findElement(By.name(LNAME_CONSTANT)).sendKeys(lname);
		driver.findElement(By.name(DAY_CONSTANT)).sendKeys(day);
		driver.findElement(By.name(MONTH_CONSTANT)).sendKeys(month);
		driver.findElement(By.name(YEAR_CONSTANT)).sendKeys(year);
		driver.findElement(By.name(EMAIL_SIGNUP_CONSTANT)).sendKeys(email);
		driver.findElement(By.name(HOUSENO_CONSTANT)).sendKeys(hno);
		driver.findElement(By.name(ADD1_CONSTANT)).sendKeys(street);
		driver.findElement(By.name(CITY_CONSTANT)).sendKeys(town);
		driver.findElement(By.name(STATE_CONSTANT)).sendKeys(county);
		driver.findElement(By.name(COUNTRY_CONSTANT)).sendKeys(country);
		driver.findElement(By.name(POSTCODE_CONSTANT)).sendKeys(postcode);
		driver.findElement(By.name(PHONE_CONSTANT)).sendKeys(mphone);
		driver.findElement(By.name(FAX_CONSTANT)).sendKeys(ephone);
		driver.findElement(By.name(PASSWORD_SIGNUP_CONSTANT)).sendKeys(pwd);
		driver.findElement(By.name(CPASSWORD_CONSTANT)).sendKeys(cpwd);
		if (newsletter.equals("1") && !driver.findElement(By.name(NEWSLETTER_CONSTANT)).isSelected()) {
			driver.findElement(By.name(NEWSLETTER_CONSTANT)).click();
		}
		if (terms.equals("1") && !driver.findElement(By.name(TERMS_CONSTANT)).isSelected())
			driver.findElement(By.name(TERMS_CONSTANT)).click();
		driver.findElement(By.name(SUBMIT_CONSTANT)).click();
			driver.navigate().back();
	}

	@DataProvider(name = "SignupData")
	public String[][] getDat() throws IOException {
		String path = System.getProperty("user.dir") + "/src/test/java/com/apex/ecommerce/data/signup.xlsx";

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
