package com.apex.customer.service.test;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.apex.customer.service.bean.Customer;

import base.com.apex.customer.service.test.core.ApexHttpClientUtil;
import base.com.apex.customer.service.test.core.JSONUtil;

public class CustomerServicePOST_Parsing_JSON_Test implements CustomerServiceConstant {
	@Test
	public void testPostWithSuccessData() throws ClientProtocolException, IOException {
		Customer customer = new Customer();
		customer.setId(14);
		customer.setFirstname("Jasmine");
		customer.setLastname("Rachel");
		customer.setStreet("Walnut");
		customer.setCity("Fremont");
		String postMessage = JSONUtil.getJsonFromObject(customer);
		System.out.println(postMessage);
		HttpResponse response = ApexHttpClientUtil.sendreceivePostRequest(JSONURL_2, postMessage);
		try {
			Assert.assertEquals(response.getStatusLine().getStatusCode(), 201);
			Assert.assertEquals(response.getStatusLine().getReasonPhrase(), "Created");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
