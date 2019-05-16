package practice.programs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SumOfPairIntegers {

	//Finding pair of integers whose sum is given number
	// [1,3,4,6,7] wose sum is 10 ...(3,7)(4,6)
	public static void main(String[] args) {

		Integer num[]= {1,2,3,4,5,6,7,8,9,5};
		//(1,7),(2,6),(4,4) sum of pair is 8 but 
		//i don't want to display distinct numbers like (4,4) 
		List<String> al=new ArrayList<String>();
		
		int sum=10;
		for(int i=0;i<num.length;i++) {
			for(int j=i+1;j<num.length;j++)
			{
				if(((num[i]+num[j])==sum) && num[i]!=num[j]) {
					System.out.println("Pair is: ("+num[i]+" , "+num[j]+")");
				al.add("("+num[i]+" , "+num[j]+")");}
			}
		}System.out.println(" From arryliat: "+al);
		
		//  -----All possibilities of pairs both directions and equal numbers
		//[1,2,3,4,2]---sum of 4------output:(1,3)(2,2)(3,1) 
		for(int i=num.length-1;i>=0;i--) {
			for(int j=num.length-2;j>=i;j--)
			{
				if(((num[i]+num[j])==sum)) {
					System.out.println("Pair is: ("+num[i]+" , "+num[j]+")");
				al.add("("+num[j]+" , "+num[i]+")");}
			}
		}System.out.println(" From arryliat: "+al);
		
		//Using HashSe
		Set<Integer> hs=new HashSet<Integer>();
		for(Integer i:num) {
			int n=sum-i;
			
				if(!hs.contains(n) || i==n)
				hs.add(i);
			else
				System.out.print("("+n+","+i+")");
		}
		System.out.println();
	

	
	}

}
