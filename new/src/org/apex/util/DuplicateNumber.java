package org.apex.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DuplicateNumber {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		//		System.out.println("Enter Number: ");
		//		Scanner sc= new Scanner(System.in);
		//		int input =sc.nextInt();
		for (int i = 1; i < 30; i++) {
			numbers.add(i);
		}
		numbers.add(22);
		System.out.print(findDuplicateNumber(numbers));
	}

	static int findDuplicateNumber(List<Integer> numbers) {
		int highestNumber = numbers.size() - 1;
		int total = getSum(numbers);
		int duplicate = total - (highestNumber * (highestNumber + 1) / 2);
		return duplicate;
	}

	static int getSum(List<Integer> numbers) {
		int sum = 0;
		for (int num : numbers) {
			sum = sum + num;
		}
		return sum;
	}
}
