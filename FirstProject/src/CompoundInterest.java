import java.util.Scanner;

public class CompoundInterest {

	public static void main(String[] args) {

		double amount=0;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Principal amount : ");
		int principal=s.nextInt();
		System.out.print("Enter Rate of interest : ");
		double rate=s.nextDouble();
		
		double irate=rate/100;
		System.out.print("Enter compounded terms : ");
		int n=s.nextInt();
		System.out.print("Enter Timepeiod in years : ");
		int t=s.nextInt();
				
		amount=principal*Math.pow(1+irate/n, n*t);
		System.out.print("Compound Interest Amount: "+amount);
		
	}

}
