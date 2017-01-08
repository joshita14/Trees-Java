package com.interview.tree;

import java.util.LinkedList;
import java.util.Queue;
public class BreathFirstSearch {
	
	/**
	 * BreathFirstSearch is an algo where we visit parent before the child
	 * So we traverse each level first an then move to the next level
	 * BFS can be implemented using queues
	 */
    
	
	public static Node insertNodeInBST(Node node, int data){
		
		if(node == null){
			Node newNode = new Node(data);
			node = newNode;
		}else{
			if(data < node.data){
				node.left = insertNodeInBST(node.left, data);
			}else{
				node.right = insertNodeInBST(node.right, data);
			}
		}
		
		return node;
	}
	
	
	public static void breathFirstTraversal(Node node){
	
		//implement by using queue:
		Queue<Node> queue = new LinkedList<Node>();
		
		if(queue.isEmpty()){
			
			System.out.println("We are on root node and will insert an element in queue");
			queue.add(node.left);
			queue.add(node.right);
		}
		
		while(!queue.isEmpty()){
			System.out.println("Queue is not empty");
			
			node = queue.poll();
			if(node.left !=null){
				queue.add(node.left);
			}
			if(node.right !=null){
				queue.add(node.right);
			}
			System.out.println("Priting the Tree Nodes: " + node.data);
		}
	}
	
	public static void main(String args[]){
		
		Node node = null;
		
		node = insertNodeInBST(node, 15);
		node = insertNodeInBST(node, 10);
		node = insertNodeInBST(node, 12);
		node = insertNodeInBST(node, 40);
		node = insertNodeInBST(node, 8);
		node = insertNodeInBST(node, 32);
		node = insertNodeInBST(node, 45);
		
		breathFirstTraversal(node);
	}
}
