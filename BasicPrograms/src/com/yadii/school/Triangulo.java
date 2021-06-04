package com.yadii.school;

import java.util.Scanner;

public class Triangulo {
	
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
 
 
		double l1, l2, l3;
 
		System.out.println("Ingrese la longitud del primer lado:");
		l1 = leer.nextDouble();
 
		System.out.println("Ingrese la longitud del segundo lado:");
		l2 = leer.nextDouble();
 
		System.out.println("Ingrese la longitud del tercer lado:");
		l3 = leer.nextDouble();
		
		//condiciones
 
		if(l1==l2 && l1==l3){
			System.out.println("Tipo de triangulo: EQUILATERO");
			
		} else	if(l1==l2 || l1==l3 || l2==l3){
			System.out.println("Tipo de triangulo: ISOSCELES");
					  
		} else	{
			System.out.println("Tipo de triangulo: ESCALENO");
		}
					
	}
}

