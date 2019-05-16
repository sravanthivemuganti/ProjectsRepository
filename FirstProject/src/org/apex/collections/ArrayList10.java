package org.apex.collections;

import java.util.ArrayList;

import javax.print.DocFlavor.STRING;

public class ArrayList10 {

	public static void main(String[] args) {

		ArrayList<String> al=new ArrayList<String>();
		System.out.println("Is array empty : "+al.isEmpty());
		al.add("Ravi");
		al.add("Ajay");
		al.add("Vijay");
		System.out.println("Is array empty : "+al.isEmpty());
	}

}
