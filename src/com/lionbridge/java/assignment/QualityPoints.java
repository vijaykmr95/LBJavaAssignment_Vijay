package com.lionbridge.java.assignment;

import java.util.Scanner;

public class QualityPoints {
	
	
	public int qualityPoints(int average) {
		if(average>=90) {
			return 4;
		}
		else if(average>=80) {
			return 3;
		}
		else if(average>=70) {
			return 2;
		}
		else if(average>=60) {
			return 1;
		}
		else {
			return 0;
		}
	}
	
	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		QualityPoints Qp = new QualityPoints();
		int Average, Result;
		
		System.out.println("Enter Student's average: ");
		Average = Input.nextInt();
		if(Average <= 0 || Average > 100) {
			System.out.println("Enter a value between 1 and 100.");
		}
		else {
			Result = Qp.qualityPoints(Average);
			System.out.println("Result: "+ Result);
		}
		
	}
}
