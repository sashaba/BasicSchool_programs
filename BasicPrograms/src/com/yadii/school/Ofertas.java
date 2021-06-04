package com.yadii.school;

import java.util.Scanner;

public class Ofertas {

    public static void main(String[] args) {
	 Scanner in = new Scanner(System.in);

// Belen visita tres tiendas para comprar tres camisetas, cada tienda tiene su precio por camiseta


  
       System.out.println("Ingrese el precio de la tienda A");
   	double A = in.nextDouble();

   	System.out.println("Ingrese el valor del descuento de la tienda A");
   	double D = in.nextDouble();

   	System.out.println("Ingrese el precio de la tienda B");
   	double B = in.nextDouble();

   	System.out.println("Ingrese el precio de la tienda C");
   	double C = in.nextDouble();

   	double minimo= tiendas(A,D,B,C);
   	System.out.println("El menor valor que puede pagar Belén por las tres camisetas es: " +minimo);

   	}
		

    static double tiendas(double a, double d, double b, double c){

    	double precioA=(a*3)-(((a*3)*d)/100);

    	double precioB =(b*2);

    	double precioC = c*3;

    	double min=Math.min(precioA, precioB);
    	double mins=Math.min(min,precioC);

    	return mins;

    	}
	
}
