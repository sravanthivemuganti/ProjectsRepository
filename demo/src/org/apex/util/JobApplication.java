package org.apex.util;

public class JobApplication {
	static String companyName = "Google";

	private String firstName;
	private int year;

	JobApplication() {
		firstName = "DEFAULT FIRSTNAME";
		year = 1947;
	}
	JobApplication(String firstName, int year) {
		this.firstName = firstName;
		this.year = year;
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		if(year < 0)		year = 1980;
		this.year = year;
	}
	int getAge() {
		int CURRENT_YEAR = 2019;
		return (CURRENT_YEAR-year);
	}
	static void greeting(String name) {
		System.out.println("Welcome, :"+name);
	}
	void greetingNS() {
		System.out.println("Welcome, :"+firstName);
	}

	void display() {
		System.out.println("First name : "+this.firstName);
		System.out.println("year : "+this.year);
		System.out.println("age : "+getAge());
	}
}
