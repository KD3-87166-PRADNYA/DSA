package com.question5_1;

public class BSTMain {

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		
		bst.add(5);
		bst.add(3);
		bst.add(7);
		bst.add(2);
		bst.add(4);
		bst.add(6);
		bst.add(8);
		
		System.out.println("In-order traversal of the BST: ");
		bst.display();
	}
}
