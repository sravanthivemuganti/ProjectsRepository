import java.util.Scanner;

public class PerfectNumber {

	// to find a number is perfectnumber or not
	// 6 is perfecr number (1+2+3+6)/2
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number=sc.nextInt();
		sc.close();
		System.out.println(findPerfectNumber(number));
	}

	public static boolean findPerfectNumber(int number) {
		int sum = 0;
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				sum = sum + i;
			}
		}
		if ((sum / 2) == number) 
			return true;
		else return false;
	}
}
