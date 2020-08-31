package com.lionbridge.java.assignment;

public class Vehicle {
	public void hondaCar() {
		System.out.println("You have selected the car from Vehicle Class");
	}
	
	public void hondaBike() {
		System.out.println("You have selected the bike from Vehicle Class");
	}
	
}

class Car extends Vehicle{
	
	public void hondaCar() {
		System.out.println("You have selected the car from Car Class");
	}
	
	public static void main(String[] args) {
		Car car = new Car();
		car.hondaCar();
		
		Vehicle car1 = new Vehicle();
		car1.hondaCar();
		
	}
	
}

class TwoWheeler extends Vehicle{
	
	public void hondaBike() {
		System.out.println("You have selected the bike from Two Wheeler Class");
	}
	
	public static void main(String[] args) {
		TwoWheeler bike = new TwoWheeler();
		bike.hondaCar();
		
		Vehicle bike1 = new TwoWheeler();
		bike1.hondaBike();
		
	}
	
}