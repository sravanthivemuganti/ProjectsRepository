package org.apex.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingNumFromArray {

	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<Integer>();
		for (int i = 1; i <= 30; i++) {
			numList.add(i);
		}
		Collections.shuffle(numList);
		System.out.println("Removed Number: " + numList.remove(0));
		Integer[] inputArray = new Integer[numList.size()];
		numList.toArray(inputArray);
		System.out.println(findMissingNumber(inputArray));
	}

	public static int findMissingNumber(Integer[] input) {
		int totalSum = 0;
		for (int i : input) {
			totalSum = totalSum + i;
		}
		int numSize = input.length + 1;
		int numSum = numSize * (numSize + 1) / 2;
		return numSum - totalSum;
	}

}
