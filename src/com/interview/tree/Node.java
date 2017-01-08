package com.interview.tree;

public class Node {

	
	Node left;
    Node right;
	int data;

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}

	
	
	public Node(int data){
		this.data = data;
	}
}
