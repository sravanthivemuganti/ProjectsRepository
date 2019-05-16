package org.apex.collections;

import java.util.ArrayList;
import java.util.Collections;

public class TestSort1 {

	public static void main(String[] args) {
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(new Student(101, 23, "vijay"));
		al.add(new Student(106, 27, "Ajay"));
		al.add(new Student(105, 21, "jai"));
		
		Collections.sort(al);
		for(Student s:al) {
			System.out.println(s.rollno+" "+s.age+" "+s.name);
		}
		
	}
}
