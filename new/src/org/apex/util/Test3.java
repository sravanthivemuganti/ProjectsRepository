package org.apex.util;

public class Test3 {
	
	static int a= 1111;
	static {
		a=(a-- - --a);
	}
	
	//static{a=(a++ + ++a);}
	{a=(a++ + ++a);}
	public static void main(String[] args) {
		System.out.println(a);

	}

}
