package org.apex.util;

public class Test1 {

	public static void main(String[] args) {

		Integer i1=127;
		Integer i2=127;
		System.out.println(i1==i2);
		Integer i3=128;
		Integer i4=128;
		System.out.println(i3==i4);
		
		System.out.println(Math.min(Double.MIN_VALUE,0.0d));
		
		long longWithL=1000*60*60*24*365L;
		long longWithoutL=1000*60*60*24*365;
		System.out.println(longWithL);
		System.out.println(longWithoutL);
		//\u000d System.out.println("Comment executed");
		//  u000d this is unicode character for nextline
	}

}
