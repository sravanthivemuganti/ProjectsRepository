package com.apex.api_testing;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

public class ClientServiceGET_BaseTest {
	
	public static HttpResponse clientGET_BaseTest(String url) throws ClientProtocolException, IOException {
	HttpClient client=HttpClientBuilder.create().build();
	HttpGet request= new HttpGet(url);
	HttpResponse response=client.execute(request);
	return response;
	}
}
