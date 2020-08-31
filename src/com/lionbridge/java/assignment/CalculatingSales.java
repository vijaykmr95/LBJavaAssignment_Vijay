package com.lionbridge.java.assignment;

import java.util.Scanner;

public class CalculatingSales {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double TotalRetail = 0;
		int ProductNumber, QuantitySold;
		
		while(true) {
			System.out.println("1 - Product 1 ($2.98)");
			System.out.println("2 - Product 2 ($4.50)");
			System.out.println("3 - Product 3 ($9.98)");
			System.out.println("4 - Product 4 ($4.49)");
			System.out.println("5 - Product 5 ($6.87)");
			System.out.println("6 - Exit");
			
			System.out.println("Enter Product number: ");
			ProductNumber = sc.nextInt();
			
			if(ProductNumber == 6) {
				if(TotalRetail != 0) {
				System.out.println("Total retail value of all products: $" + TotalRetail );
				break;
				}
				else {
				System.out.println("Total retail value of all products: $" + TotalRetail );
				break;
				}
			}
			
			System.out.println("Enter Quantity: ");
			QuantitySold = sc.nextInt();
			
			switch (ProductNumber) {
			
			case 1:
				TotalRetail += QuantitySold * 2.98;
				break;
				
			case 2:
				TotalRetail += QuantitySold * 4.50;
				break;
			
			case 3:
				TotalRetail += QuantitySold * 9.98;
				break;
				
			case 4:
				TotalRetail += QuantitySold * 4.49;
				break;
				
			case 5:
				TotalRetail += QuantitySold * 6.87;
				break;
			
			}
			
			}
		
	}

}
