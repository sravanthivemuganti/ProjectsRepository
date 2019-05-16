package org.apex.util;

import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class UsingMethods {

	public static void main(String[] args) {

		UsingMethods um = new UsingMethods();
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a value : ");
		String str=scanner.next();
		System.out.println(isInteger(str));
		System.out.println(isOddNumber(str));
		System.out.println(isEvenNumber(str));
		System.out.println(isPrimeNumber(str));
	}

	public static  boolean isInteger(String str) {
		System.out.print(str+" is Integer : ");
		try {
		Integer.parseInt(str);
		return true;
		}
		catch(NumberFormatException e) {
			return false;
		} 

	}

	public static boolean isOddNumber(String str) {
		System.out.print(str+" is Odd Number : ");
		try {
		int odd = Integer.parseInt(str);
		return (odd % 2 != 0);
		}
		catch(NumberFormatException e) {
			return false;
		}
	}

	public static boolean isEvenNumber(String str) {
		System.out.print(str+" is Even Number : ");
		try {
		int even = Integer.parseInt(str);
		return ((even % 2) == 0);
		}
		catch(NumberFormatException e) {
			return false;
		}
	}

	public static boolean isPrimeNumber(String str) {
		System.out.print(str+" is Prime Number : ");
		boolean flag = true;
		try{
			int prime=Integer.parseInt(str);
		
		for (int i = 2; i <= prime / 2; i++) {
			if (prime % i == 0) {
				flag = false;
				}
		}
		if (!flag)
			return flag;
		else
			return flag;
		
		}
		catch(NumberFormatException e) {
			return false;
		}
	}
}
