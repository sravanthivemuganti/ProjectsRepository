package org.apex.util;
import org.apache.commons.lang.StringUtils;


public class ReverseWordsString {

	public static void main(String[] args) {
		 String str="This is Hello World";
		 StringBuffer sb=new StringBuffer();
		 String arr[]=str.split(" ");
		 
		 //sihT si olleH dlroW 
		 for(String s:arr) {
			 String rs=new StringBuffer(s).reverse().toString();
			 sb.append(rs+" ");
		 }
		 System.out.println(sb);
		 
		 //World Hello is This 
		 StringBuffer sb1=new StringBuffer();
		 for(int i=arr.length-1;i>=0;i--) {
			 sb1.append(arr[i]);
			 sb1.append(" ");
		 }
		 System.out.println(sb1);
		
		 
		 //or
		 
		 
		  String reverseString=StringUtils.reverseDelimited(str, ' ');
		  String reverseWordString = StringUtils.reverseDelimited( StringUtils.reverse(str), ' ' );
		 System.out.println( reverseString );//World Hello is This 
		 System.out.println( reverseWordString );//sihT si olleH dlroW
		 
		 }
	

}
