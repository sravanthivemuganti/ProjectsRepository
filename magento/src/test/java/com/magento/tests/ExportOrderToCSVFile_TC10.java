package com.magento.tests;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.magento.pages.ExportOrdersToCSVFileConstant;
import com.magento.pages.ExportOrdersToCSVFilePage;

public class ExportOrderToCSVFile_TC10 implements ExportOrdersToCSVFileConstant {

	@Test
	public void exportOrderToCSVFile() throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(BASEURL);
		ExportOrdersToCSVFilePage pageObject =new ExportOrdersToCSVFilePage(driver);
		pageObject.setUserNmaeElem();
		pageObject.setPasswordElem();
		pageObject.getLoginButtonClick();
		for(String handle:driver.getWindowHandles()) {
			driver.switchTo().window(handle);
			driver.findElement(By.xpath(POPUPWINDOW_CLOSE_XPATH_LOCATOR)).click();
		}
		pageObject.getSalesClick();
		pageObject.getOrdersClick();
		pageObject.getExportClick();
		Thread.sleep(4000);
				
		String file="C:\\Users\\vgsgo\\Downloads\\orders.csv";
		FileReader fr=new FileReader(file);
		BufferedReader br=new BufferedReader(fr);
		String lineText=br.readLine();
		while(lineText!=null) {
			System.out.println(lineText);
			lineText=br.readLine();
		}
		fr.close();
		br.close();
	}
}
