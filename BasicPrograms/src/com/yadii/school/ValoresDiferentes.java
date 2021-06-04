package com.yadii.school;
import java.util.Arrays;
import java.util.Scanner;

public class ValoresDiferentes {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// obtenemos el tamano del arreglo.
		System.out.print("\nCuantos numeros tiene este arreglo? : ");
		int tamano = scan.nextInt();
		int[] array = new int[tamano];
//		int aux=0; 
		
		
		//Pedimos al usuario los numeros del array
	  	System.out.println("\nIngrese los " + tamano+ " numeros enteros que conforman su arreglo : ");
	  	for ( int i = 0; i < array.length; i++) {
	  		array[i] = scan.nextInt();
	 	}
		
		
		System.out.print("\nEl arreglo tiene " + valoresDiferentes(array, tamano)+ " valores difentes.");
		
	}

	
	
	static int valoresDiferentes (int[] array, int tamano) {
		
		//Primero ordenamos el arreglo para que quede consecutivo		
		Arrays.sort(array);

				
		
		//chequeamos los elementos uno por uno.
		int result = 0;
		
		for ( int i = 0; i < tamano; i++) 
		{
			//movemos el indice adelante mientras hayan duplicados
			while ( i < tamano -1 && array[i] == array[i + 1])
			{
				i++;
					
			}
			result++;
		}
		return result;
	}	
	
}
