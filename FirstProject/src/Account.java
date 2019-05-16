

public class Account {

	int a;
	int b;
	public void setData(int a,int b)
	{
		// this . used to reference instance variable of current class
		this.a=a;
		this.b=b;
	}
	public void showData() {
		System.out.println("value of a: "+a);
		System.out.println("value of b: "+b);
	}
	
	public static void main(String[] args) {
		
		Account ac= new Account();

		ac.setData(3, 4);
		ac.showData();
		
	}
}

