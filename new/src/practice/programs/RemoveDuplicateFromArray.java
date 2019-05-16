
package practice.programs;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RemoveDuplicateFromArray {

	/*
	 * remove duplicate values from an array
	 *  arrays is fixed in size, so we cannot
	 * increase or decrease length of an array
	 * so here we are making duplicate value to zero
	 */
	public static void main(String[] args) {

		Integer a[]= {1,6,2,2,3,1,5};
		//Arrays.sort(a);
		
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j])
					a[j]=0;
			}
					
		}System.out.println(Arrays.toString(a));
		
	}

}
