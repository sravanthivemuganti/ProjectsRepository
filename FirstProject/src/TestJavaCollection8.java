import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestJavaCollection8 {

	public static void main(String[] args) {

		LinkedHashSet<String> lhset=new LinkedHashSet<String>();
		lhset.add("apple");
		lhset.add("orange");
		lhset.add("mango");
		lhset.add("peach");
		
		Iterator itr= lhset.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
