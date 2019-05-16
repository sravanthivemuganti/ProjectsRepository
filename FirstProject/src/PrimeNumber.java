import java.util.ArrayList;

public class PrimeNumber {

	public static void main(String[] args) {
		
		System.out.println(prime(7));
		printPrimeNumbers(100);
	}
	//Check prime or not
	public static boolean prime(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
				
			}
		}
		return true;
}
	//print prime numbers less than n
	public static void printPrimeNumbers(int n) {
	ArrayList<Integer> primeList=new ArrayList<Integer>();
 	for (int x = 2; x <= n; x++) {
		boolean isPrime=true;
		for (int y = 2; y <= Math.sqrt(x); y++) 
		if (x % y == 0) {
			isPrime=false;
			break;
		}
		if(isPrime)
			primeList.add(x);
		}
 	System.out.println(primeList);
	} 
}