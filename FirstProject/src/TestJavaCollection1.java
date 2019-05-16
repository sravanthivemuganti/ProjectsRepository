import java.util.ArrayList;
import java.util.Iterator;

public class TestJavaCollection1 {

	public static void main(String[] args) {

		ArrayList<String> list=new ArrayList<String>();
		list.add("Abhi");
		list.add("Aashu");
		list.add("sravs");
		list.add("venu");
		
		Iterator itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		list.add("goda");
		list.add(1, "vydhyala");// add an item at index 1
		System.out.println("");
		Iterator itr1=list.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
}

}
