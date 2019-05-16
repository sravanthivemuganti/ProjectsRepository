
public class ChildClass {

	public void test() {
		
		System.out.println("From childclass");
	}
	// method with parameters
	// many methods and instances
	private String n;
	public void testParameter(String name) {
		n=name;
	}
	public String getName() {
		return n;
	}
	public void callName() {
		System.out.println("Hello ! "+getName());
	}
}
