import java.util.Scanner;

public class ParentClass {

	public static void main(String[] args) {
		ChildClass cc = new ChildClass();
		cc.test();
		
		Scanner enterName = new Scanner(System.in);
		System.out.println("Enter your name : ");
		String name=enterName.nextLine();
		cc.testParameter(name);
		cc.callName();

	}

}
