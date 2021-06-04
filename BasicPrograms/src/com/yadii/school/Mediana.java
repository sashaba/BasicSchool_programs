 package com.yadii.school;

import java.util.Scanner;

public class Mediana {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//Pedimos al usuario el tamano del array
		System.out.println("\nARREGLO DE NUMEROS REALES");
		System.out.print("\nCuantos numeros tiene su arreglo? : ");
		int tamano = scan.nextInt();
		
		//Inicializamos array de numeros reales
		double[] array = new double[tamano];             
	  	double mediana;
	  	
	  	
	  	//Pedimos al usuario los numeros del array
	  	System.out.println("\nIngrese los " + tamano+ " numeros reales que conforman su arreglo : ");
	  	for ( int i = 0; i < array.length; i++) {
	  		array[i] = scan.nextDouble();
	 	}
	  	
	  	
	  	
	    // Luego calculamos la mediana.			
		
	  	if(tamano % 2 ==0) {     
	  		mediana =(double)(array[tamano /2 - 1] + (double) array[tamano / 2]) / 2.0;
					
	  	} else {
	  		mediana = (double)array[tamano / 2];
	  	} 
	  	
	  	
	    //Printeamos la respuesta.
	  	System.out.print("\nLa MEDIANA de su arreglo es:  " + mediana);	
				
	}

}
