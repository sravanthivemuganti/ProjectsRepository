package com.apex.customer.service.test;

import java.io.IOException;

import javax.xml.bind.JAXBException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.util.EntityUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.apex.customer.service.bean.Customer;

import base.com.apex.customer.service.test.core.ApexHttpClientUtil;
import base.com.apex.customer.service.test.core.XMLUtil;

public class CustomerServicePOST_Parsing_Test implements CustomerServiceConstant{

	@Test
	public void testPostWithSuccessData() throws ClientProtocolException, IOException, JAXBException {
		Customer customer =new Customer();
		customer.setId(200);
		customer.setFirstname("Jessica");
		customer.setLastname("Farmer");
		customer.setStreet("Capital Ave");
		customer.setCity("Fremont");
		
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
}
