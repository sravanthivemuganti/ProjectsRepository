package com.apex.customer.service.test;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.com.apex.customer.service.test.core.ApexHttpClientUtil;

public class CustomerServicePUT_Test implements CustomerServiceConstant{
	
	HttpResponse response;
	@Test
	public void testPutWithSuccessIdAllData() throws ClientProtocolException, IOException {
		response=ApexHttpClientUtil.sendreceivePutRequest(URL_PUT,PUT_REQUEST_MESSAGE_ID);
		try {
			Assert.assertEquals(response.getStatusLine().getStatusCode(), 201);
			Assert.assertEquals(response.getStatusLine().getReasonPhrase(), "OK");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public void testPutWithoutIdData() throws ClientProtocolException, IOException {
		response=ApexHttpClientUtil.sendreceivePutRequest(URL_PUT,PUT_REQUEST_MESSAGE_WITHOUT_ID);
		try {
			Assert.assertEquals(response.getStatusLine().getStatusCode(), 500);
			Assert.assertEquals(response.getStatusLine().getReasonPhrase(), "Internal Server Error");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public void testPutUpdateIdData() throws ClientProtocolException, IOException {
		response=ApexHttpClientUtil.sendreceivePutRequest(URL_PUT,PUT_REQUEST_MESSAGE_UPDATE_ID);
		try {
			Assert.assertEquals(response.getStatusLine().getStatusCode(), 500);
			Assert.assertEquals(response.getStatusLine().getReasonPhrase(), "Internal Server Error");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
