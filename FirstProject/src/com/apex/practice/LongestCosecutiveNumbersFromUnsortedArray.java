package com.apex.practice;

import java.util.HashSet;
import java.util.Set;

public class LongestCosecutiveNumbersFromUnsortedArray {

	public static void main(String[] args) {
		int[] numbers= {100,4,200,1,2,3};
		System.out.println(longestConsecutiveNumbers(numbers));
	}
	public static int longestConsecutiveNumbers(int[] numbers) {
		
		int current=0,longest=0;
		Set<Integer> hs=new HashSet<Integer>();
		for(Integer i:numbers) {
			hs.add(i);
		}
		for(Integer i:numbers) {
			if(!hs.contains(i-1)) {
				int count=0;
				current=i;
				while(hs.contains(current)) {
					count=count+1;
				//	System.out.println(current+":"+count);
					current=current+1;
				}
				longest=Math.max(longest, count);
				}
			}return longest;
		}
}
