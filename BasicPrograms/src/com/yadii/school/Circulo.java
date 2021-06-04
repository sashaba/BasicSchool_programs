/** This program calculates the Area and Perimeter of a circle based on its radius
 * 
 * 
 * **/ 
package com.yadii.school;

import java.util.Scanner;


public class Circulo {

	public static void main(String[] args) {
	Scanner ety = new Scanner(System.in);
	System.out.println("Enter the Circle's radius");
	
	double radius = ety.nextDouble();
	double area = calculateArea(radius);
	double perimeter = calculatePerimeter(radius);
		
	System.out.println("Area:" + area);
	System.out.println("perimeter:" + perimeter);
	
	}

	static double calculateArea(double radius) {
		double area = radius * radius * Math.PI;
		return area;
	}
	
	static double calculatePerimeter(double r) {
		return 2 * r * Math.PI;
	}
}
