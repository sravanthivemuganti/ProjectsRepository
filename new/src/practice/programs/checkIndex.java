package practice.programs;

public class checkIndex {

	public static void main(String[] args) {

		int[] num= {1,2,255,12,34,5,6};
		for(int i=0;i<num.length;i++) {
			if(num[i]!=255)
				System.out.println("index : "+i+" - "+(i+1));
			else
				System.out.println("index : "+i+" - "+(i+2));
		}
	}

}
