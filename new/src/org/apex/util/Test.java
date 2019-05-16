package org.apex.util;

public class Test {

	public static void main(String[] args) {
		 final class Constants{
			public final static String name="PI";
		}
		Thread thread=new Thread(new Runnable() {
			public void run() {
				System.out.println(Constants.name);
			}
		}); 
		thread.start();

	}

}
