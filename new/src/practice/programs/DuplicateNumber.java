package practice.programs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DuplicateNumber {

	public static void main(String[] args) {
	
		int[] ar= {1,2,2,3,4,5,6,1};
		duplicateElementsFilter(ar);
		
		Integer a[]= {12,34,56,32,12,56,89};
		
		//Finding Duplicate numbers
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i].equals(a[j]))
					System.out.println("Duplicate number: "+a[i]);
			}
		}
		
		//using HashSet
		System.out.println("-----Using HashSet-----");
		Set<Integer> hs=new HashSet<Integer>();
		for(Integer i:a) {
			if(hs.add(i)==false)
				System.out.println("Duplicate Numbers: "+i);
		}
	}
	public static void duplicateElementsFilter(int[] ar) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		Set<Integer> hs=new HashSet<Integer>();
		for(Integer a:ar) {
			if(hs.contains(a))
				System.out.print("");
			else
				hs.add(a);
		}
		for(Integer a:hs)
			{
			al.add(a);
			}
		System.out.println(al);
		
	}


}
