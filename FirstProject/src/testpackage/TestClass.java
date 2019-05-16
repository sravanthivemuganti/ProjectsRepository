package testpackage;

import java.util.Scanner;

public class TestClass {

	private static String greet="Good morning! ";
	Scanner sc=new Scanner(System.in);
	public String name=sc.nextLine();
	public String fname="Sravanthi";
	public void disaply(String fname) {
		
		System.out.println("hello : "+ fname);
	}
	public static void greet() {
		System.out.print(greet);
	}
}
