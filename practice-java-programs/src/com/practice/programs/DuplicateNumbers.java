package com.practice.programs;

import java.util.ArrayList;

public class DuplicateNumbers {

	public static void main(String[] args) {
		int ar[]= {12,2,3,4,1,4,5,7,8,1};
		duplicateNumbers(ar);
	}

	private static void duplicateNumbers(int[] ar) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		for (int i = 0; i < ar.length; i++) {
			for (int j = i+1; j < ar.length; j++) {
				if(ar[i]==ar[j])
					al.add(ar[i]);
			}
		}System.out.println(al);
	}
}
