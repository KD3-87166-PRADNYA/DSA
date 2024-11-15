package com.question5_1;

public class TreeNode {
	int value;
	TreeNode left;
	TreeNode right;
	
	TreeNode(int value){
		this.value = value;
		left = null;	
	}
}

class BinarySearchTree{
	private TreeNode root;
	
	public BinarySearchTree() {
		root = null;
	}
	
	public void add(int value) {
		root = addRecursive(root, value);
	}
	
	private TreeNode addRecursive(TreeNode current, int value) {
		if(current == null) {
			return new TreeNode(value);
		}
		
		if(value < current.value) {
			current.left = addRecursive(current.left, value);
		}else if(value>current.value) {
			current.right = addRecursive(current.right, value);
		}
		
		return current;
	}
	
	public void display() {
		displayRecursive(root);
	}
	
	public void displayRecursive(TreeNode node) {
		if(node != null) {
			displayRecursive(node.left);
			System.out.print(node.value + " ");
			displayRecursive(node.right);
		}
	}
}
