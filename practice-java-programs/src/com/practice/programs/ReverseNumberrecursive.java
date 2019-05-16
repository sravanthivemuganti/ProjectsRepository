package com.practice.programs;

public class ReverseNumberrecursive {

	public static void main(String[] args) {
		int number=346;
		System.out.println(reursiveReversenunber(number));
	}
	static int rev=0;
	private static int reursiveReversenunber(int number) {
		
		if(number<10)
			return rev*10+number;
		else {
			rev =(rev*10)+number%10;
			number=reursiveReversenunber(number/10);
		}return number;
	}
}
