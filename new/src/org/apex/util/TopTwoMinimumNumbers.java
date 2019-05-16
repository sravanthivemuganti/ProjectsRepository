package org.apex.util;

import java.util.*;

public class TopTwoMinimumNumbers {

	public static void main(String[] args) {
		int[] numbers = { 2, 4, -8, 3, -1 };
		System.out.println("given array is: " + Arrays.toString(numbers));
		topTwoMinNumbers(numbers);
		topTwoMinNumbersUsingList(numbers);
	}

	public static void topTwoMinNumbers(int[] numbers) {
		int temp = 0;
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] > numbers[j]) {
					temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
		System.out.println("Top two minimum numbers: " + numbers[0] + " " + numbers[1]);
	}

	// Using Arraylist
	public static void topTwoMinNumbersUsingList(int[] numbers) {
		List<Integer> al = new ArrayList<Integer>();
		Arrays.sort(numbers);
		for (Integer i : numbers) {
			al.add(i);
		}
		System.out.println("Top two minimum numbers from Arraylist : " + al.get(0) + " " + al.get(1));
		//System.out.println("Top two maximum numbers from ArrayList : " + al.get(al.size() - 1) + " " + al.get(al.size() - 2));
	}

}
