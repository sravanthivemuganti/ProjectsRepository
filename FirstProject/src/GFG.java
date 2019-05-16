import java.util.Objects;

public class GFG {

	public static void main(String[] args) {
		
		String string1=new String("Geeksforgeeks");
		String string2=new String("Practice");
		String string3=new String("Geeks");
		String string4=new String("Geeks");
		String string5=new String("geeks");
		
		System.out.println("Comaring "+string1+" and "+string2+" : "+string1.equals(string2));
		System.out.println("Comaring "+string3+" and "+string4+" : "+string3.equals(string4));
		System.out.println("Comaring "+string4+" and "+string5+" : "+string4.equals(string5));
		System.out.println("Comaring "+string1+" and "+string4+" : "+string1.equals(string4));
		
		//ignore case
		System.out.println("Comaring "+string4+" and "+string5+" : "+string4.equalsIgnoreCase(string5));
		
		// using Objects
		System.out.println();
		System.out.println("Comaring "+string1+" and "+string2+" : "+ Objects.equals(string1, string2));
		System.out.println("Comaring "+string3+" and "+string4+" : "+ Objects.equals(string3, string4));
		System.out.println("Comaring "+string4+" and "+string5+" : "+ Objects.equals(string4, string5));
		System.out.println("Comaring "+string1+" and "+string4+" : "+ Objects.equals(string1, string4));
	
	}

}
