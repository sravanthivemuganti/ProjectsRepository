import java.util.Iterator;
import java.util.Stack;

public class TestJavaCollection4 {

	public static void main(String[] args) {

		Stack<String> st = new Stack<String>();
		st.push("One");
		st.push("Two");
		st.push("Four");
		st.push("Five");
		st.add(2, "Three");
		st.pop();
		
		Iterator it = st.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
