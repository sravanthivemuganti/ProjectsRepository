package practice.programs;


import java.util.Arrays;

import org.apache.commons.lang.ArrayUtils;

// To reverse int and String array
public class Sample {

	public static void main(String[] args) {
	
		int[] iArray = new int[]{1, 2, 3, 5};
        int missing = getMissingNumber(iArray, 5);
        System.out.printf("Missing number in array %s is %d %n", 
                           Arrays.toString(iArray), missing);


	}

	private static int getMissingNumber(int[] numbers, int totalCount) {
		int expectedSum = totalCount * ((totalCount + 1) / 2);
		int actualSum = 0;
		for (int i : numbers) {
			actualSum += i;
			} return expectedSum - actualSum; 
		}

}
