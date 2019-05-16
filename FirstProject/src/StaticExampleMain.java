
public class StaticExampleMain {

	public static void main(String[] args) {

		
		System.out.println("Enter your name: ");
		StaticExample se= new StaticExample();
		System.out.println(se.NUMBER_CONSTANT);
		//System.out.println(se.fname);
		//se.disaply(se.fname);
		StaticExample.greet();

		System.out.println(se.name);
		
	}

}
