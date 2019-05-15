package com.gson.sample;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.apex.customer.service.bean.UserData;
import com.apex.customer.service.bean.User_1;
import com.apex.customer.service.bean.User_Main;
import com.google.gson.Gson;

public class GsonNestedObjectExample {

	//@Test
	public void getSuccessdDataFromJson() {
	String userStringJson ="{\r\n" + 
			"    \"data\": {\r\n" + 
			"        \"id\": 1,\r\n" + 
			"        \"email\": \"george.bluth@reqres.in\",\r\n" + 
			"        \"first_name\": \"George\",\r\n" + 
			"        \"last_name\": \"Bluth\",\r\n" + 
			"        \"avatar\": \"https://s3.amazonaws.com/uifaces/faces/twitter/calebogden/128.jpg\"\r\n" + 
			"    }\r\n" + 
			"}";
	Gson gson=new Gson();
	UserData userData=gson.fromJson(userStringJson, UserData.class);
	Assert.assertEquals(userData.getUsernestedData().getFirst_name(),"George");
	}
	@Test
	public void getSuccessdDataFromJson_2() {
	String userStringJson ="{\"page\":1,\"per_page\":3,\"total\":12,\"total_pages\":4,\"data\":{\"id\":1,\"email\":\"george.bluth@reqres.in\",\"first_name\":\"George\",\"last_name\":\"Bluth\",\"avatar\":\"https://s3.amazonaws.com/uifaces/faces/twitter/calebogden/128.jpg\"}}";
	System.out.println(userStringJson);
	
	Gson gson=new Gson();
	User_Main userData=gson.fromJson(userStringJson, User_Main.class);
	System.out.println(userData);
	}
}
