package com.apex.customer.service.test;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.com.apex.customer.service.test.core.ApexHttpClientUtil;

public class CustomerServiceDELETE_Test implements CustomerServiceConstant {

	HttpResponse response;

	@Test
	public void testDeleteWithSuccessData() throws ClientProtocolException, IOException {

		response = ApexHttpClientUtil.sendreceiveDeleteRequest(URL + 109);
		try {
			Assert.assertEquals(response.getStatusLine().getStatusCode(), 200);
			Assert.assertEquals(response.getStatusLine().getReasonPhrase(), "OK");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public void testDeleteWithoutData() throws ClientProtocolException, IOException {
		response = ApexHttpClientUtil.sendreceiveDeleteRequest(URL);
		try {
			Assert.assertEquals(response.getStatusLine().getStatusCode(), 200);
			Assert.assertEquals(response.getStatusLine().getReasonPhrase(), "OK");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void testDeleteWithNotExistingData() throws ClientProtocolException, IOException {
		response = ApexHttpClientUtil.sendreceiveDeleteRequest(URL + 109);
		try {
			Assert.assertEquals(response.getStatusLine().getStatusCode(), 200);
			Assert.assertEquals(response.getStatusLine().getReasonPhrase(), "OK");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void testDeleteWithNonDigitData() throws ClientProtocolException, IOException {
		response = ApexHttpClientUtil.sendreceiveDeleteRequest(URL + "@#$");
		try {
			Assert.assertEquals(response.getStatusLine().getStatusCode(), 200);
			Assert.assertEquals(response.getStatusLine().getReasonPhrase(), "OK");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void testDeleteWithStringData() throws ClientProtocolException, IOException {
		response = ApexHttpClientUtil.sendreceiveDeleteRequest(URL + "Sam");
		try {
			Assert.assertEquals(response.getStatusLine().getStatusCode(), 200);
			Assert.assertEquals(response.getStatusLine().getReasonPhrase(), "OK");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/*
	 * public void testDeleteWithSuccessIDParameterData_All() throws
	 * ClientProtocolException, IOException {
	 * response=ApexHttpClientUtil.sendreceiveDeleteRequest(URL+"ID"); try {
	 * Assert.assertEquals(response.getStatusLine().getStatusCode(), 200);
	 * Assert.assertEquals(response.getStatusLine().getReasonPhrase(), "OK"); }
	 * catch (Exception e) { e.printStackTrace(); } }
	 */
}
