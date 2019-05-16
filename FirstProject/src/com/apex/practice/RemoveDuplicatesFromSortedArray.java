package com.apex.practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		int[] numbers = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		int[] numbersSecondlist = { 0, 1, 1, 0, 1, 2, 5, 3, 3, 4, 2 };
		int length = removeDuplicatesFromarray(numbers);
		int lengthSecondList = removeDuplicatesFromarray(numbersSecondlist);
		System.out.println(length);
		System.out.println(lengthSecondList);
	}

	public static int removeDuplicatesFromarray(int[] numbers) {
		int length = 0;
		Set<Integer> hs = new HashSet<Integer>();
		Arrays.sort(numbers);
		for (Integer i : numbers) {
			if (!hs.contains(i)) {
				hs.add(i);
			}
			length = hs.size();
		}
		return length;
	}
}
