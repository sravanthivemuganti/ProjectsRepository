package practice.programs;

import java.util.*;
// input { 1, 1, 2, 3, 2, 1 ,6,3,8,1}
//out put{1,1}{1,1}{2,2}{3,3}
// pair count  4


public class Solution {
	static int sockMerchant(int n, int[] ar) {
		Arrays.sort(ar);
		int k = 0;
		for (int i = 0; i < ar.length - 1; i += 2) {
			if (ar[i] == ar[i + 1]) {
				k++;
				System.out.println("{"+ar[i]+","+ar[i+1]+"}");
			}
			else 
				i = i - 1;
		}
		
		return (k);
	}

	public static void main(String args[]) {

		int ar[] = { 1, 1, 2, 3, 2, 1 ,6,3,8,1};
		int n = ar.length;
		int result = sockMerchant(n, ar);
		System.out.println(result);

	}

}
