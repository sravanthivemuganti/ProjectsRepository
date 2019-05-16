package org.apex.util;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TopTwoMaximumNumbers {

	public static void main(String[] args) {
		int[] numbers= {-12,-5,-3,-7,-8,-6,0};
		topTwoMaxNumbers(numbers);
		topTwoMaxNumbersSet(numbers);
	}
	public static void topTwoMaxNumbers(int[] numbers) {
		int temp=0;
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i+1; j < numbers.length; j++) {
				if(numbers[i]<numbers[j]) {
					temp=numbers[i];
					numbers[i]=numbers[j];
					numbers[j]=temp;
				}
			}
		}
		System.out.println(numbers[0]+" "+numbers[1]);
	}

	//Array has duplicate numbers but it shouldn't display as two times max number
	//so here i'm using hashset to avoid duplicates
	public static void topTwoMaxNumbersSet(int[] numbers) {
		Set<Integer> hs=new HashSet<Integer>();
		for(int i:numbers) {
			hs.add(i);
		}System.out.println(hs);
		Iterator<Integer> itr=hs.iterator();
		int firstMaxNum=0;
		int secondMaxNum=0;
		
		while(itr.hasNext()) {
			int n=itr.next();
			if(firstMaxNum<n) {
				secondMaxNum=firstMaxNum;
				firstMaxNum=n;
			}
			else if(secondMaxNum<n) {
				secondMaxNum=n;
			}
		}
		System.out.println("First Maximum Number: "+firstMaxNum);
		System.out.println("Second Maximum Number: "+secondMaxNum);
	
	}
}
