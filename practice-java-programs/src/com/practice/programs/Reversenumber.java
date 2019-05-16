package com.practice.programs;

public class Reversenumber {

	public static void main(String[] args) {
		 int number=234;
		 reverseNumber(number);
	}

	private static void reverseNumber(int number) {
		int rev=0;
		while(number!=0) {
			rev=(rev*10)+(number%10);
			number=number/10;
		}			System.out.println(rev);
	}
}
