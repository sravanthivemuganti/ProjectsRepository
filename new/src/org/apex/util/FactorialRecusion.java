package org.apex.util;

import java.util.Scanner;

public class FactorialRecusion {

	public static void main(String[] args) {
		System.out.print("Enter number to find factorial: ");
		int number=new Scanner(System.in).nextInt();
		FactorialRecusion factorial=new FactorialRecusion();
		System.out.println(factorial.factorialRecursion(number));
	}
	public int factorialRecursion(int number) {
		if(number==1)
			return 1;
		else
			return (number*(factorialRecursion(number-1)));
	}

}
