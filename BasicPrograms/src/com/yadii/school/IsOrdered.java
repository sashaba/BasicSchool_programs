package com.yadii.school;

import java.util.Scanner;

public class IsOrdered {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		//Pedimos al usuario el tamano del array
		System.out.print("\nCuantos numeros tiene su arreglo? : ");
		int tamano = scan.nextInt();
		int[] array = new int[tamano];           
		

		
		// Pedimos al usuario los numeros.	
		System.out.println("\nIngrese los " + array.length+ " numeros que conforman el arreglo : ");
		for ( int i = 0; i < array.length; i++) {
		array[i] = scan.nextInt();
		}
		
		
		//Respondemos si esta no ordenado.		
		if (ordered(array))	
			
			System.out.println("\nEl arreglo SI está ordenado de menor a mayor.");
		
		else 			
			System.out.println("\nEl arreglo NO está ordenado de menor a mayor.");	
	
	}
	
	
	
	
	public static boolean ordered (int[] array) {
			for(int i=0; i < array.length - 1; i++) {
				if (array[i] > array[i+1]) {
					return false;				
				}
			}
			return true;		
		}
	
	
}
