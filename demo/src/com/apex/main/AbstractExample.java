package com.apex.main;

public class AbstractExample {
	public static void main(String[] args) {
//		Circle circle = new Circle();
//		circle.r = 10;
//		System.out.println("Area : " + circle.area());
//		Square square = new Square();
//		square.a = 10;
//		System.out.println("Area : " + square.area());
		
		Shape shape = null;
		shape = new Circle(10); //Parent variable can  point to child object memory
		display(shape);
		shape.displayColor();
		( ( Circle ) shape).echo();
		shape = new Square(10);
		display(shape);
//		((Circle) shape).echo();it gives an exception ClassCaseException because shape object has now square class
	}
	public static void display(Shape s) {
		System.out.println(s.area());
	}
}
abstract class Shape { // no more objects
	String color;
	public Shape() {
		color = "Black";
	}
	public Shape(String color) {
		this.color = color;
	}
	abstract double area();
	void displayColor() {
		System.out.println("Color : "+color);
	}
}
class Circle extends Shape { // data + method - const
	double r;
	Circle() { 
		r = 0;
	}
	Circle(double r) {
		super();
		this.r = r;
	}
	@Override
	double area() {
		return Math.PI * r * r;
	}
	void echo() {
		System.out.println("inside echo");
	}
}
class Square extends Shape { // data + method - const
	double a;
	Square() { 
		a = 0;
	}
	Square(double a) { 
		this.a = a;
	}
	@Override
	double area() {
		return a * a;
	}
}
