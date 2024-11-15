package com.assignment;

public class SinglyCircularLL {
	
	class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	private Node tail;
	private int size;
	
	public SinglyCircularLL() {
		tail = null;
		size = 0;
	}
	
	private boolean isEmpty() {
		return tail == null;
	}
	
	public void display() {
		if(isEmpty())
			return;
		Node trav = tail.next;
		System.out.println("List: ");
		do {
			System.out.println(" " + trav.data);
			trav = trav.next;
		}while(trav != tail.next);
		System.out.println();
	}
	
	public int size() {
		return size;
	}
	
	public void addFirst(int value) {
		Node newnode = new Node(value);
		if(isEmpty()) {
			tail = newnode;
			tail.next = tail;
		}else {
			newnode.next = tail.next;
			tail.next = newnode;
		}
		size++;
	}
	
	public void addLast(int value) {
		Node newnode = new Node(value);
		if(tail == null) {
			tail = newnode;
			tail.next = tail;
		}else {
			newnode.next = tail.next;
			tail.next = newnode;
			tail = tail.next;
		}
		size++;
	}
	
	public void deleteFirst() {
		if(tail == null)
			return;
		else if(size == 1)
			tail = null;
		else {
			tail.next = tail.next.next;
		}
		size--;
	}
	
	public void deleteLast() {
		if(tail == null)
			return;
		else if(size == 1)
			tail = null;
		else {
			Node trav = tail;
			while(trav.next != tail)
				trav = trav.next;
			trav.next = tail.next;
			tail = trav;
		}
		size--;	
	}
}
