package org.apex.collections;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {

		ArrayList<Book> al=new ArrayList<Book>();
		Book b1 = new Book(101, "Let us C","Yashwant Kanetkar","BPB",8);  
		Book b2 = new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
		Book b3 = new Book(103,"Operating System","Galvin","Wiley",6);  
		
		//Adding  books to list
		al.add(b1);
		al.add(b2);
		al.add(b3);
		
		//Traversing list 	
		for(Book b:al) {
			System.out.println(b.id+" "+b.name+", "+b.author+" "+b.publisher+" "+b.quantity);
		}
	}

}
