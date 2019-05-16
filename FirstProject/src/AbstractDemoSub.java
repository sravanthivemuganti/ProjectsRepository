
public class AbstractDemoSub extends AbstractDemo{

	int c;
	public void add(int a,int b) {
		 c=a+b;
		System.out.println(c);
		
	}
	public void sub(int a,int b) {
		c=a-b;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		
		
		AbstractDemoSub ads= new AbstractDemoSub();
		AbstractDemo ad=new AbstractDemoSub();
		ads.add(5, 10);
		ads.sub(10, 6);
		ad.display();
		}

}
