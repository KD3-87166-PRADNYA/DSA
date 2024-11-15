package com.question5_1;

public class TreeNode1 {
	int value;
	TreeNode left;
	TreeNode right;
	
	TreeNode1(int value){
		this.value = value;
		left = null;
		right = null;
	}
}

class BinarySearchTree1{
	private TreeNode root;
	
	public BinarySearchTree1() {
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
		}else if(value > current.value){
			current.right = addRecursive(current.right, value);
		}
		return current;
	}
	
	public boolean search(int value) {
		return searchRecursive(root, value);
	}
	
	private boolean searchRecursive(TreeNode current, int value) {
		if(current == null) {
			return false;
		}
		if(current.value == value) {
			return true;
		}
		if(value < current.value) {
			return searchRecursive(current.left, value);
		}else {
			return searchRecursive(current.right, value);
		}
	}
}
