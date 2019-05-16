package practice.programs;

import java.lang.reflect.Array;
import java.util.Arrays;

// To find top two maximum numbers from an array
public class TopTwoMaximum {

	public static void main(String[] args) {
		int[] num={20,34,21,-87,-92};
		topTwo(num);
		MaxTwoNumbers(num);
		
	}
	public static void topTwo(int[] numbers) {

		int max1=0;
		int max2=0;
		
		for(int i:numbers) {
			if(i>max1) {
				max2=max1;
				max1=i;
			}else if(i>max2)
				max2=i;
		}
		System.out.println("Max1:"+max1);
		System.out.println("Max2:"+max2);
		
	}
	public static void MaxTwoNumbers(int[] num) {
		
		  int temp=0; for(int i=0;i<num.length;i++) { for(int j=i+1;j<num.length;j++) {
		  // System.out.println(num[i]+" "+num[j]); 
		   if(num[i]>num[j]) { temp=num[i];
		  num[i]=num[j]; num[j]=temp; }
		  
		  } } System.out.println("Max 1: "+num[num.length-1]);
		  System.out.println("Max 2 "+num[num.length-2]);
		 	
	Arrays.sort(num);
	System.out.println("Max 1: "+num[num.length-1]);
	System.out.println("Max 2 "+num[num.length-2]);
	 }

}
