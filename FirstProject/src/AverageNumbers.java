import java.util.Scanner;

public class AverageNumbers {

	public static void main(String[] args) {
    int i=1;
    int total=0;
    Scanner num = new Scanner(System.in);
    
    int n=num.nextInt();
    Scanner numbers = new Scanner(System.in);  
    System.out.println("Enter values :");
        
    while(i<=n) {
    	int no=numbers.nextInt();
    	total=total+no;
    	i++;
    }
    int ave=0;
    ave=total/n;
    System.out.println("Anerage of "+n+" numbers is: "+ ave);
	}

}
