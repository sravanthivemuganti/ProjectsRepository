package org.apex.util;

import java.util.Scanner;

public class BasicCalculator {

	public static void main(String[] args) {

		BasicCalculator cal = new BasicCalculator();
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Enter two numbers ");
		int input1 = scanner.nextInt();
		int input2 = scanner.nextInt();
		cal.addition(input1, input2);
		cal.subtraction(input1, input2);
		cal.multiplication(input1, input2);
		cal.division(input1, input2);
	}

	public void addition(int a, int b) {

		int sum = a + b;
		System.out.println("Sum : " + sum);
	}

	public void subtraction(int a, int b) {

		int difference = a - b;
		System.out.println("Differrence : " + difference);
	}

	public void multiplication(int a, int b) {

		int product = a * b;
		System.out.println("Product : " + product);
	}

	public void division(int a, int b) {

		int Quotient = a / b;
		System.out.println("Quotient : " + Quotient);
	}

}
