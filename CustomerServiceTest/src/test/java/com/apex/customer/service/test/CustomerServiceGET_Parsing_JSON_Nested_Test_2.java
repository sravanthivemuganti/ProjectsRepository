package com.apex.customer.service.test;

import java.io.IOException;

import javax.xml.bind.JAXBException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.util.EntityUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.apex.customer.service.bean.UsersPage;

import base.com.apex.customer.service.test.core.ApexHttpClientUtil;
import base.com.apex.customer.service.test.core.JSONUtil;

public class CustomerServiceGET_Parsing_JSON_Nested_Test_2 {

	@Test
	public void testGetWithSuccessData() throws ClientProtocolException, IOException, JAXBException {
		HttpResponse response=ApexHttpClientUtil.sendreceiveGetRequest("https://reqres.in/api/users?page=1");
		String responseString=EntityUtils.toString(response.getEntity());
		System.out.println(responseString);
		UsersPage usersPage=JSONUtil.getobjectFromJSON_UserPage(responseString);
		System.out.println(usersPage);
		try {
			Assert.assertEquals(usersPage.getPage(), 1);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
