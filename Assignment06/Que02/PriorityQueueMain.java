package com.sunbeam;

public class PriorityQueueMain {

	public static void main(String[] args) {
		
		Queue priQ = new Queue(9);
		
		System.out.println("isEmpty : " + priQ.isEmpty());
		System.out.println("isFull : " + priQ.isFull());
		
		priQ.push(6);
		priQ.push(14);
		priQ.push(3);
		priQ.push(26);
		
		System.out.println("Peeked element : " + priQ.peek());	
		System.out.println("Poped element : " + priQ.pop());	
		
		System.out.println("Peeked element : " + priQ.peek());	
		System.out.println("Poped element : " + priQ.pop());	
		
		System.out.println("Peeked element : " + priQ.peek());	
		System.out.println("Poped element : " + priQ.pop());	
		
		System.out.println("Peeked element : " + priQ.peek());	
		System.out.println("Poped element : " + priQ.pop());
		
		System.out.println("isEmpty : " + priQ.isEmpty());
		System.out.println("isFull : " + priQ.isFull());
		
		

	}

}

