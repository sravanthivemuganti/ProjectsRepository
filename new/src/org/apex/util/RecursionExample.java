package org.apex.util;

public class RecursionExample {

	public static void main(String[] args) {
		RecursionExample re=new RecursionExample();
		System.out.println(re.recursionExample(6));
		
	}
	public int recursionExample(int number) {
		if(number==1)
			return 1;
		else 
			return number+recursionExample(number-1);
	}
}
