package com.apex.customer.service.test;

public interface CustomerServiceConstant {

	// URL
	public static final String URL = "http://www.thomas-bayer.com/sqlrest/CUSTOMER/";
	public static final String JSONURL = "https://reqres.in/api/users";
	public static final String JSONURL_2 = "https://jsonplaceholder.typicode.com/posts";
	public static final String URL_PUT = "http://www.thomas-bayer.com/sqlrest/CUSTOMER/108";

	// POST
	public static final String POST_REQUEST_MESSAGE_ID_DIGIT = "<CUSTOMER xmlns:xlink=\"http://www.w3.org/1999/xlink\">\r\n"
			+ "    <ID>109</ID>\r\n" + "    <FIRSTNAME>Josh</FIRSTNAME>\r\n" + "    <LASTNAME>San</LASTNAME>\r\n"
			+ "    <STREET>washington</STREET>\r\n" + "    <CITY>Fremont</CITY>\r\n" + "</CUSTOMER>";
	public static final String POST_REQUEST_MESSAGE_ID_STRING = "<CUSTOMER xmlns:xlink=\"http://www.w3.org/1999/xlink\">\r\n"
			+ "    <ID>Some</ID>\r\n" + "    <FIRSTNAME>Josh</FIRSTNAME>\r\n" + "    <LASTNAME>San</LASTNAME>\r\n"
			+ "    <STREET>washington</STREET>\r\n" + "    <CITY>Fremont</CITY>\r\n" + "</CUSTOMER>";

	public static final String POST_REQUEST_MESSAGE_ID_NONDIDGIT = "<CUSTOMER xmlns:xlink=\"http://www.w3.org/1999/xlink\">\r\n"
			+ "    <ID>@#$</ID>\r\n" + "    <FIRSTNAME>Josh</FIRSTNAME>\r\n" + "    <LASTNAME>San</LASTNAME>\r\n"
			+ "    <STREET>washington</STREET>\r\n" + "    <CITY>Fremont</CITY>\r\n" + "</CUSTOMER>";
	public static final String POST_REQUEST_MESSAGE_ID_BLANK = "<CUSTOMER xmlns:xlink=\"http://www.w3.org/1999/xlink\">\r\n"
			+ "    <ID></ID>\r\n" + "    <FIRSTNAME>Josh</FIRSTNAME>\r\n" + "    <LASTNAME>San</LASTNAME>\r\n"
			+ "    <STREET>washington</STREET>\r\n" + "    <CITY>Fremont</CITY>\r\n" + "</CUSTOMER>";
	public static final String POST_REQUEST_MESSAGE_ONLY_ID = "<CUSTOMER xmlns:xlink=\"http://www.w3.org/1999/xlink\">\r\n"
			+ "    <ID>110</ID>\r\n" + "</CUSTOMER>";
	public static final String POST_REQUEST_MESSAGE_WITHOUT_ID = "<CUSTOMER xmlns:xlink=\"http://www.w3.org/1999/xlink\">\r\n"
			+ "    <FIRSTNAME>Josh</FIRSTNAME>\r\n" + "    <LASTNAME>San</LASTNAME>\r\n"
			+ "    <STREET>washington</STREET>\r\n" + "    <CITY>Fremont</CITY>\r\n" + "</CUSTOMER>";

	// PUT
	public static final String PUT_REQUEST_MESSAGE_ID = "<CUSTOMER xmlns:xlink=\"http://www.w3.org/1999/xlink\">\r\n"
			+ "    <FIRSTNAME>Apex</FIRSTNAME>\r\n" + "    <LASTNAME>Apex</LASTNAME>\r\n"
			+ "    <STREET>Fremont</STREET>\r\n" + "    <CITY>Fremont</CITY>\r\n" + "</CUSTOMER>";
	public static final String PUT_REQUEST_MESSAGE_WITHOUT_ID = "<CUSTOMER xmlns:xlink=\"http://www.w3.org/1999/xlink\">\r\n"
			+ "    <FIRSTNAME>Josh</FIRSTNAME>\r\n" + "    <LASTNAME>San</LASTNAME>\r\n"
			+ "    <STREET>washington</STREET>\r\n" + "    <CITY>Fremont</CITY>\r\n" + "</CUSTOMER>";
	public static final String PUT_REQUEST_MESSAGE_UPDATE_ID = "<CUSTOMER xmlns:xlink=\"http://www.w3.org/1999/xlink\">\r\n"
			+ "    <FIRSTNAME>Josh</FIRSTNAME>\r\n" + "    <LASTNAME>San</LASTNAME>\r\n"
			+ "    <STREET>washington</STREET>\r\n" + "    <CITY>Fremont</CITY>\r\n" + "</CUSTOMER>";

}
