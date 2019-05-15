package com.apex.customer.service.test;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.apex.customer.service.bean.UserData;
import com.apex.customer.service.bean.UserData.UserNestedData;
import com.apex.customer.service.bean.UsersPage;

import base.com.apex.customer.service.test.core.ApexHttpClientUtil;
import base.com.apex.customer.service.test.core.JSONUtil;

public class CustomerServicePOST_Parsing_JSON_Nested_Test implements CustomerServiceConstant {
	@Test
	public void testPostWithSuccessData() throws ClientProtocolException, IOException {
		UserData userData = new UserData();
		//UserData.UserNestedData data= new UserData.UserNestedData();
		UserNestedData userNestedData = new UserNestedData();
		userData.setUsernestedData(userNestedData);
		userNestedData.setId(30);
		userNestedData.setFirst_name("Jessica");
		userNestedData.setLast_name("Farmer");
		userNestedData.setEmail("jessica.farmer@gmail.com");
		userNestedData.setAvatar("https://s3.amazonaws.com/uifaces/faces/twitter/bigmancho/128.jpg");
		System.out.println(userData);
		String postMessage = JSONUtil.getJsonFromObject_Nested(userData);
		System.out.println(postMessage);
		HttpResponse response = ApexHttpClientUtil.sendreceivePostRequest(JSONURL, postMessage);
		try {
			Assert.assertEquals(response.getStatusLine().getStatusCode(), 201);
			Assert.assertEquals(response.getStatusLine().getReasonPhrase(), "Created");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
