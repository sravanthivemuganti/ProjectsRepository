package base.com.apex.customer.service.test.core;

import java.io.IOException;

import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class RestClient {

	public void get(String url) {
		CloseableHttpClient httpClient=HttpClients.createDefault();
		HttpGet request=new HttpGet("http://www.thomas-bayer.com/sqlrest/CUSTOMER/109");
		
			
	}
}
