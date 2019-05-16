package practice.programs;

import java.util.*;
import java.util.Map.Entry;

public class NewClass {
	 
		public static void main(String[] args) {
			Integer[] ar= {3,2,1,3,113,113,9};
			int n=ar.length;
			Map<Integer,Integer> map=new TreeMap<Integer, Integer>();
			for(Integer i:ar) {
				if(map.containsKey(i)) {
					map.put(i, map.get(i)+1);
				}
				else
					map.put(i, 1);
			}System.out.println(map);
			
			//Set entry=map.entrySet();
			for(Map.Entry<Integer, Integer> e : map.entrySet()) {
				System.out.println(e.getKey()+" "+e.getValue());
			}
			
		}
}