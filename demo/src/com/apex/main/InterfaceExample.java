package com.apex.main;

public class InterfaceExample {

	public static void main(String[] args) {
		Child child = new Child();
		child.display();
		child.echo();
		child.print();
	}

}
class Mother {
	void display() {
		System.out.println(" in-side display ");
	}
}
interface Father {
	void echo(); //public abstract
	void display();
	double PI_VALUE = 3.14; //public static final
}
class Child extends Mother implements Father {
	@Override
	public void echo() {
		System.out.println(" in-side echo ");
	}
	public void print() {
		System.out.println(" in-side print ");
	}
	public void display() {
		super.display();
		System.out.println(" in-side child");

	}
}