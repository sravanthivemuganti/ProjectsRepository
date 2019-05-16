
public class StringReverseRecursion {

	public static void main(String[] args) {
		StringReverseRecursion sr = new StringReverseRecursion();
		System.out.println(sr.reverseString("Hello Java"));

	}

	public String reverseString(String str) {
		String reverse = "";
		if (str.length() == 1)
			return str;
		else
			reverse = reverse + str.charAt(str.length() - 1) + reverseString(str.substring(0, str.length() - 1));
		return reverse;

	}

}
