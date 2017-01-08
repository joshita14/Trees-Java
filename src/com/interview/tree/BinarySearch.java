package com.interview.tree;

public class BinarySearch {

	
	private static void binarySearch(int[] tree, int searchNo){
		
		int lastEle;
		int firstEle;
		int middleEle;
		
		lastEle = tree.length -1 ;  //(This means get the INDEX of the last element)
		firstEle = 0;
		middleEle = (lastEle + firstEle)/2;
		
		//traverse only till you have first element less
		while(tree[firstEle] < tree[lastEle]){
			
			if(tree[middleEle] == searchNo){
				System.out.println("Element is found");
				break;
			}else if(tree[middleEle] < searchNo){
				//we will shift the array to a position back
				firstEle = middleEle+1;
			}else{
				//we have the number larger than the search number
				lastEle = middleEle-1;
			}
			middleEle = (lastEle + firstEle)/2;
		}
		
		
		if(tree[firstEle] > tree[lastEle]){
			System.out.println("We dont have sorted array, cant have binary search implemented");
		}
	}
	
	public static void main(String args[]){
		
	int[] tree = {8, 10, 12, 15, 17, 20, 25};
	
	System.out.println("Search for number 10");
	binarySearch(tree, 10);
	
	}
}
