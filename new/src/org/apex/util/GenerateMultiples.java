package org.apex.util;

import java.util.Random;

public class GenerateMultiples {

	public static void main(String[] args) {
		Random random =new Random();
		for(int i=1;i<1000;i++) {
			int num=random.nextInt(1000);
			if(num%5==0)
				System.out.println(num);
		}
		
	}

}
