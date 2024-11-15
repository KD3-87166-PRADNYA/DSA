package com.question5_1;

public class BSTMain1 {

	public static void main(String[] args) {
		BinarySearchTree1 bst = new BinarySearchTree1();
		
		bst.add(5);
		bst.add(3);
		bst.add(7);
		bst.add(2);
		bst.add(4);
		bst.add(6);
		bst.add(8);
		
		System.out.println("Searching for 2: " + bst.search(2));
		System.out.println("Searching for 9: " + bst.search(9));
		
		
		

	}

}
