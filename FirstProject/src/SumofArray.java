
public class SumofArray {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};
		int sum=0;
		for(int counter=0;counter<a.length;counter++) {
			sum=sum+a[counter];
		}
		System.out.println("Sum of Array elements : "+sum);
	}

}
