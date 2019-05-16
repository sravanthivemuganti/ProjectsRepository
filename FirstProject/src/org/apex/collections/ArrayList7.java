package org.apex.collections;

import java.util.ArrayList;

public class ArrayList7 {

	public static void main(String[] args) {

		ArrayList<String> al= new ArrayList<String>();
		System.out.println("Initial list of elements: "+al);
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ajay");
		System.out.println("After invoking add(E e) method : "+al);
		
		//adding element in specified position
		al.add(1, "Gaurav");
		System.out.println("After invoking add(int index,E element) method : "+al);
		
		ArrayList<String> al2= new ArrayList<String>();
		al2.add("Sonoo");
		al2.add("Hanumat");
		
		//adding second list elements to first list
		al.addAll(al2);
		System.out.println("After invoking addAll(Collection<? extends E>c) method : "+al);

		ArrayList<String> al3=new ArrayList<String>();
		al3.add("John");
		al3.add("Rahul");
		
		//adding third list elements to the first list elements at specific position
		al.addAll(2,al3);
		System.out.println("After invoking addAll(Collection<? extends E>c) method : "+al);		
	}
	

}
