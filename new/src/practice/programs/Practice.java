package practice.programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Practice {

	public static void main(String[] args) {
		Practice ps=new Practice();
		System.out.println(ps.lengthOfLongestSubstring("abcabcbb"));
		System.out.println(ps.lengthOfLongestSubstringForLoop("pwwkew"));
	}
	
	public int lengthOfLongestSubstring(String s) {
		Set<Character> hs= new HashSet<Character>();
		int res=0,left=0,right=0;
		while(right<s.length()) {
			if(hs.contains(right)) {
				hs.remove(s.charAt(right));
			}else {
				hs.add(s.charAt(right++));
				res=Math.max(res, hs.size());
			}
		}
			StringBuffer sb=new StringBuffer();
			for(Character c:hs) {
				sb.append(c);
			}
			System.out.println(sb);
		
		return res;
	}
	public int lengthOfLongestSubstringForLoop(String s) {
		Set<Character> hs= new HashSet<Character>();
		int res=0,left=0,right=0;
		for(int i=0;i<s.length();i++) {
			if(hs.contains(i)) {
				hs.remove(s.charAt(i));
			}else {
				hs.add(s.charAt(i++));
				res=Math.max(res,hs.size());
			}
		}
			StringBuffer sb=new StringBuffer();
			for(Character c:hs) {
				sb.append(c);
			}
			System.out.println(sb);
		
		return res;
	}
}
