package com.apex.api_testing;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ClientServiceTest extends ClientServiceGET_BaseTest {
	HttpResponse response;
	@Test
	public void testGetWithSuccessData() throws ClientProtocolException,IOException {
		String url="http://www.thomas-bayer.com/sqlrest/CUSTOMER/1";
		response=clientGET_BaseTest(url);
		Assert.assertEquals(response.getStatusLine().getStatusCode(), 200);
		Assert.assertEquals(response.getStatusLine().getReasonPhrase(), "OK");
	}
	@Test
	public void testGetWithBlank() throws ClientProtocolException, IOException {
		String url="http://www.thomas-bayer.com/sqlrest/CUSTOMER/";
		response=clientGET_BaseTest(url);
		Assert.assertEquals(response.getStatusLine().getStatusCode(), 200);
		Assert.assertEquals(response.getStatusLine().getReasonPhrase(), "OK");
	}
	@Test
	public void testGetwithNonDigit() throws ClientProtocolException, IOException {
		String url="http://www.thomas-bayer.com/sqlrest/CUSTOMER/$";
		response=clientGET_BaseTest(url);
		Assert.assertEquals(response.getStatusLine().getStatusCode(), 404);
		Assert.assertEquals(response.getStatusLine().getReasonPhrase(), "Not Found");
	}
	@Test
	public void testGetwithNotExisting() throws ClientProtocolException, IOException {
		String url="http://www.thomas-bayer.com/sqlrest/CUSTOMER/100";
		response=clientGET_BaseTest(url);
		Assert.assertEquals(response.getStatusLine().getStatusCode(), 404);
		Assert.assertEquals(response.getStatusLine().getReasonPhrase(), "Not Found");
	}
	@Test
	public void testGetwithString() throws ClientProtocolException, IOException {
		String url="http://www.thomas-bayer.com/sqlrest/CUSTOMER/Laura";
		response=clientGET_BaseTest(url);
		Assert.assertEquals(response.getStatusLine().getStatusCode(), 404);
		Assert.assertEquals(response.getStatusLine().getReasonPhrase(), "Not Found");
	}

}
