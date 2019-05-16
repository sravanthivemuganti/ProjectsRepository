package org.apex.util;

import java.util.Scanner;

public class Diplicate {

	public static void main(String[] args) {
		char secondChar=' ';
		
		Scanner sc=new Scanner(System.in);
		
		String input=sc.nextLine();
		//String input="APPLE";
		for(int i=0;i<input.length();i++) {
			char firstChar=input.charAt(i);
			//System.out.println(firstChar);
			for(int j=i+1;j<input.length();j++) {
				 secondChar=input.charAt(j);
				//	System.out.println(secondChar);
					if(firstChar==secondChar) {
						System.out.println(firstChar);
					}
				
				
		}
			
		}
		
	}

}
