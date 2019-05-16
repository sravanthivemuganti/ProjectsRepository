import java.util.Iterator;
import java.util.PriorityQueue;

public class TestJavaCollection5 {

	public static void main(String[] args) {

		PriorityQueue<String> pq=new PriorityQueue<String>();
		pq.add("one");
		pq.add("two");
		pq.add("three");
		pq.add("four");
		pq.add("hello");
		System.out.println(pq.element());
		System.out.println(pq.peek());
		
		System.out.println("Iterating Que elements");
		Iterator itr=pq.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		pq.remove();
		System.out.println("After removing Iterating Que elements");
		Iterator itr1=pq.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
	}

}
