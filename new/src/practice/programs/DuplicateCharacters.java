package practice.programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharacters {

	static void duplicateCharacter(String str) {

		Map<Character, Integer> hm = new HashMap<Character, Integer>();
		for (char c : str.toCharArray()) {
			if (hm.containsKey(c) && c!=' ') {
				hm.put(c, hm.get(c) + 1);
			} else
				hm.put(c, 1);
		}
		//System.out.println(hm);
		Set<Character> keys = hm.keySet();
		for (char c : keys) {
			if (hm.get(c) > 1)
				System.out.println(c+" repeated "+hm.get(c));
		}
	}

	public static void main(String[] args) {

		String str = "Hello Java good";
		System.out.println("My String is : "+str);
		duplicateCharacter(str);
	}
}
