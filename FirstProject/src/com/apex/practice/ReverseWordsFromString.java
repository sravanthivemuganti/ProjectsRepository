package com.apex.practice;

public class ReverseWordsFromString {

	public static void main(String[] args) {
		ReverseWordsFromString rw=new ReverseWordsFromString();
		System.out.println(rw.reverseWords("The Sky is blue"));
	}
	public String reverseWords(String str) {
		String[] strArray=str.split("\\s");
		String reverseString="";
		for(int i=strArray.length-1;i>=0;i--) {
			reverseString=reverseString+strArray[i]+" ";
		}
		return reverseString.trim();		
	}
}
