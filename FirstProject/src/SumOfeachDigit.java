
public class SumOfeachDigit {
	static int sum = 0;

	public static void main(String[] args) {
		int number = 253;
		System.out.println(recursiveSum(number));

	}

	public static int recursiveSum(int number) {

		if (number == 0)
			return sum;
		else {
			sum = sum + (number % 10);
			recursiveSum(number / 10);
		}
		return sum;
	}

}
