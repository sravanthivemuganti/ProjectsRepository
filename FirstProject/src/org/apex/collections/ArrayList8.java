package org.apex.collections;

import java.util.ArrayList;

public class ArrayList8 {

	public static void main(String[] args) {

		ArrayList<String> al= new ArrayList<String>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ajay");
		al.add("Anuj");
		al.add("Gaurav");
		System.out.println("Initial list of elements: "+al);

		//removing specific elements from arraylist
		al.remove("Vijay");
		System.out.println("After invoking remove(object) method: "+al);
		
		//removing element on basis of specific position
		al.remove(0);
		System.out.println("After invoking remove(index) method: "+al);
		
		//Creating another arraylist
		ArrayList<String> al2=new ArrayList<String>();
		al2.add("Ravi");
		al2.add("Hanumat");
		//adding al2 to al
		al.addAll(al2);
		System.out.println("Updated list: "+al);
		
		//removing all the elements from al2
		al.removeAll(al2);
		System.out.println("After invoking removeAll() method: "+al);
		
		//Removing elements on the basis of specific condition
		al.removeIf(str->str.contains("Ajay")); // Here we are using Lambda Expression
		System.out.println("After invoking removeIf() method: "+al);  
		//removing all the elements available in list
		al.clear();
		System.out.println("After invoking al.clear() method: "+al);  
		
	}

}
