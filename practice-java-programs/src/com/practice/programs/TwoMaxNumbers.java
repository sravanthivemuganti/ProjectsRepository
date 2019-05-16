package com.practice.programs;

public class TwoMaxNumbers {

	public static void main(String[] args) {
		 int[] nums= {12,2,3,50,45,67,89};
		 twoMaxNumbers(nums);
	}

	private static void twoMaxNumbers(int[] nums) {
		
		int maxOne=0;
		int maxTwo=0;
		for(int n:nums) {
			if(maxOne<n)
			{
				maxTwo=maxOne;
				maxOne=n;
			}
			else
				if(maxTwo<n)
					maxTwo=n;
		}
		System.out.println("Maximum one is: "+maxOne);
		System.out.println("Maximum two is: "+maxTwo);
	}
}
