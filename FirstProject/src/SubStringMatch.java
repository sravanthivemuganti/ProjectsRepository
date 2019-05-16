
public class SubStringMatch {

	public static void main(String[] args) {
		SubStringMatch scm=new SubStringMatch();
		String str="Hello Java! I started coding in java";
		String subString="java";
		scm.subStringMatch(str, subString);

	}

	public void subStringMatch(String str,String subString) {
		String subStringToMatch;
		int position;
		for(position=0;position<=(str.length()-subString.length());position++) {
			subStringToMatch=str.substring(position, position+subString.length());
			if(subString.equalsIgnoreCase(subStringToMatch)) {
				System.out.println("Sub String found at position : "+ ++position);
			}
		}
	}
}
