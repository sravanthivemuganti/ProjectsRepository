package org.apex.util;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		String reverse="";
		Scanner input=new Scanner(System.in);
		String str=input.nextLine();
		int length=str.length();
		for(int i=length-1;i>=0;i--) {
				reverse=reverse+str.charAt(i);
		}
		if(str.equals(reverse))
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}

}
