package com.lionbridge.java.assignment;

public class VariableArguments {
	
	static void product(int ...value) {
		int Output = 1;
		
		System.out.println("Number of arguments: " + value.length);
		
		for(int i=0; i<value.length; i++) {
				Output *= value[i];
		}
		System.out.println("Product of all values: "+ Output);
	}
	
	
	public static void main(String[] args) {
		product(5);
		product(1, 2, 3);
		product(3, 3, 3, 3, 3);
		
		
	}

}
