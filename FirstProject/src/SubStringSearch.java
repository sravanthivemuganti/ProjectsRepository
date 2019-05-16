import java.util.Scanner;

public class SubStringSearch {

	public static void main(String[] args) {
		System.out.println("Entetr a text: ");
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		System.out.println("Enter a pattern to be search : ");
		String pattern = sc.nextLine();
		System.out.println(searchSubString(text, pattern));
		sc.close();
	}

	public static boolean searchSubString(String text, String pattern) {
		int i = 0, j = 0, k = 0;
		while (i < text.length() && j < pattern.length()) {
			if (text.charAt(i) == pattern.charAt(j)) {
				i++;
				j++;
			} else {
				j = 0;
				k++;
				i = k;
			}
		}
		if (j == pattern.length()) {
			return true;
		} else
			return false;
	}
}
