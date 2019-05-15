package base.com.apex.customer.service.test.core;

import java.io.File;
import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;

public class ApexHttpClientUtil {
	public static HttpResponse sendreceiveGetRequest(String url) throws ClientProtocolException, IOException {
		HttpClient client = HttpClientBuilder.create().build();
		HttpGet request = new HttpGet(url);
		HttpResponse response = client.execute(request);
		return response;
	}

	public static HttpResponse sendreceivePostRequest(String url, String requestMessage)
			throws ClientProtocolException, IOException {
		HttpClient client = HttpClientBuilder.create().build();
		HttpPost request = new HttpPost(url);
		StringEntity stringEntity = new StringEntity(requestMessage);
		request.setEntity(stringEntity);
		HttpResponse response = client.execute(request);
		return response;
	}

	public static HttpResponse sendreceivePostRequest_File(String url, File file)
			throws ClientProtocolException, IOException {
		HttpClient client = HttpClientBuilder.create().build();
		HttpPut request = new HttpPut(url);
		HttpResponse response = client.execute(request);
		return response;
	}

	public static HttpResponse sendreceivePutRequest(String url, String requestMessage)
			throws ClientProtocolException, IOException {
		HttpClient client = HttpClientBuilder.create().build();
		HttpPut request = new HttpPut(url);
		StringEntity stringEntity = new StringEntity(requestMessage);
		request.setEntity(stringEntity);
		HttpResponse response = client.execute(request);
		return response;
	}

	public static HttpResponse sendreceiveDeleteRequest(String url) throws ClientProtocolException, IOException {
		HttpClient client = HttpClientBuilder.create().build();
		HttpDelete request = new HttpDelete(url);
		HttpResponse response = client.execute(request);
		return response;
	}
}
