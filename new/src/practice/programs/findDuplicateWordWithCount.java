package practice.programs;

import java.util.concurrent.BrokenBarrierException;

public class findDuplicateWordWithCount {

	public static void main(String[] args) {
		String str="hi hello hi";
		String[] brokenString=str.split(" ");
		int count=1;
		for(int i=0;i<brokenString.length;i++) {
			for(int j=i+1;j<brokenString.length;j++)
			{
				if(brokenString[i].equals(brokenString[j])) {
					count=count+1;
					brokenString[j]="0";
					
				}
			}
			if(brokenString[i]!="0") {
				System.out.println(brokenString[i]+" is "+ count);
				count=1;
			}
		}

	}

}
