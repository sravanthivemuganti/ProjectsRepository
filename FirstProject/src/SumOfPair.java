import java.util.HashSet;
import java.util.Set;

public class SumOfPair {

	public static void main(String[] args) {
		
		int[] numbers={1,2,3,4,5,6,7,8,9,5};
		int sum=10;
		sumOfPairs(numbers,sum);
	}
	public static void sumOfPairs(int[] numbers,int sum) {
		Set<Integer> hs=new HashSet<Integer>();
		for(Integer i:numbers) {
			int n=sum-i;
			
				if(!hs.contains(n) || i==n)
				hs.add(i);
			else
				System.out.print("("+n+","+i+")");
		}	
	}

}
