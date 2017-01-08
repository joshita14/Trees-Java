package com.interview.LinkedList;

public class Node {

	Node next;
	Object data;

	public Object getData() {
		return data;
	}


	public void setData(Object data) {
		this.data = data;
	}


	public Node(int data){
		this.data = data;
	}
	
	
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
}
