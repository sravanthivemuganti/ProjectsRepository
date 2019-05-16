package org.apex.util;

import java.util.Scanner;

public class DecimaltoBinary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number=sc.nextInt();
		DecimaltoBinary decimalBinary=new DecimaltoBinary();
		decimalBinary.decimalTiBinary(number);
	}
	public void decimalTiBinary(int number) {
		int[] binary=new int[number];
		int index=0;
		while(number!=0) {
			binary[index]=number%2;
			number=number/2;
			index++;
		}
		for (int i = index-1;i>=0; i--) {
			System.out.print(binary[i]);
		}
	}

}
