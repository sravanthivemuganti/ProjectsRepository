package com.apex.eom.webservices.tests;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

public class WebServiceTest_1 {

	public static void main(String[] args) throws ClientProtocolException, IOException{
		String url="http://www.thomas-bayer.com/sqlrest/CUSTOMER/100";
		//connect
		HttpClient client=HttpClientBuilder.create().build();
		//set the data
		HttpGet request=new HttpGet(url);
		//send and receive the response
		HttpResponse response=client.execute(request);
		//validate
		System.out.println(response.getStatusLine().getStatusCode());
		System.out.println(response.getStatusLine().getReasonPhrase());
	}
}
