package firstpackage;

import testpackage.*;

public class StaticExampleOther {

	public static void main(String[] args) {
		System.out.println("Enter your name: ");
		TestClass se= new TestClass();
		System.out.println(se.fname);
		se.disaply(se.fname);
		// System.out.println(se.greet);
		TestClass.greet();
		System.out.println(se.name);
	}

}
