package com.apex.testng.my_selenium_testng_tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LoginReadingFromXL {

	public static void main(String[] args) throws IOException{
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"/src/test/java/com/apex/ecommerce/data/login.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("sheet1");
		
		for (int i = 1; i <= sheet.getLastRowNum() ; i++) {
			XSSFRow row=sheet.getRow(i);
			for(int j=0;j<sheet.getRow(i).getLastCellNum();j++)
			{
				String data=row.getCell(j).toString();
				System.out.println(data);
			}
			
		}
		
	}
}
