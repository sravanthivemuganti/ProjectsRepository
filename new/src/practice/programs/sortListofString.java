package practice.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class sortListofString {

	public static void main(String[] args) {
		String[] ar= {"Java","Python","Oracle","mySQL","Core","automation"};
		sortListofStringUsingCollections(ar);
	}
	public static void sortListofStringUsingCollections(String[] ar) {
		Arrays.sort(ar);
		for(String str:ar) {
			System.out.print(str+" ");
		}
		System.out.println();
		Arrays.sort(ar,String.CASE_INSENSITIVE_ORDER);
		for(String str:ar) {
			System.out.print(str+" ");
		}
		//System.out.println(ar.toString());		
	}
}
