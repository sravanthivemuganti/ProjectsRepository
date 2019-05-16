public class Main {

	public static void main(String[] args) {

		int result = new Calculate()
		{
			int multiply(int a,int b) {
				return a*b;
			}
		}.multiply(12,32);
		System.out.println("result="+result);
	}

}
