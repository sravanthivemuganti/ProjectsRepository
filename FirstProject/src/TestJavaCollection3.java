import java.util.Iterator;
import java.util.Vector;

public class TestJavaCollection3 {

	public static void main(String[] args) {
	
		Vector<String> v =new Vector<String>();
		v.add("Violet");
		v.add("Blue");
		v.add("Green");
		v.add("Yellow");
		v.add(1, "Indigo");
		
		Iterator itr=v.iterator();
		 while(itr.hasNext()) {
			 System.out.println(itr.next());
		 }
	}

}
