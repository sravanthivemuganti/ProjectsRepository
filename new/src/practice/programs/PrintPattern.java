package practice.programs;

public class PrintPattern {

	public static void main(String[] args) {
//		1
//		12
//		123
//		1234
//		12345

		for(int i=1;i<=5;i++) 
		{
		for(int j=1;j<=i;j++) {
			System.out.print(j);
			}
		System.out.println();
		}
		
		System.out.println();
		
//		12345
//		1234
//		123
//		12
//		1
		for(int i=1;i<=5;i++) 
		{
			for(int j=1;j<=6-i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
//		4321
//		432
//		43
//		4
		for(int i=1;i<=5;i++) 
		{
			for(int j=4;j>=i;j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		
//		*
//		**
//		***
//		****
//		*****	
		for(int i=1;i<=5;i++) 
		{
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
//		   	*
//		   **
//		  ***
//		 ****
//		*****

		for(int i=1;i<=5;i++) {
			for(int k=1;k<=5-i;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}System.out.println();
		}
	
//		 	*
//		   ***
//		  *****
//		 *******
//		*********

		int p=0;
		for(int i=1;i<=5;i++) {
			for(int k=1;k<=5-i;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i+p;j++) {
				System.out.print(j);
			}System.out.println();
			p=p+1;;
		}
	}

}
