package com.apex.customer.service.test;

import java.io.IOException;

import javax.xml.bind.JAXBException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.util.EntityUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.apex.customer.service.bean.Customer;
import com.apex.customer.service.bean.CustomerList;

import base.com.apex.customer.service.test.core.ApexHttpClientUtil;
import base.com.apex.customer.service.test.core.XMLUtil;

public class CustomerServiceGET_Parsing_Test implements CustomerServiceConstant{
	HttpResponse response;
	String respnseString;
	Customer customer;
	CustomerList customerList;
	@Test
	public void testGetWithSuccessData() throws ClientProtocolException,IOException, JAXBException {
		
		response=ApexHttpClientUtil.sendreceiveGetRequest(URL+2000);
		respnseString=EntityUtils.toString(response.getEntity());
		customer=XMLUtil.getobjectFromXML(respnseString);
		System.out.println(customer);
		try {
		Assert.assertEquals(customer.getFirstname(),"Godha");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public void testGetWithBlank() throws ClientProtocolException,IOException, JAXBException {
		
		response=ApexHttpClientUtil.sendreceiveGetRequest(URL);
		respnseString=EntityUtils.toString(response.getEntity());
		customerList=XMLUtil.getobjectFromXML_CustomerList(respnseString);
		System.out.println(customerList.getCustomerId());
		try {
			Assert.assertEquals(customerList.getCustomerId(),2000);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public void testGetwithNonDigit() throws ClientProtocolException, IOException {
		
		response=ApexHttpClientUtil.sendreceiveGetRequest(URL+"$");
		try {
			Assert.assertEquals(response.getStatusLine().getStatusCode(), 404);
			Assert.assertEquals(response.getStatusLine().getReasonPhrase(), "Not Found");
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		@Test
		public void testGetwithNotExisting() throws ClientProtocolException, IOException {
			
			response=ApexHttpClientUtil.sendreceiveGetRequest(URL+1000);
			try {
			Assert.assertEquals(response.getStatusLine().getStatusCode(), 404);
			Assert.assertEquals(response.getStatusLine().getReasonPhrase(), "Not Found");
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		@Test
		public void testGetwithString() throws ClientProtocolException, IOException {
			
			response=ApexHttpClientUtil.sendreceiveGetRequest(URL+"Laura");
			try {
			Assert.assertEquals(response.getStatusLine().getStatusCode(), 404);
			Assert.assertEquals(response.getStatusLine().getReasonPhrase(), "Not Found");
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	
}
