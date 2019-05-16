package practice.programs;

public class CountingValleys {

	static int countingValleys(int n, String s) {
        int v=0;
        int level=0;
        for(char c:s.toCharArray()) {
        	if(c=='U') 
        		level=level+1;
        	if(c=='D')
        		level=level-1;
        	if(level==0 && c=='U')
        		v=v+1;
        }

        	return v;
    }
	public static void main(String[] args) {
		String s="DDUUDDUDUUUD";
		int n=s.length();
		int count=countingValleys(n,s);
		System.out.println(count);
	}

}
