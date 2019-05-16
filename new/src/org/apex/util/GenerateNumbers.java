package org.apex.util;

import java.util.Random;

public class GenerateNumbers {

	public static void main(String[] args) {
		GenerateNumbers gn = new GenerateNumbers();
		gn.generateNumbers();
		gn.generateOddNumbers();
		gn.generateMultiplesofFive();
	}
// To generate 100 numbers
	public void generateNumbers() {
		Random random = new Random();
		System.out.println("Generate 1000 numbers");
		for (int i = 1; i <= 1000; i++) {
			System.out.println(i + " : " + random.nextInt(1000) + " ");
		}
	}
// to generate odd numbers	
	public void generateOddNumbers(){
		Random random =new Random();
		System.out.println("Generate odd numbers in 1000");
		
		for(int i=1;i<1000;i++) {
			int num=random.nextInt(1000);
			if(num%2!=0)
				System.out.println(num);
		}
	}
// to generate multiples of five
	public void generateMultiplesofFive() {
		Random random =new Random();
		System.out.println("Generate multiples of 5 numbers in 1000");

		for(int i=1;i<1000;i++) {
			int num=random.nextInt(1000);
			if(num%5==0)
				System.out.println(num);
		}
	}
}
