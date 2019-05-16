
public class MultydimArray {

	public static void main(String[] args) {
		int firstarray[][]= {{2,3,4,5},{6,7,8,9}};
		int secondarray[][]= {{1,2,3,4},{5},{6,7,8}};
		System.out.println("This is the first array ");
		display(firstarray);
		System.out.println("This is second array");
		display(secondarray);
		
	}
	public static void display(int a[][]) {
		
		for(int row=0;row<a.length;row++) {
			
			for(int column=0;column<a[row].length;column++) {
				System.out.print(a[row][column]+"\t");
			}
				System.out.println();
		}
			
	}

}
