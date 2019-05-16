import java.util.Scanner;

public class FirstProgram {

	public static void main(String[] args) {
		// variable declaration
		int i = 10;
		char c = 'A';
		double d = 2.34;
		System.out.println(" print values : " +i+" "+ c + " " + d);	
		
	//Get input 
		System.out.print("Enter Your Name : ");
		Scanner name=new Scanner(System.in);
		System.out.println("My Name is :"+name.nextLine());
	
	// Math operators
		Scanner num = new Scanner(System.in);
		int a,b,sum,dif,prod,div,rem;
		System.out.print("Enter a number :");
		a= num.nextInt();
		System.out.print("Enter a number :");
		b= num.nextInt();
		sum= a+b;
		dif = a-b;
		prod=a*b;
		div=a/b;
		rem=a%b;
		System.out.println("Addition of "+ a +" and "+ b +" is :" + sum);
		System.out.println("Difference of "+ a +" and "+ b +" is :" + dif);
		System.out.println("Product of "+ a +" and "+ b +" is :" + prod);
		System.out.println("Division of "+ a +" and "+ b +" is :" + div);
		System.out.println("Remainder for "+ a +" and "+ b +" is :" + rem);
		
		//If statement
		
		int x, y;
		System.out.println("Enter values for x and y: ");
		Scanner x1=new Scanner(System.in);
		Scanner y1=new Scanner(System.in);
		
		x=x1.nextInt();
		y=y1.nextInt();
		if(x == y)
			System.out.println(" Equal ");
		else 
			if(x >= y)
				System.out.println(" x is greater");
			else
				System.out.println(" y is greater");
		
		
		// Logical Operator
		
		int red=15,yellow=20;
		if(red<10 && yellow>10)
			System.out.println("True");
		else
			System.out.println("False");
		
		if(red<10 || yellow>5)
			System.out.println(" True ");
		else
			System.out.println(" False ");
			
		
		// switch statement
		
		int age;
		 age = 4;
		 
		switch (age) {
		
		case 1: 
			System.out.println("Case 1 age is : "+age);
			break;
		case 5:
			System.out.println("Case 5 age is : "+age);
			break;
		case 10:
			System.out.println("Case 10 age is : "+age);
			break;
		default:
			System.out.println(" Default age is : "+age);
			break;
		}
	
		//While
		
		int counter =5;
		while(counter <=10) {
			System.out.println(counter);
		counter++;
		}
		System.out.println("Now counter value: "+counter);
		
		//Conditional Statement
		
		int val =45;
		System.out.println(val>50 ? "you are old" : "you are young");
		

	}
	
	

}
