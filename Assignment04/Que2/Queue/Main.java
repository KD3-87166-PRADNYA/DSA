package com.assignment2;

public class Main {

	public static void main(String[] args) {
		SinglyLL l1 = new SinglyLL();
		l1.addLast(40);
		l1.addLast(30);
		l1.addLast(20);
		l1.addLast(10);
		l1.display();
		l1.deleteFirst();
		l1.deleteFirst();
		l1.addLast(50);
		l1.addLast(70);
		System.out.println("Size: " + l1.size());
		l1.display();

	}

}
