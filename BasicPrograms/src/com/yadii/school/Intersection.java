package com.yadii.school;

import java.util.Scanner;

public class Intersection {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		
		int[] array = {3, 9, 5, 15, 17, 21, 24, 36, 14, 8, 4, 53, 67, 79,81};
		
		//Printeamos el array.
		System.out.println("\nEscoja un numero del siguiente arreglo para saber su posicion:");
		System.out.print("\n[ ");
		
		for (int i =0; i < array.length;i++) {
		 System.out.print(+array[i]+ ", ");
		}
		System.out.println("]");
		 
		//Pedimos al usuario el numero n.
		 System.out.print("\nIngrese el numero elegido : ");
			int n = scan.nextInt();
		
		 	
		//Printeamos respuesta.	
			System.out.println("\nLa posicion del numero "+n+" es: "+ position(array, n));			
	
	}
	
	
	static int position (int[] array, int n) {
		
		//si el array es nulo
		
		if (array == null)
			return -1;
		
		//encontramos la posicion
		int i = 0;
		
		while (i < array.length) 
		{
			if ( array[i] == n)
			{				
				return i;
			}
			
			else i++;			
		}
		return -1;
	}

}
