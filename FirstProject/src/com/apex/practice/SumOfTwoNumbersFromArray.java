package com.apex.practice;

import java.util.HashSet;
import java.util.Set;

public class SumOfTwoNumbersFromArray {

	public static void main(String[] args) {
		int[] numbers= {1,2,7,8,6,4,3,9,9,5,5};
		int sum =10;
		sumOfNumbers(numbers,sum);
		System.out.println();
		sumOfNumbersUsingCollections(numbers,sum);
	}
	
	public static void sumOfNumbers(int[] numbers,int sum) {
		
		for(int i=0;i<numbers.length;i++) {
			for(int j=i+1;j<numbers.length;j++) {
//				System.out.println(numbers[i]);
//				System.out.println(numbers[j]);
				if(((numbers[i]+numbers[j])==sum) && (numbers[i]!=numbers[j]))
				{
				System.out.print("("+numbers[i]+","+numbers[j]+")");	
				}
			}
		}
	}
	public static void sumOfNumbersUsingCollections(int[] numbers,int sum) {
		Set<Integer> hs=new HashSet<Integer>();
		for(Integer i:numbers) {
			int n= sum-i;
			if(!hs.contains(n)) {
				hs.add(i);
			}
			else {
				if(!hs.contains(i))
				System.out.print("("+n+","+i+")");
				hs.add(i);

			}
		}
	}


}
