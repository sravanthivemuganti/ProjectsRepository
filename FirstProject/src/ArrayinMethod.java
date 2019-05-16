
public class ArrayinMethod {

	public static void main(String[] args) {

		int a[]= {2,4,6,8,10};	
		change(a);
		for(int i:a)
			System.out.println(i);
	}
	public static void change(int x[]) {
			
		for(int c=0;c<x.length;c++)
			x[c]+=5;
		
		
	}

}
