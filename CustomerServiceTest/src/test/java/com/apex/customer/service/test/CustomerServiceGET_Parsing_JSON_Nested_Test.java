package com.apex.customer.service.test;

import java.io.IOException;

import javax.xml.bind.JAXBException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.util.EntityUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.apex.customer.service.bean.UserData;
import base.com.apex.customer.service.test.core.ApexHttpClientUtil;
import base.com.apex.customer.service.test.core.JSONUtil;

public class CustomerServiceGET_Parsing_JSON_Nested_Test implements CustomerServiceConstant {
	HttpResponse response;
	String respnseString;
	UserData userData;
	// Success Data
	@Test
	public void testGetWithSuccessData() throws ClientProtocolException, IOException, JAXBException {
		response = ApexHttpClientUtil.sendreceiveGetRequest(JSONURL + "/1");
		respnseString = EntityUtils.toString(response.getEntity());
		System.out.println(respnseString);
		userData = JSONUtil.getobjectFromJSON_Nested(respnseString);
		System.out.println(userData);
		try {
			Assert.assertEquals(userData.getUsernestedData().getFirst_name(), "George");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	// Empty data or not existing data
	@Test
	public void testGetWithEmptyData() throws ClientProtocolException, IOException, JAXBException {
		response = ApexHttpClientUtil.sendreceiveGetRequest(JSONURL + "/100");
		respnseString = EntityUtils.toString(response.getEntity());
		System.out.println(respnseString);
		userData = JSONUtil.getobjectFromJSON_Nested(respnseString);
		try {
			Assert.assertNull(userData.getUsernestedData()); //null data {}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	// passing String 
	@Test
	public void testGetWithStringData() throws ClientProtocolException, IOException, JAXBException {
		response = ApexHttpClientUtil.sendreceiveGetRequest(JSONURL + "/George");
		respnseString = EntityUtils.toString(response.getEntity());
		System.out.println(respnseString);
		userData = JSONUtil.getobjectFromJSON_Nested(respnseString);
		try {
			Assert.assertNull(userData.getUsernestedData()); //null data {}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	// passing Special Character 
	@Test
	public void testGetWithSpecialCharacterData() throws ClientProtocolException, IOException, JAXBException {
		response = ApexHttpClientUtil.sendreceiveGetRequest(JSONURL + "/@");
		respnseString = EntityUtils.toString(response.getEntity());
		System.out.println(respnseString);
		userData = JSONUtil.getobjectFromJSON_Nested(respnseString);
		try {
			Assert.assertNull(userData.getUsernestedData()); //null data {}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
