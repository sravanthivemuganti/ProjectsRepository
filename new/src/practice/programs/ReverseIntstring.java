package practice.programs;


import java.util.Arrays;

import org.apache.commons.lang.ArrayUtils;

// To reverse int and String array
public class ReverseIntstring {

	public static void main(String[] args) {
		int[] a={20,34,21,-87,-92};
		String[] arr= {"java","C","Python","MySQl"};
		
		//System.out.println(Arrays.toString(a));
		ArrayUtils.reverse(a);
		ArrayUtils.reverse(arr);
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(arr));

	
	}

}
