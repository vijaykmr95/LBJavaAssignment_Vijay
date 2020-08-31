package com.lionbridge.java.assignment;

import java.util.Scanner;

public class SalaryCalculator {
	private int BaseHours = 40;
	private double OvertimeRate = 1.5;
	
	private double EmployeeWorkHours, HourlyRates;
	
	public double GrossPay;
	
	public void setEmployeeWorkHours(double employeeworkhours) {
		EmployeeWorkHours = employeeworkhours;
	}
	
	public void setHourlyRates(double hourlyrates) {
		HourlyRates = hourlyrates;
	}
	
	public double grossPayCalculator() {
		if (EmployeeWorkHours > 40) {
			GrossPay = (BaseHours * HourlyRates) + ((EmployeeWorkHours - BaseHours) * (HourlyRates * OvertimeRate));
			return GrossPay;
		}
		else {
			GrossPay = EmployeeWorkHours * HourlyRates;
			return GrossPay;
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		SalaryCalculator SalaryCalc = new SalaryCalculator();
		
		for (int i=1; i <4; i++) {
		System.out.println("Employee weekly hours:");
		SalaryCalc.setEmployeeWorkHours(scan.nextDouble());
		
		System.out.println("Employee hourly rates:");
		SalaryCalc.setHourlyRates(scan.nextDouble());
		
		System.out.println("GrossPay");
		System.out.println(SalaryCalc.grossPayCalculator());
		System.out.println("-----------------------------");
		}
	}

}
