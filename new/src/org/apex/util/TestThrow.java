package org.apex.util;

public class TestThrow {
	  
	static void validate(int age) {
		if(age<18)
			throw new ArithmeticException("Not valid");
		else
			System.out.println("Welcome to Vote");
	}
	public static void main(String[] args) {
		try {
				validate(12);
		}
		catch(ArithmeticException e) {
			System.out.println("Error :"+e);
		}
	}

}
