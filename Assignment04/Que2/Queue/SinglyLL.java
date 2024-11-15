package com.assignment2;

public class SinglyLL {
	
	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	private Node tail;
	private int size;

	public SinglyLL() {
		tail = null;
		size = 0;
	}

	private boolean isEmpty() {
		return tail == null;
	}
	
	public void display() {
		if (isEmpty())
			return;
		Node trav = tail.next;
		System.out.print("List : ");
		do {
			System.out.print(" " + trav.data);
			trav = trav.next;
		} while (trav != tail.next);
		System.out.println();
	}

	public int size() {
		return size;
	}
	
	public void addLast(int data) {
		Node newNode = new Node(data);
		if (tail == null) {
			tail = newNode;
			tail.next = tail;
		} else {
			newNode.next = tail.next;
			tail.next = newNode;
			tail = tail.next;
		}
		size++;
	}
	
	public void deleteFirst() {
		if (tail == null)
			return;
		else if (size == 1)
			tail = null;
		else {
			tail.next = tail.next.next;
		}
		size--;
	}
}
