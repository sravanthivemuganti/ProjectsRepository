package com.apex.customer.service.test;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.com.apex.customer.service.test.core.ApexHttpClientUtil;

public class CustomerServicePOST_Test implements CustomerServiceConstant {
	HttpResponse response;

	@Test(priority = 1)
	public void testPostWithSuccessData() throws ClientProtocolException, IOException {
		response = ApexHttpClientUtil.sendreceivePostRequest(URL, POST_REQUEST_MESSAGE_ID_DIGIT);
		try {
			Assert.assertEquals(response.getStatusLine().getStatusCode(), 201);
			Assert.assertEquals(response.getStatusLine().getReasonPhrase(), "Created");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 2)
	public void testPostWithExistingData() throws ClientProtocolException, IOException {
		response = ApexHttpClientUtil.sendreceivePostRequest(URL, POST_REQUEST_MESSAGE_ID_DIGIT);
		try {
			Assert.assertEquals(response.getStatusLine().getStatusCode(), 500);
			Assert.assertEquals(response.getStatusLine().getReasonPhrase(), "Internal Server Error");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 3)
	public void testPostWithStringData() throws ClientProtocolException, IOException {
		response = ApexHttpClientUtil.sendreceivePostRequest(URL, POST_REQUEST_MESSAGE_ID_STRING);
		try {
			Assert.assertEquals(response.getStatusLine().getStatusCode(), 500);
			Assert.assertEquals(response.getStatusLine().getReasonPhrase(), "Internal Server Error");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 4)
	public void testPostWithNonDigitData() throws ClientProtocolException, IOException {
		response = ApexHttpClientUtil.sendreceivePostRequest(URL, POST_REQUEST_MESSAGE_ID_NONDIDGIT);
		try {
			Assert.assertEquals(response.getStatusLine().getStatusCode(), 500);
			Assert.assertEquals(response.getStatusLine().getReasonPhrase(), "Internal Server Error");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 5)
	public void testPostWithBlankData() throws ClientProtocolException, IOException {
		response = ApexHttpClientUtil.sendreceivePostRequest(URL, POST_REQUEST_MESSAGE_ID_BLANK);
		try {
			Assert.assertEquals(response.getStatusLine().getStatusCode(), 500);
			Assert.assertEquals(response.getStatusLine().getReasonPhrase(), "Internal Server Error");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 6)
	public void testPostWithIdOnlyData() throws ClientProtocolException, IOException {
		response = ApexHttpClientUtil.sendreceivePostRequest(URL, POST_REQUEST_MESSAGE_ONLY_ID);
		try {
			Assert.assertEquals(response.getStatusLine().getStatusCode(), 201);
			Assert.assertEquals(response.getStatusLine().getReasonPhrase(), "Internal Server Error");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 7)
	public void testPostWithoutIdData() throws ClientProtocolException, IOException {
		response = ApexHttpClientUtil.sendreceivePostRequest(URL, POST_REQUEST_MESSAGE_WITHOUT_ID);
		try {
			Assert.assertEquals(response.getStatusLine().getStatusCode(), 500);
			Assert.assertEquals(response.getStatusLine().getReasonPhrase(), "Internal Server Error");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
