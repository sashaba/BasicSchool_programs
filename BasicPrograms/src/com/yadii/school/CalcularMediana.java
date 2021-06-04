package com.yadii.school;

import java.util.Scanner;

public class CalcularMediana {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		      		
			    // Declaramos array y Variables.

	  	int[] array = new int[8];            //nuestro array es de 8 numeros.
	  	int aux=0; 
	  	int tamano = array.length;
	  	double mediana;
	  	
	  	
	    // Pedimos al usuario los numeros.	
	  	System.out.println("\nIngrese los " + array.length+ " numeros que conforman el arreglo : ");
	  	for ( int i = 0; i < array.length; i++) {
	  		array[i] = scan.nextInt();
	 		}
				
				
        // Printeamos el array dado.
				
	  	System.out.print("\nArreglo Inicial : { ");
	  	for(int i=0;i<array.length;i++) {
	  		System.out.print("  "+array[i]);
	  	}					
	  	System.out.println("  }");
				
				
				
		// Primero ordenamos el array de menor a mayor.		
				
	  	for(int i=0;i<tamano;i++) {
	  		for(int j=i+1;j<tamano;j++) {
	  			if(array[i]>array[j]) {   //intercambian posicion si no estan en orden.
	  				aux=array[i];
	  				array[i]=array[j];
	  				array[j]= aux;
	  			}
	  		}
	  	}
				
	  	// Luego calculamos la mediana.			
				
	  	if(tamano % 2 ==0) {     
	  		mediana =(double)(array[tamano /2 - 1] + (double) array[tamano / 2]) / 2.0;
					
	  	} else {
	  		mediana = (double)array[tamano / 2];
	  	}  
				
				
				
	  	//Printeamos las respuestas.
	  	System.out.print("\nArreglo ordenado de menor a mayor : {");
	  	for(int i=0;i<tamano;i++) {
	  		System.out.print("  "+array[i]);
	  		}	
	  	System.out.println(" } ");
	  	System.out.println("\nLa MEDIANA del arreglo es: "+mediana);	
				
	}
}