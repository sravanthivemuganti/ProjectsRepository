package com.apex.eom.webservices.tests;

import java.io.IOException;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CustomerDataPOST_TestNG {
	@Test
	public void customerSuccessPOST() throws ClientProtocolException, IOException {
		String url = "http://www.thomas-bayer.com/sqlrest/CUSTOMER/";
		String entityString = "<CUSTOMER xmlns:xlink=\"http://www.w3.org/1999/xlink\">\r\n" + "    <ID>109</ID>\r\n"
				+ "    <FIRSTNAME>Sam</FIRSTNAME>\r\n" + "    <LASTNAME>Ram</LASTNAME>\r\n"
				+ "    <STREET>20 Capital Ave</STREET>\r\n" + "    <CITY>Fremont</CITY>\r\n" + "</CUSTOMER>";
		HttpClient client = HttpClientBuilder.create().build();
		HttpPost httpPost = new HttpPost(url);
		httpPost.setEntity(new StringEntity(entityString));
		HttpResponse response = client.execute(httpPost);
			Assert.assertEquals(response.getStatusLine().getStatusCode(), 201);
			Assert.assertEquals(response.getStatusLine().getReasonPhrase(), "Created");		
	}
}
