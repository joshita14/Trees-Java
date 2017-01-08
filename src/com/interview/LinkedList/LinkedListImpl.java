package com.interview.LinkedList;

public class LinkedListImpl {

	static Node head;
	Node current; // head of node this will sequential linear data structure
	static Node tail;    // last of node
	
	private static void implLinkedList(int data){
		
		Node newNode = new Node(data);
		
		if(head == null){
			head = newNode;
			tail = head;
		}else{
			//we have data in the first node
			tail.setNext(newNode);
			tail = newNode; //because now some other node will be added in next run
		}
	}
	
	//Traverse a linkedList
	private static void traverseList(){
		Node temp = head;
		
		while(true){
			
			if(temp == null){
				break;
			}
			System.out.println("NODES: "+ temp.getData());
			temp = temp.getNext();
		}
	}
	
	
	public static void main(String args[]){
		
		implLinkedList(20);
		implLinkedList(31);
		implLinkedList(53);
		implLinkedList(43);
		implLinkedList(34);
		implLinkedList(23);
		implLinkedList(10);
		
		traverseList();
		
	}
}
