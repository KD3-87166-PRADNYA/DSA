package com.assignment2;

public class Main1 {

	public static void main(String[] args) {
		
		SinglyLL1 l1 = new SinglyLL1();
		l1.addLast(40);
		l1.addLast(30);
		l1.addLast(20);
		l1.addLast(10);
		l1.display();
		l1.deleteLast();
		l1.deleteLast();
		l1.addLast(50);
		l1.addLast(60);
		System.out.println("Size: " + l1.size());
		l1.display();

	}

}
