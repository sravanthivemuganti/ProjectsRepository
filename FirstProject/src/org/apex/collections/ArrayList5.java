package org.apex.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList5 {

	public static void main(String[] args) {
		// Creating user defined class object
		Student s1= new Student(101, 24, "vgs");
		Student s2= new Student(102, 44, "venu");
		Student s3= new Student(103, 34, "sravanthi");
		//creating arraylist
		ArrayList<Student> al= new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		//Getting Iterator
		Iterator itr =al.iterator();
		//Traversing elements of ArrayList Object
		while(itr.hasNext()) {
			Student st=(Student)itr.next();
			System.out.println(st.rollno+" "+st.name+" "+st.age);
		}
	}

}
