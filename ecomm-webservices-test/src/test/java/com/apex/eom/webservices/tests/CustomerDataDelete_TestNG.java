package com.apex.eom.webservices.tests;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.impl.client.HttpClientBuilder;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CustomerDataDelete_TestNG {

	@Test
	public void customerSuccessDelete() throws ClientProtocolException, IOException {
		String url = "http://www.thomas-bayer.com/sqlrest/CUSTOMER/109";
		HttpClient client = HttpClientBuilder.create().build();
		HttpDelete request = new HttpDelete(url);
		HttpResponse response = client.execute(request);
			Assert.assertEquals(response.getStatusLine().getStatusCode(), 200);
			Assert.assertEquals(response.getStatusLine().getReasonPhrase(), "OK");
		}
}
