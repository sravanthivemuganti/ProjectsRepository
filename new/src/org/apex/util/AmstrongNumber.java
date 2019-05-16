package org.apex.util;

import java.util.Scanner;

public class AmstrongNumber {
	// 153 = (1*1*1)+(5*5*5)+(3*3*3)
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		int c=0;
		int temp,a;
		temp=num;
		while(num>0) {
			a=num%10;
			num=num/10;
			c=c+(a*a*a);			
		}
		if(temp==c)
			System.out.println("Amstrong Number");
		else
			System.out.println("Not Amstrong Number");
	}

}
