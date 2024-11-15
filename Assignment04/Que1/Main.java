package com.assignment;

public class Main {

	public static void main(String[] args) {
		SinglyCircularLL l1 = new SinglyCircularLL();
		
		l1.addLast(40);
		l1.addLast(30);
		l1.addLast(20);
		l1.addLast(10);
		
		l1.display();
		
		l1.deleteFirst();
		l1.deleteLast();
		
		l1.addLast(50);
		l1.addFirst(60);
		
		System.out.println("Size: " +l1.size());
		
		l1.display();
	}
}
