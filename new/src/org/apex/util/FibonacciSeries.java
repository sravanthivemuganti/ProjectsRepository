package org.apex.util;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int input = scanner.nextInt();
		
		FibonacciSeries f = new FibonacciSeries();
		System.out.print(fibonacci(input));
		System.out.println();

		// normal execution
		int j = 0;
		int k = 1;
		int sum = 0;

		for (int i = 1; i <= input; i++) {
			System.out.print(k + " ");
			sum = j + k;
			j = k;
			k = sum;
		}

	}
	//using recursion
	public static int fibonacci(int number) {
		if (number == 1 || number == 2)
			return 1;
		else 
			return (fibonacci(number - 1) + fibonacci(number - 2));
	}
}
