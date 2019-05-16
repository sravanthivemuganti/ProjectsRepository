package org.apex.util;

import java.text.NumberFormat;

import javax.swing.JOptionPane;

public class Sample {

	public static void main(String[] args) {
		
		String num="700.00";
		String num2="5.00";
		Float number=Float.parseFloat(num);
		Float number2=Float.parseFloat(num2);
		Float number3=number+number2;
		
		NumberFormat currency=NumberFormat.getCurrencyInstance();
		
		System.out.println(currency.format(number));
		System.out.println(currency.format(number2));
		System.out.println(currency.format(number3));
		/*System.out.println("Hello World");
		
		double orderTotal=15679.99;
		double discountAmount=100.60;
		double invoiceTotal=orderTotal-discountAmount;
		NumberFormat currency=NumberFormat.getCurrencyInstance();
		String message="Order Total "+currency.format(orderTotal)+" Discount Amount "+currency.format(discountAmount)+ " Invoice Total "+currency.format(invoiceTotal);
		System.out.println(message);
		for(int i=1;i<3;i++) {
		String inputString= JOptionPane.showInputDialog("Enter order total");
		System.out.println(inputString);
		*/
		//}
	}

}
