package practice.programs;

import java.util.*;

public class Test {

	
	
	static char check(String input) {
		char secondChar=' ';
			for(int i=0;i<input.length();i++) {
			char firstChar=input.charAt(i);
			//System.out.println(firstChar);
			for(int j=i+1;j<input.length();j++) {
				 secondChar=input.charAt(j);
				//	System.out.println(secondChar);
					if(firstChar==secondChar) {
						return secondChar;
						//System.out.println(firstChar);
					}
		}
			}
			return ' ';
		
	}
	static Character firstRepeatedChar(String str) {
		
		Map<Character,Integer> hm=new HashMap<Character,Integer>();
		for(char c:str.toCharArray()) {
			if(hm.containsKey(c)) {
				hm.put(c,hm.get(c)+1);
			}
			else
				hm.put(c, 1);
		}
		
		for(char c:str.toCharArray()) {
			if(hm.get(c)>1)
				return c;
		}
		return null;
	}
	public static void main(String[] args) {

		String str= "MADAM";
		char c=check(str);
		Character ch=firstRepeatedChar(str);
		System.out.println(ch);
	}

}
