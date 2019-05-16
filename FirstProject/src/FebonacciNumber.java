import java.util.Arrays;

public class FebonacciNumber {

	public static void main(String[] args) {

		int number=10;
		int[] febNumber=new int[number];
		febNumber[0]=0;
		febNumber[1]=1;
		for(int i=2;i<number;i++) {
			febNumber[i]=febNumber[i-1]+febNumber[i-2];
		}
		System.out.println(Arrays.toString(febNumber));
	}

}
