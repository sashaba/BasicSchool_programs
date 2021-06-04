package com.yadii.school;

import java.util.Scanner;

public class JuegodeDardos {

	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("  ");
		System.out.println("Donde cayo el dardo?, Ingrese las coordenadas.");
		System.out.print(" \n "  +  "  Coordenada X = ");
		int x = scan.nextInt();
		
		
		System.out.print("  "  +  " Coordenada Y = ");
		int y = scan.nextInt();
		
		
	    calculatedPuntaje(x, y);
	   
	}
	
	
	
	
	
	
   static void calculatedPuntaje(int x, int y ) {
	   
	   //Calculamos distancia entre las coordenadas.	   
	   double distancia = Math.sqrt((x-0)*(x-0)+(y-0)*(y-0));
	   
	   
	   // creamos las instrucciones condicionales.
	   
	   System.out.println("\nEl dardo golpeo el punto (" +x+","+y+")");
//	   System.out.print("\nPUNTAJE = ");
	   	   
	   if (distancia <= 1){
	       System.out.println("15 puntos - Excelente!  ");
	   
	   } else if (1 < distancia && distancia <= 2) {
		   System.out.println("9 puntos  - Buen trabajo!");
		   
	   } else if (2 < distancia && distancia <=3) {
		   System.out.println("5 puntos  - Puedes mejorar!");
		   
	   } else if (3 < distancia && distancia <= 4) {
		   System.out.println("2 puntos  - Necesitas mas practica!");
		   
	   } else if (4 < distancia && distancia <= 5) {
		   System.out.println(" 1 punto  - Vuelve a intentarlo!");
		   
	   } else {
		   System.out.println("0 puntos. - oops! El dardo cayo fuera del tablero");
		   
	   }	
		
	}


}
