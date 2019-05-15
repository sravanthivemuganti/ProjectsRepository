package com.apex.customer.service.test;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CustomerDataPOST_TestNG {
	@Test(dataProvider = "customerdata")
	public void customerSuccessPOST(String Id, String fname, String lname, String street, String city)
			throws ClientProtocolException, IOException {
		String url = "http://www.thomas-bayer.com/sqlrest/CUSTOMER/";
		String entityString = "<CUSTOMER xmlns:xlink=\"http://www.w3.org/1999/xlink\">\r\n" + "    <ID>" + Id
				+ "</ID>\r\n" + "    <FIRSTNAME>" + fname + "</FIRSTNAME>\r\n" + "    <LASTNAME>" + lname
				+ "</LASTNAME>\r\n" + "    <STREET>20 " + street + "</STREET>\r\n" + "    <CITY>" + city + "</CITY>\r\n"
				+ "</CUSTOMER>";
		// System.out.println(entityString);
		HttpClient client = HttpClientBuilder.create().build();
		HttpPost httpPost = new HttpPost(url);
		httpPost.setEntity(new StringEntity(entityString));
		HttpResponse response = client.execute(httpPost);
		Assert.assertEquals(response.getStatusLine().getStatusCode(), 201);
		Assert.assertEquals(response.getStatusLine().getReasonPhrase(), "Created");

	}

	@DataProvider(name = "customerdata")
	private String[][] getData() throws IOException {
		String path = System.getProperty("user.dir")
				+ "/src/test/java/base/com/apex/customer/service/test/core/CUSTOMER_DATA.xlsx";
		FileInputStream file = new FileInputStream(path);
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("sheet1");
		int rowcount = sheet.getLastRowNum();
		int columncount = sheet.getRow(0).getLastCellNum();
		String[][] customerData = new String[rowcount][columncount];
		for (int i = 1; i <= rowcount; i++) {
			for (int j = 0; j < columncount; j++) {
				try {
					XSSFCell cell = sheet.getRow(i).getCell(j);
					DataFormatter formatter = new DataFormatter();
					customerData[i - 1][j] = formatter.formatCellValue(cell);
				} catch (Exception e) {
					customerData[i - 1][j] = "";
				}
			}
		}
		return customerData;
	}
}
