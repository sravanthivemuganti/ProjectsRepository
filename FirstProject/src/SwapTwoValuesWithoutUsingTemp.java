
public class SwapTwoValuesWithoutUsingTemp {

	public static void main(String[] args) {

		int a=5; 
		int b=10;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("values of a is: "+a);
		System.out.println("values of b is: "+b);
	}

}
