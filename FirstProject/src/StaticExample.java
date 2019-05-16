import java.util.Scanner;

public class StaticExample {
	
	final int NUMBER_CONSTANT=20;
	
	private static String greet="Good morning! ";
	Scanner sc=new Scanner(System.in);
	String name=sc.nextLine();
	private String fname="Sravanthi";
	void disaply(String fname) {
		
		System.out.println("hello : "+ fname);
	}
	static void greet() {
		System.out.print(greet);
	}
	
	public static String getGreet() {
		return greet;
	}
	public static void setGreet(String greet) {
		greet="hi";
		StaticExample.greet = greet;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	
}
