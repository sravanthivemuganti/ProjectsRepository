import java.util.Iterator;
import java.util.LinkedList;

public class TestJavaCollection2 {

	public static void main(String[] args) {

		LinkedList<String> lst=new LinkedList<String>();
		lst.add("Apple");
		lst.add("Banana");
		lst.add("Orange");
		lst.add("Mango");
		lst.add(2,"Peach");
		Iterator itr=lst.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
