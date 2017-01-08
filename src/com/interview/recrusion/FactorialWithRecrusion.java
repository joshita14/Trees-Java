package com.interview.recrusion;

public class FactorialWithRecrusion {

	private static int factorial(int n){
		
		System.out.println("Calculating F: "+n);
		if(n == 0){
			return 1;
		}
		int f = n*factorial(n-1);
		
		System.out.println("After Calculating F: "+f);
		return f;
	}
	
	public static void main(String args[]){
		int res = factorial(4);
		System.out.println("Result: " +res);
	}
}
