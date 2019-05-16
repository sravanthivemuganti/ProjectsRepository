package com.apex.eom.webservices.tests;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ClientServiceTestNG {
	
	@Test
	public void testGetWithSuccessData() throws ClientProtocolException,IOException {
		String url="http://www.thomas-bayer.com/sqlrest/CUSTOMER/1";
		HttpClient client=HttpClientBuilder.create().build();
		HttpGet request= new HttpGet(url);
		HttpResponse response=client.execute(request);
		Assert.assertEquals(response.getStatusLine().getStatusCode(), 200);
		Assert.assertEquals(response.getStatusLine().getReasonPhrase(), "OK");
	}
	@Test
	public void testGetWithBlank() throws ClientProtocolException, IOException {
		String url="http://www.thomas-bayer.com/sqlrest/CUSTOMER/";
		HttpClient client=HttpClientBuilder.create().build();
		HttpGet request= new HttpGet(url);
		HttpResponse response=client.execute(request);
		Assert.assertEquals(response.getStatusLine().getStatusCode(), 200);
		Assert.assertEquals(response.getStatusLine().getReasonPhrase(), "OK");
	}
	@Test
	public void testGetwithNonDigit() throws ClientProtocolException, IOException {
		String url="http://www.thomas-bayer.com/sqlrest/CUSTOMER/$";
		HttpClient client=HttpClientBuilder.create().build();
		HttpGet request= new HttpGet(url);
		HttpResponse response=client.execute(request);
		Assert.assertEquals(response.getStatusLine().getStatusCode(), 404);
		Assert.assertEquals(response.getStatusLine().getReasonPhrase(), "Not Found");
	}
	@Test
	public void testGetwithNotExisting() throws ClientProtocolException, IOException {
		String url="http://www.thomas-bayer.com/sqlrest/CUSTOMER/100";
		HttpClient client=HttpClientBuilder.create().build();
		HttpGet request= new HttpGet(url);
		HttpResponse response=client.execute(request);
		Assert.assertEquals(response.getStatusLine().getStatusCode(), 404);
		Assert.assertEquals(response.getStatusLine().getReasonPhrase(), "Not Found");
	}
	@Test
	public void testGetwithString() throws ClientProtocolException, IOException {
		String url="http://www.thomas-bayer.com/sqlrest/CUSTOMER/Laura";
		HttpClient client=HttpClientBuilder.create().build();
		HttpGet request= new HttpGet(url);
		HttpResponse response=client.execute(request);
		Assert.assertEquals(response.getStatusLine().getStatusCode(), 404);
		Assert.assertEquals(response.getStatusLine().getReasonPhrase(), "Not Found");
	}
}
