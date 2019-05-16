package practice.programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestSortr {

	public static void main(String[] args) {
		String s="This is new";
		String[] arr=s.split("\\s");
		ArrayList<String> al=new ArrayList<String>();
		for(String i:arr) {
			
			al.add(i);
		}
//		al.add("Abhi");
//		al.add("Aashu");
//		al.add("Venu");
//		al.add("Sravs");
		Collections.sort(al,Collections.reverseOrder());
		Iterator<String> itr=al.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next());
			System.out.print(" ");
		}
		
	
	}
}
