package com.apex.customer.service.test;

import java.io.IOException;

import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.testng.annotations.Test;

public class GetResponseHeader {
	@Test
	public void getHeaders() throws ClientProtocolException, IOException {
	HttpClient client=HttpClientBuilder.create().build();
	HttpGet request=new HttpGet("http://www.thomas-bayer.com/sqlrest/CUSTOMER/2");
	HttpResponse response=client.execute(request);
	Header[] headers=response.getHeaders("content-type");
	Header[] headersall=response.getAllHeaders();
	System.out.println(headers[0]);
	for(int i=0;i<headersall.length;i++) {
	System.out.println(headersall[i]);
	}
	}
}
