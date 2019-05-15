package com.gson.sample;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonSample {

	public static void main(String[] args) {
		Person person = new Person();
		person.setId(20);
		person.setName("sravanrthi");
		person.setAge(40);
		System.out.println("---Object to JSON--------------");
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String jsonString = gson.toJson(person);
		System.out.println(jsonString);

		System.out.println("---JSON to Object--------------");

		String jsonData = "{\r\n" + "  \"id\": 20,\r\n" + "  \"name\": \"sravanrthi\",\r\n" + "  \"age\": 40\r\n" + "}";
		Person person1 = gson.fromJson(jsonData, Person.class);
		System.out.println(person1);
	}
}
