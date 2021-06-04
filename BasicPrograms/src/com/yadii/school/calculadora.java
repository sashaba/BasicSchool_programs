/** This program calculates, addiction, subtraction, multiplication, division and module
 * 
 */
package com.yadii.school;

import java.util.Scanner;


public class calculadora {

	public static void main(String[] args) {
		
		Scanner entry = new Scanner(System.in);
		
		System.out.println("Ingrese dos numeros enteros:" );
		
		int a = entry.nextInt();
		int b = entry.nextInt();

		System.out.println("suma:" + (a + b));
		System.out.println("Diferencia:" + (a - b));
		System.out.println("Producto:" + (a * b));
		System.out.println("Cociente:" + (a / b));
		System.out.println("Residuo:" + (a % b));

	
	}

}
