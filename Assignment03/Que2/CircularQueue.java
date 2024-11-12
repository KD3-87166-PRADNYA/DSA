package com.assignment;

public class CircularQueue {
	private int arr[];
	private int front, rear;
	private final int SIZE;

	public CircularQueue(int size) {
		SIZE = size;
		arr = new int[SIZE];
		front = rear = -1;
	}

	public void push(int value) {
		rear = (rear + 1) % SIZE;
		arr[rear] = value;
	}

	public int pop() {
		int temp = arr[(front + 1) % SIZE];
		front = (front + 1) % SIZE;
		if (front == rear)
			front = rear = -1;
		return temp;
	}

	public int peek() {
		return arr[(front + 1) % SIZE];
	}

	public boolean isEmpty() {
		return front == rear && rear == -1;
	}

	public boolean isFull() {
		return (front == -1 && rear == SIZE - 1) || (front == rear && rear != -1);
	}

}
