import java.util.HashSet;
import java.util.Iterator;

public class TestJavaCollection7 {
	public static void main(String[] args) {
		HashSet<String> hset=new HashSet<String>();
		hset.add("How");
		hset.add("are");
		hset.add("you");
		
		Iterator<String> itr=hset.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
			
		
	}
}
