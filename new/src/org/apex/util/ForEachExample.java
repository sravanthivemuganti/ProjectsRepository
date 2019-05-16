package org.apex.util;

public class ForEachExample {

	public static void main(String[] args) {
		int a[]= {7,12,43};
		for(int i:a) {
			System.out.println(i);
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
