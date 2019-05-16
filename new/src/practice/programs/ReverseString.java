package practice.programs;

import org.apache.commons.lang.StringUtils;

public class ReverseString {

	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer("This is Hello World");
		
		System.out.println(sb.reverse());	
		
		//or
		System.out.println(StringUtils.reverse("This is hello world"));
		
		
		//or
		String reverse ="";
		String str="This is Hello World";
		
		
		for(int i=str.length()-1;i>=0;i--) {
			reverse = reverse+str.charAt(i);
		}
		System.out.println(reverse);
		
		 //World Hello is This
		String[] arr=str.split(" ");
		 StringBuffer sb1=new StringBuffer();
		 for(int i=arr.length-1;i>=0;i--) {
			 sb1.append(arr[i]);
			 sb1.append(" ");
		 }
		 System.out.println(sb1);
		//or
		String str1 = "I use selenium webdriver. selenium is a tool for web applications.";
				int i = str1.length();
				System.out.println(i);
				StringBuffer strb = new StringBuffer("");
				for( int j=i-1; j>=0; j--){
				//	System.out.println("entered");
				strb = strb.append(str1.charAt(j));
				}
				System.out.println(strb);
		
				//This%20is%20Hello%20World
		
				String newstr=str.replaceAll("\\s", "%20");
				 System.out.println(newstr);
				 
				 String strreplace=str1.replace("selenium", "Java");
				 System.out.println(strreplace);
	}

}

