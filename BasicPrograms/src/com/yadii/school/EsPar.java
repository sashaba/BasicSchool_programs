package com.yadii.school;

import java.util.Scanner;

//Dado un número entero, decidir si es o no par.

public class EsPar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
   		
		// Declaramos las variables
		
		System.out.print("Ingrese un numero entero: ");
		int numb = scan.nextInt();

	    
		System.out.print("\n Es "+numb+ " un numero Par? : ");
		
		esPar(numb);
		
		
	}


	
	// creamos las instrucciones condicionales.
	
	static void esPar(int numb) {	
		
		if (numb % 2 == 0) {
			
			System.out.println("YES");
			
			
		} else {	
			
			System.out.println("NO");
			
		}
		
	
     }
	
	
}