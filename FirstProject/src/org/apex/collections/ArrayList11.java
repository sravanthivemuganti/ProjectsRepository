package org.apex.collections;

import java.util.ArrayList;

public class ArrayList11 {

	public static void main(String[] args) {

		ArrayList<String> al= new ArrayList<String>();
		al.add("red");
		al.add("yellow");
		al.add("white");
		System.out.println(al.get(1));
		al.set(1, "green");
		System.out.println(al.get(1));
	}

}
