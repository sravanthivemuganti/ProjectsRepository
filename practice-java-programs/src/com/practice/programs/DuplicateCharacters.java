package com.practice.programs;

import java.io.ObjectInputStream.GetField;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharacters {

	public static void main(String[] args) {
		String str="This is Javaa";
		duplicateCharacters(str);
	}

	private static void duplicateCharacters(String str) {
		
		Map<Character, Integer> hm=new HashMap<Character, Integer>();
		for(Character c:str.toCharArray()) {
			if(hm.containsKey(c) && c!=' ')
				hm.put(c,hm.get(c)+1);
			else
				hm.put(c, 1);
		}
		
		Set<Character> keys=hm.keySet();
		for(Character c:keys) {
			if(hm.get(c)>1)
				System.out.println(c+" repeated "+hm.get(c));
		}
	}
}
