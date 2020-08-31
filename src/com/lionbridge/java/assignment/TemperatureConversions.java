package com.lionbridge.java.assignment;

import java.util.Scanner;

public class TemperatureConversions {
	double Celsius, Fahrenheit;
	
	public double CelsiusCalculator(int fahrenheit) {
		Celsius = (5.0 / 9.0 * (fahrenheit - 32));
		return Celsius;
		}
	
	public double FahrenheitCalculator(int celsius) {
		Fahrenheit = (9.0 / 5.0 * celsius + 32);
		return Fahrenheit;
	}
	
	public static void main(String[] args) {
		int Choice, Celsius, Fahrenheit;
		double Output;
		
		Scanner getInput = new Scanner(System.in);
		TemperatureConversions Conversion = new TemperatureConversions();
		
		
		
		System.out.println("Temperature Conversion");
		System.out.println("1 - Celsius to Fahrenheit converter");
		System.out.println("2 - Fahrenheit to Celsius converter");
		System.out.println("Please enter your choice: ");
		Choice = getInput.nextInt();
		
		if (Choice == 1) {
			System.out.println("Please enter the celcius value: ");
			Celsius = getInput.nextInt();
			Output = Conversion.FahrenheitCalculator(Celsius);
			System.out.println("The Equivalent Fahrenheit value is " + Output + " degree F");
		}
		else if(Choice == 2) {
			System.out.println("Please enter the Fahrenheit value: ");
			Fahrenheit = getInput.nextInt();
			Output = Conversion.CelsiusCalculator(Fahrenheit);
			System.out.println("The Equivalent Fahrenheit value is " + Output + " degree C");
		}
		else {
			System.out.println("Please select any one of the above choices.");
		}
		
	}
}
