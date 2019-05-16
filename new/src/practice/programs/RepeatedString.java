package practice.programs;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class RepeatedString {

	public static void main(String[] args) {
	
		String s="abcba";
		int n=12;
		int cnt=0;
		String str="";
		//System.out.println(str.length());
			while(str.length()<=n) {
			str=str.concat(s);
			//System.out.println(str);
			}
		
			for(int i=0;i<n;i++) {
				if(str.charAt(i)=='a')				
					cnt++;
			}
			
System.out.println("String : "+str);
System.out.println("cnt: "+cnt);
	}

}
