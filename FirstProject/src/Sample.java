
public class Sample {

	public static void main(String[] args) {
	/*
	
		String str="o";
		if((str.length()>=2) && (str.substring(0,2).equals("oz")))
			System.out.println(str.substring(0,2));
		else
			if((str.length()>=3) && (str.substring(1,2).equals("z")))
			System.out.println(str.substring(1,2));
		else
			if(((str.length()>=2) || str=="o")&& (str.substring(0,1).equals("o")))
				System.out.println(str.substring(0,1));
			else
				System.out.println(" ");
	*/
			
		int a=10;
		int b=21;
		
		if (b > a) {
		    int temp = a;
		    a = b;
		    b = temp;
		  }
		  
		  // Knowing a is bigger, just check a first
		  if (a >= 10 && a <= 20) System.out.println(a);
		  if (b >= 10 && b <= 20) System.out.println(b);
		  System.out.println(0);
	}
	
}