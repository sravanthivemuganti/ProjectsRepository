package org.apex.util;

import java.io.IOException;

public class TestThrows {
	
	void check() throws IOException{
		throw new IOException("device error");//checked exception
	}
	void n() throws IOException{
		check();
	}
	void p() {
		try {
			n();
		}
		catch(Exception e) {
			System.out.println("Exception Hnadled "+e);
		}
	}
	public static void main(String[] args) {
		TestThrows tt=new TestThrows();
		tt.p();
		System.out.println("normal flow...");
	}

}
