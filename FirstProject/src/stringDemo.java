
public class stringDemo {

	public static void main(String[] args) {
		char helloArray[]= {'h','e','l','l','o'};
		String helloString = new String(helloArray);
		System.out.println(helloString);
		int len=helloString.length();
		System.out.println(len);
		float floatVar=12.3f;
		int intVar=50;
		String stringVar = "welcome";
		String greetString="Welcome";
		System.out.println(helloString +" "+greetString);
		System.out.println(helloString.concat(greetString));
		
		System.out.printf("The value of the float variable is " + 
						  "%f, while the value of integer " +
						"variable is %d, and the string "+
						  "is %s",floatVar,intVar,stringVar);
		
		
		String fs;
		fs=String.format("The value of the float variable is " + 
				"%f, while the value of integer "  + 
				"variable is %d, and the string " + 
				"is %s",floatVar,intVar,stringVar);
		System.out.println("\n"+fs);
		System.out.println(stringVar.charAt(3));
		System.out.println(greetString.compareToIgnoreCase(stringVar));
		
	}

}
