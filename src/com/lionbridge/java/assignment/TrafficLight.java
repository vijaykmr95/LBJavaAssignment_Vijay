package com.lionbridge.java.assignment;

public class TrafficLight {
	
	 enum TrafficLights {
			
			RED(1),
			GREEN(3),
			YELLOW(10);
			
			private final int time;
			
			TrafficLights(int r){
				this.time = r;
			}
			
			public int getTime() {
				return time;
			}
	 }
	
	public static void main(String[] args) {
		
		  System.out.println("RED LIGHT : "+TrafficLights.RED.getTime()+" MINUTES");
		  System.out.println("YELLOW LIGHT : "+TrafficLights.YELLOW.getTime()+" SECONDS ");
		  System.out.println("GREEN LIGHT : "+TrafficLights.GREEN.getTime()+" MINUTES");
	}


}
