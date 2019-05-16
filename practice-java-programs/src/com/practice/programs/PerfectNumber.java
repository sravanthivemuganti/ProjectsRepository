package com.practice.programs;

public class PerfectNumber {
	public static void main(String[] args) {
		int number=28;
		perfectNumber(number);
	}

	private static void perfectNumber(int number) {
		int temp=0;
		for(int i=1;i<=number/2;i++)
			if(number%i==0) {
				System.out.println(i);
				temp=temp+i;
			}
		if(temp==number)
			System.out.println("number is perfect");
		else
			System.out.println("number is not perfect");
		
	}
}
