package com.yadii.school;

import java.util.Scanner;

public class Par_o_Impar {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println(" Par o Impar");		
		System.out.println( "  " );		
		System.out.print("Ingrese un numero entero: ");		
		int numb = scan.nextInt();
		

		// creamos las instrucciones condicionales.
		
		if ( numb % 2 == 0) {		    
			System.out.println( numb+ " Es un numero Par.");		
		
		} else {			
			System.out.println( numb+ " Es un numero Impar.");
		}
							
	}

}
