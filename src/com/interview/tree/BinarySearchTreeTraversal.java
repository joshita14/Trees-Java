package com.interview.tree;

public class BinarySearchTreeTraversal {
	
	/**
	 * PreOrder, InOrder, PostOrder
	 */
	
	private static Node head;
	private static Node addElementsBST(Node node, int data){
		//this is with recursion
		System.out.println("AGAIN");
		if(node == null){
			Node newNode = new Node(data);
			node = newNode; //just add the node and return
		}else{
			if(data < node.data){
				System.out.print("Node Data :"+ data + "Data:"+ node.data);
				System.out.println("Data is less than root, will be added in left side");
			    node.left = addElementsBST(node.left, data);
			}else{
				System.out.println("Data is more than the root, will be added right side");
				//this will move on recursively, till it finds the right side of node as not null
				//Hence will always add node to the right side
				node.right = addElementsBST(node.right, data);
			}
		}
		return node;
	}
	
	
	private static void preOrderTraversal(Node node){
		
		if(node !=null){
			System.out.println(node.data);
			System.out.println("---------->");
			preOrderTraversal(node.left);
			preOrderTraversal(node.right);
		}
	}
	
	private static void inOrderTraversal(Node node){
		
		//System.out.println("INORDER TRAVERSAL");;
		if(node!=null){
			System.out.println("THE CURRENT NODE: "+ node.data);;
			inOrderTraversal(node.left);
			System.out.println(node.data);
			System.out.println("Executing this line as well");;
			inOrderTraversal(node.right);
			System.out.println("Right");;
		}
	}
	
	
	public static void main(String args[]){
	
		head = addElementsBST(head, 15);
		head = addElementsBST(head, 10);
		head = addElementsBST(head, 12);
		head = addElementsBST(head, 40);
		head = addElementsBST(head, 8);
		head = addElementsBST(head, 32);
		head = addElementsBST(head, 45);
		
		//preOrderTraversal(head);
		
		inOrderTraversal(head);
	}

}
