package com.yadii.school;

import java.util.Scanner;

public class Cuaderno {

	public static void main(String[] args) {
       // ¿Cuántos cuadritos hay en cada página del cuaderno de María?

	    Scanner in = new Scanner(System.in);


		    

	    System.out.println(" Ingrese el valor del largo de la página: " );
	    double a = in.nextDouble();

		    
	    System.out.println(" Ingrese el valor del ancho de la página: " );
	    double  b = in.nextDouble();
		    
		    
	    calculateSquares(a, b);	    	    	    
      }






	public static void calculateSquares(double a, double b){

	    double heigth = a - 2;

	    double width = b - 1;	

	
			
	    System.out.println ("Cantidad de cuadritos a lo largo " + heigth/0.5);
	

        System.out.println ("Cantidad de cuadritos a lo ancho " + width/0.5); 

   
        double totalSquares = (width/0.5) * (heigth/0.5);    
	    System.out.println ("CANTIDAD TOTAL DE CUADRITOS: " + totalSquares);


	}

}

