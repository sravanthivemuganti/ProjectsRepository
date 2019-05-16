package com.apex.practice;

import java.util.*;

public class MovingAllZerosToEnd {

	public static void main(String[] args) {
		int[] numbers= {0,1,0,3,12};
		moveAllZeros(numbers);
	}
	public static void moveAllZeros(int[] numbers) {
		int temp=0;
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int i=0;i<numbers.length;i++) {
			for(int j=i+1;j<numbers.length;j++) {
				if(numbers[i]==0) {
					temp=numbers[i];
					numbers[i]=numbers[j];
					numbers[j]=temp;
				}
			}
		}
		for(int i=0;i<numbers.length;i++) {
			al.add(numbers[i]);
		}		System.out.print(al);

	}

}
