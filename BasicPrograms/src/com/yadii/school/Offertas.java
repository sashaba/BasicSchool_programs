package com.yadii.school;


import java.util.Scanner;

public class Offertas {

	public static void main(String[] args) {
		Scanner cantidad = new Scanner(System.in);
		
		System.out.println("Ingrese cuatro numeros que representaran las cantidades de los valores de A, B, C, D, para saber cual es el menor valor a pagar por la compra de tres camisetas.");
		
		// Cantidades a ingresar por el usuario
		double a = cantidad.nextDouble();
		double b = cantidad.nextDouble();
		double c = cantidad.nextDouble();
		double d = cantidad.nextDouble();
		
		//calculo del subtotal y el descuento de la tienda 1
		double subTotalTienda1 = calculoSubTotalTienda1(a);
		double descuentoTienda1 = calculoDescuentoTienda1(a, d);
		
         // Valor final a pagar en cada tienda
		double tienda1 = calculoTienda1(subTotalTienda1, descuentoTienda1);
		double tienda2 = calculoTienda2(b);
		double tienda3 = calculoTienda3(c);
		
		// metodo para calcular el menor valor
		double menorValorAPagar = Math.min(Math.min(tienda1, tienda2), tienda3);
		
		// Aqui mostramos los calculos matematicos realizadas en cada tienda
		System.out.println("\n" + "TIENDA 1:");
		System.out.println("Sub Total = " + "(3 x A) = " + "(3 x " + a + ") = " + subTotalTienda1);
		System.out.println("Descuento = " + "(3 x A x D)/100 = " + "(3 x " + a + " x " + d + ") / 100 = " + descuentoTienda1);
		System.out.println("Valor Total = " + " 15.0 - 1.5 = " + tienda1);
		System.out.println("\n" + "TIENDA 2: ");
		System.out.println("(3 x B)- B = " + "(3 x " + b + ") - " + b + " = " + tienda2);
		System.out.println("\n" + "TIENDA 3");
		System.out.println("3 x C = 3 x " + c + " = " + tienda3);
		
		//Mostramos el menor valor a pagar
		System.out.println("\n" + "El MENOR VALOR A PAGAR ES : " + menorValorAPagar + " Pesos");
		
	}
	
	static double calculoSubTotalTienda1(double a) {
		double calculoSubTotalTienda1 =  3 * a;
		return calculoSubTotalTienda1;
	}
	
	static double calculoDescuentoTienda1(double a, double d) {
		double calculoDescuentoTienda1 =  ((3 * a * d) / 100);
		return calculoDescuentoTienda1;
	}
	
	static double calculoTienda1(double subTotalTienda1, double descuentoTienda1) {
		double calculoTienda1 = (subTotalTienda1 - descuentoTienda1);
		return calculoTienda1;
	}
	
	static double calculoTienda2(double b) {
		double calculoTienda2 =  (3 * b) - b;
		return calculoTienda2;
	}

	static double calculoTienda3(double c) {
		double calculoTienda3 =  3 * c;
		return calculoTienda3;
	}
	

}
