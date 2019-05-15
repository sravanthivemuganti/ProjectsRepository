package com.apex.customer.service.test;

import java.io.FileInputStream;
import java.io.IOException;

import javax.xml.bind.JAXBException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.apex.customer.service.bean.Customer;

import base.com.apex.customer.service.test.core.ApexHttpClientUtil;
import base.com.apex.customer.service.test.core.XMLUtil;

public class CustomerServicePOST_Parsing_DataDriven_Test implements CustomerServiceConstant{

	@Test(dataProvider="customerdata")
	public void testPostWithSuccessData(String id,String firstname,String lastname,String street,String city) throws ClientProtocolException, IOException, JAXBException {
		Customer customer =new Customer();
		customer.setId(Integer.parseInt(id));
		customer.setFirstname(firstname);
		customer.setLastname(lastname);
		customer.setStreet(street);
		customer.setCity(city);
		
		String postMessage=XMLUtil.gerXMLFromObject(customer); 
		System.out.println(postMessage);
		HttpResponse response = ApexHttpClientUtil.sendreceivePostRequest(URL, postMessage);
		
		try {
			Assert.assertEquals(response.getStatusLine().getStatusCode(), 201);
			Assert.assertEquals(response.getStatusLine().getReasonPhrase(), "Created");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@DataProvider(name="customerdata")
	private String[][] getData() throws IOException{	
		String path=System.getProperty("user.dir")+"/src/test/java/base/com/apex/customer/service/test/core/CUSTOMER_DATA.xlsx";
		FileInputStream fileInputStream=new FileInputStream(path);
		XSSFWorkbook workbook=new XSSFWorkbook(fileInputStream);
		XSSFSheet sheet=workbook.getSheet("sheet2");
		int rowcount=sheet.getLastRowNum();
		int columncount=sheet.getRow(0).getLastCellNum();
		System.out.println("row count: "+rowcount+"   column count  "+columncount);
		String[][] customerData=new String[rowcount][columncount];
		for(int i=1;i<=rowcount;i++) {
			for(int j=0;j<columncount;j++) {
				try {
					XSSFCell cell=sheet.getRow(i).getCell(j);
					DataFormatter formatter=new DataFormatter();
					customerData[i-1][j]=formatter.formatCellValue(cell);
				}
				catch (Exception e) {
					customerData[i-1][j]="";
				}
			}
		}
		return customerData;
	}
}
