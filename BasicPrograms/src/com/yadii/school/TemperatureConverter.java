package com.yadii.school;

import java.util.Scanner;

public class TemperatureConverter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter temperature to convert to fahrenheit, kelvin and rankine");
		
		double celcius = scanner.nextDouble();
		
		double fahrenheit = calculatedF(celcius);
		double kelvin = calculatedK(celcius);
		double rankine = calculatedR(celcius);
		
		
		
		System.out.println("Equals to: " + fahrenheit + " °Fahrenheit");
		System.out.println("Equals to: " + kelvin + " °Kelvin");
		System.out.println("Equals to: " + rankine + " °Rankine");
		
	}
	
	static double calculatedF(double celcius) {
		double fahrenheit = (celcius * 9/5) + 32;
		return fahrenheit;
	}
	
	
	static double calculatedK(double celcius) {
		double kelvin = celcius + 273.15;
		return kelvin;
	}
	
	static double calculatedR(double celcius) {
		double rankine = (celcius * 9/5) + 491.67;
		return rankine;
	}

}
