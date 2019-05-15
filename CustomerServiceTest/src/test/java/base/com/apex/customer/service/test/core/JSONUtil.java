package base.com.apex.customer.service.test.core;

import javax.xml.bind.JAXBException;

import com.apex.customer.service.bean.Customer;
import com.apex.customer.service.bean.User;
import com.apex.customer.service.bean.UserData;
import com.apex.customer.service.bean.UsersPage;
import com.google.gson.Gson;
import com.gson.sample.Person;

public class JSONUtil {
	public static User getobjectFromJSON(String jsonMessage) throws JAXBException {
		Gson gson = new Gson();
		User user = gson.fromJson(jsonMessage, User.class);
		System.out.println(user.getBody());
		return user;
	}

	public static UserData getobjectFromJSON_Nested(String jsonMessage) throws JAXBException {
		Gson gson = new Gson();
		UserData userData = gson.fromJson(jsonMessage, UserData.class);
		return userData;
	}
	
	public static UsersPage getobjectFromJSON_UserPage(String jsonMessage) throws JAXBException {
		Gson gson = new Gson();
		UsersPage usersPage = gson.fromJson(jsonMessage, UsersPage.class);
		return usersPage;
	}
	public static String getJsonFromObject(Customer customer) {
		Gson gson = new Gson();
		String jsonString = gson.toJson(customer);
		return jsonString;
	}

	public static String getJsonFromObject_Nested(UserData user) {
		Gson gson = new Gson();
		String jsonString = gson.toJson(user);
		return jsonString;
	}

}
