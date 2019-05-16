package com.apex.practice;

public class ExceptionExample {

	public static void main(String[] args) {
		ExceptionExample ee=new ExceptionExample();
		ee.exceptionExampleMethod(13);
	}
	public void exceptionExampleMethod(int age) throws ArithmeticException
	{ int i=0;
		try {
		if(age<18) {
			i=10;
			System.out.println("Hello");
			i=i/0;
			throw new ArithmeticException("No");
		//	System.out.println("Hi");
		}
		else {
			System.out.println("You are eligible to vote");
		}
		}
		finally {
			System.out.println(i);
		}
	}

}
