package com.lionbridge.java.assignment;

public class FactorialFunction {
	public static void main(String[] args) {
		long Factorial;
		System.out.format("%10s%30s", "X", "Factorial of X");
		System.out.println();
		for(int i=1; i<=20; i++) {
			Factorial = 1;
			for(int j=1; j<=i; j++) {
				Factorial *= j;
			}
			System.out.format("%10d%30d", i, Factorial);
			System.out.println();
		}
		
	}
}
