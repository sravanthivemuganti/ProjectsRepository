
public class Childconstructor {

	private String sname;
	// Constructor 
	public  Childconstructor(String name) {
		sname=name;		
	}
	public String getName() {
		return sname;
	}
	public void callName() {
		System.out.println("Hi! Welcome "+getName());
	}
}
