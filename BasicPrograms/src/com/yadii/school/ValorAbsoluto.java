package com.yadii.school;

import java.util.Scanner;

public class ValorAbsoluto {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
			
		//Declaramos variables.
		
		System.out.print("Ingrese un numero real : ");
		double x = scan.nextDouble();
		
		double absoluto = calculatedAbsoluto(x);
		
		
		
		System.out.println("El valor absoluto es: "+ absoluto);
	}
	
	
	
	
	static double calculatedAbsoluto ( double x) {
			
		if (x < 0) {
			
		 return -x;
		
	} else {
			
		return x;
	}
		
	
	}
		
	
	
}
