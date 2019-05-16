package com.practice.programs;

public class ReverseStringRecursive {

	public static void main(String[] args) {
		String str="Hello Java";
		System.out.println(recursiveString(str));
	}

	private static String recursiveString(String str) {
		if(str.length()==1)
			return str;
		else
		{
			String reverse="";
			reverse=reverse+str.charAt(str.length()-1)+recursiveString(str.substring(0,str.length()-1));
			return reverse;
		}	
	}
}
