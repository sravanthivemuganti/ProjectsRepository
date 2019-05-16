package org.apex.util;

import java.util.Scanner;

public class ReverseOfNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number=sc.nextInt();
		sc.close();
		System.out.println("reverse of a number: "+reverseOfNumber(number));

	}
	public static int reverseOfNumber(int number) {
		int reverse=0;
		while(number!=0) {
			reverse=(reverse*10)+(number%10);//3 32 321
			number=number/10;//12 1 0
		}
		return reverse;
	}

}
