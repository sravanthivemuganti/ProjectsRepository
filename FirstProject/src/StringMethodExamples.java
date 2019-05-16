
public class StringMethodExamples {

	public static void main(String[] args) {

		// String s=new String("Hello World");
		String s = "New World";
		if (s.equalsIgnoreCase("new World")) {
			// Used replace method to replace the word New and add Hello word	
			System.out.println(s.replace("New","Hello"));
		} else
		{// display same word if condion fails
			System.out.println(s);
		}
		System.out.println(s.substring(0,3));
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(s.trim());// removes leading and trailing spaces
		char[] arrayChar=s.toCharArray();
		System.out.println(arrayChar[1]); //e
		System.out.println(s.contains("New"));
		
		/*
		 * StringBuffer is same as String 
		 * StringBuffer Class is used to create mutable(modifiable) String*/
		StringBuffer sb=new StringBuffer("Hello ");
		System.out.println(sb.append("Java"));
		System.out.println(sb.insert(5, " Welcome"));
		System.out.println(sb.replace(0 ,5, "Hi"));
		System.out.println(sb.delete(0, 2));
		System.out.println(sb.reverse());
	}

}
