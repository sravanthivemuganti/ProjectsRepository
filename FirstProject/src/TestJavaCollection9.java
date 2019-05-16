import java.util.Iterator;
import java.util.TreeSet;

public class TestJavaCollection9 {

	public static void main(String[] args) {
		// sorted order 
		TreeSet<String> tset=new TreeSet<String>();
		tset.add("Aashritha");
		tset.add("Venu");
		tset.add("Sravanthi");
		tset.add("Abhimanyu");
		
		Iterator<String> itr=tset.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
