package com.practice.programs;

public class ReverseString {

	public static void main(String[] args) {
		String str="Hello Java";
		reverseString(str);
	}

	private static void reverseString(String str) {
		String reverse="";
		for (int i =str.length()-1; i >=0; i--) {
			reverse+=str.charAt(i);
		}System.out.println(reverse);
	}
}
