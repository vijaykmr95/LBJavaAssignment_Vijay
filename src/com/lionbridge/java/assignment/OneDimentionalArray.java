package com.lionbridge.java.assignment;

public class OneDimentionalArray {
	public static void main(String[] args) {
		
		int array[] = new int[10];
			for (int i=0; i<10; i++) {
				array[i] = 0;
			}
		
		int bonus[] = new int[15];
			for(int j=0; j<15; j++) {
				bonus[j] = 1;
			}
		
	
		int bestScores[] = {20,10,30,50,70,90};
		
			for(int k=0; k<5; k++) {
				System.out.printf("%d\t", bestScores[k]);
				
			}
}
}
