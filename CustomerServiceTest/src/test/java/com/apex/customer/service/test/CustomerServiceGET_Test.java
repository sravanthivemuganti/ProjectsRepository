package com.apex.customer.service.test;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.com.apex.customer.service.test.core.ApexHttpClientUtil;
import base.com.apex.customer.service.test.core.XMLUtil;

public class CustomerServiceGET_Test implements CustomerServiceConstant{
	HttpResponse response;
	@Test
	public void testGetWithSuccessData() throws ClientProtocolException,IOException {
		
		response=ApexHttpClientUtil.sendreceiveGetRequest(URL+109);
	
		try {
		Assert.assertEquals(response.getStatusLine().getStatusCode(), 200);
		Assert.assertEquals(response.getStatusLine().getReasonPhrase(), "OK");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public void testGetWithBlank() throws ClientProtocolException, IOException {
		
		response=ApexHttpClientUtil.sendreceiveGetRequest(URL);
		try {
		Assert.assertEquals(response.getStatusLine().getStatusCode(), 200);
		Assert.assertEquals(response.getStatusLine().getReasonPhrase(), "OK");
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
		
		response=ApexHttpClientUtil.sendreceiveGetRequest(URL+100);
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
