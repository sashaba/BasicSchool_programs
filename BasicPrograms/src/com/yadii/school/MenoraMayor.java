package com.yadii.school;

import java.util.Scanner;

// pograma que ordena un array ingresado por el ususario.
public class MenoraMayor {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		            // obtenemos el tamano del arreglo.
		System.out.print("Cuantos numeros tiene este arreglo? : ");
		int tamano = scan.nextInt();
		
		
		            //Inicializamos array y declaramos Variables.
		int[] array = new int[tamano];
		int aux=0; 
//		double mediana;
		
		
		
				    //Obtenemos los elementos del array...                      
		System.out.print("Ingrese los "+tamano+ " numeros que conforman el arreglo : ");
		for(int i=0;i<tamano;i++) {
			System.out.print("\n* Posicion " + (i + 1) + ". = ");
			array[i] = scan.nextInt();
		}
		
		
		            // Ordenamos de menor a mayor.		
		for(int i=0;i<tamano;i++) {
			for(int j=i+1;j<tamano;j++) {
				if(array[i]>array[j]) {        //intercambian posicion si no estan en orden.
		        	aux=array[i];
					array[i]=array[j];
					array[j]= aux;
			     }
		     }
	     }
		
		          //Print array in ascending order.
		/** here the program looks at the first item in the array, then it compares it to each later item
		 * in the array. if later item is lower that the first one, they switch, and it continues running 
		 * through the array until it reaches the end, then it ticks up and it repeats for the second item,
		 * third, etc. until it reaches the end of the array. 
		 */
  	    System.out.print("\nArreglo ordenado de menor a mayor :");
		for(int i=0;i<tamano;i++) {
			System.out.print("  "+array[i]);
        }	
  	    
  	    
		
	             //now arrange in Descending order...
		for(int i=0;i<tamano;i++) {
			for(int j=i+1;j<tamano;j++) {
				if(array[i]<array[j]) { //swap elements if no ordered
		        	aux=array[i];
					array[i]=array[j];
					array[j]=aux;
			}
		}
	}		
		//Print Array in descending order...
				System.out.print("\nArreglo ordenado de mayor a menor :");
				for(int i=0;i<tamano;i++) {
					System.out.print("  "+array[i]);
		        }		
	
	}

}
