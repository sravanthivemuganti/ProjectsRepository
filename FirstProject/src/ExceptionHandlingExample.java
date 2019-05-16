
public class ExceptionHandlingExample {

	public static void main(String[] args) {
	
		try {
			int a=1/0;
			System.out.println(a);
		}
		catch(ArithmeticException ae) {
			System.out.println(ae);
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}
}
