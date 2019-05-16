package practice.programs;

import java.util.*;

// Finding Duplicate String in array
public class DuplicateString {

	public static void main(String[] args) {
		
		String[] names= {"Java","c","Python","Java","c"};
		
		// First solution : finding duplicates using brute force method

			for(int i=0;i<names.length;i++)
			{
				for(int j=i+1;j<names.length;j++) {
					if(names[i].equals(names[j])) {
						System.out.println("Duplicate element: "+names[i]);
					}
				}
			}
		// Using HashSet
		Set<String> hs=new HashSet<String>();
		
		for(String i:names) {
			
			if(hs.add(i)==false)
				System.out.println("Found a duplicate element in arrray : "+i);
		}
		System.out.println(hs);
		
		
		
	}
		
}


