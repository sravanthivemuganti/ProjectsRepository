package practice.programs;

import java.util.Scanner;

public class JumpingClouds {

	public static void main(String[] args) {
//	       Scanner in = new Scanner(System.in);
//	    int n = in.nextInt();
//	    int c[] = new int[n];
		int c[]= {0,0,0,0,0,1,0,0};
		int n=c.length;
	    int cnt = 0;
	    int jump = 0;
	    for(int i=0; i < n; i++){
	        //c[i] = in.nextInt();
	        if(c[i]==1) {
	            jump += cnt/2+1;
	            cnt = 0;
	        }
	        else
	            cnt ++;
	    }
	    jump += cnt/2;
	    System.out.print(jump);

	    }
}
