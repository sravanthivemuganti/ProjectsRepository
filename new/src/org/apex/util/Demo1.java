package org.apex.util;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {

		int a[] ={1,2,255,12,34,45,3,4,5};
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		//System.out.println(a.length);
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		
		if(a[i]==255) {
			System.out.println(i+2);
		}	
		System.out.println(i+1);
		}

	}

}
