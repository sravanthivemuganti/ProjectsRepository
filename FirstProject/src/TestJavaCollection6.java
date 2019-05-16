import java.util.ArrayDeque;
import java.util.Deque;

public class TestJavaCollection6 {

	public static void main(String[] args) {

		Deque<String> deque=new ArrayDeque<String>();
		deque.add("Hi");
		deque.add("Hai");
		deque.add("Hii");
	
		for(String str:deque) {
			System.out.println(str);
		}
	}

}
