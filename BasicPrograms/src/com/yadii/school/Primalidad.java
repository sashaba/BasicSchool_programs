package com.yadii.school;

import java.util.Scanner;

public class Primalidad {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		

		System.out.println("PRIMALIDAD");

		System.out.println(" ");

		System.out.println("Ingrese un numero entero: ");
		int number = scan.nextInt();

		//  Condiciones.
		
        System.out.print("Es "+number+ " un numero Primo? : ");
        
		if(number % 2 == 1 | number ==2) {
		System.out.println(" SI ");
		
		}else 
		System.out.println("NO");

		}

	}

	


