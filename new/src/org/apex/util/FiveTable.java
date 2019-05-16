package org.apex.util;

import java.util.Scanner;

public class FiveTable {

	public static void main(String[] args) {
		
		Scanner input =new Scanner(System.in);
		System.out.println("Enter a value: ");
		int value=input.nextInt();
		for(int i=1;i<=10;i++)
		{
			int t=value*i;
			System.out.println(value+" * "+i+" = "+t);
		}
		// this is an other approach 
		multTable(value);
		input.close();
	}
	
	public static void multTable(int n) {
		//IF using constant always capital letters
		final int NUMBER_OF_TIMES=10;
		for(int i=1;i<=NUMBER_OF_TIMES;i++)
		{
			int t=n*i;
			System.out.println(n+" * "+i+" = "+t);
		}
	}
	}