package com.lionbridge.java.assignment;

import java.util.Scanner;

public class RectangleClass {
	
	float Perimeter, Area;
	private float Length, Width;
	
	public float getLength() {
		return Length;
	}
	public void setLength(float length) {
		if(length > 0.0 || length < 20.0) {
		Length = length;
		}
		else {
			System.out.println("Please enter values between 0 and 20.");
		}
	}
	public float getWidth() {
		return Width;
	}
	public void setWidth(float width) {
		if(width > 0.0 || width < 20.0) {
		Width = width;
		}
		else {
			System.out.println("Please enter values between 0 and 20.");
		}
	}
	
	
	public float calculatePerimeter() {
		Perimeter = (2 * Length * Width);
		return Perimeter;
		
	}
	
	public float calculateArea() {
		Area = (Length * Width);
		return Area;
	}
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		RectangleClass Rectangle = new RectangleClass();
		
		
		System.out.println("Enter a value for length:");
		Rectangle.setLength(input.nextFloat());
		
		System.out.println("Enter a value for width:");
		Rectangle.setWidth(input.nextFloat());
		
		
		System.out.println("Perimeter of the Rectangle: "+ Rectangle.calculatePerimeter());
		
		System.out.println("Area of the Rectangle: "+ Rectangle.calculateArea());
		
	}
	

}
