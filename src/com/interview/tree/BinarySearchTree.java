package com.interview.tree;

import static com.interview.tree.BinarySearchTree.createBinaryTree;

public class BinarySearchTree {
	
	/**
	 * This program is not for sorted array, that has to be handeled differently
	 * Some logic:
	 * Logic can be : have to have a sorted array
	 * first element will the smallest and will be the left most element in list
	 * Consider an array: 8,10,12,15,17,20,25
	 * check if the element which is coming is > than the first element, 
	 * if yes then we have to make the new element as the current element, and the old element to the left of the current element
	 * @param args
	 */
	
	static Node head;
	 
	
	public static void createBinaryTree(int data){
		
		Node newNode = new Node(data);
		insertNode(data);
	}
	
	private static void insertNode(int data){
		
	  Node parent;
      Node current;
		 
		
		Node newNode = new Node(data);
		if(head == null){
			head = newNode;
			
		}else{
			current = head;
			
			while(true){
			 parent = current; //have to insert everything w.r.t parent
			 
			 //System.out.println(current.data);
			 if(data < current.data){
				 //The insertion will be on the left
				 current = current.left; //this is to go to the left node
				 if(current == null){
					 parent.left = newNode;
					 return;
				 }
			 }else{
					 current = current.right;
					 parent.right = newNode;
					 return;
				 }
			   }
		    }
	}
	
	
	private static void traverseBST(Node node){
		//recrusive way f traversal
		if(node!=null){
			System.out.println(node.data);
			traverseBST(node.getLeft());
			traverseBST(node.getRight());
		}	
	}
	
	private static void preOrderTraversal(Node node){
		//means leftpart+root+rightpart
		if(node!=null){
			System.out.println(node.data);
			preOrderTraversal(node.left);
			
			preOrderTraversal(node.right);
		}
	}
	
	public static void main(String args[]){
		
		/*createBinaryTree(20);
		createBinaryTree(40);
		createBinaryTree(10);
		createBinaryTree(15);
		createBinaryTree(25); */
		
	/*	traverseBST(head); */
	/*	createBinaryTree(8);
		createBinaryTree(10);
		createBinaryTree(12);
		createBinaryTree(15);
		createBinaryTree(17);
		createBinaryTree(20);
		createBinaryTree(25); */
		//1,5,2,7,4
		
		createBinaryTree(15);
		createBinaryTree(10);
		createBinaryTree(20);
		/*createBinaryTree(7);
		createBinaryTree(4); */
		
		preOrderTraversal(head);
	}

}
