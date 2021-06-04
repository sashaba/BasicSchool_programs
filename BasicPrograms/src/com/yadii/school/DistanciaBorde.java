package com.yadii.school;

import java.util.Scanner;

public class DistanciaBorde {
	

	 public static void main(String[] args) {
		   
		    System.out.println("DISTANCIA AL BORDE DEL RECTANGULO ");
		
			
		    System.out.println("  ");
			
			Scanner escaner = new Scanner(System.in);  

		    float A = 0;
		    float B = 0;
		    float x = 0;
		    float y = 0;
		    float xMenor;
		    float yMenor;  

		    System.out.print("Ingrese el Ancho (A): ");
		    A = escaner.nextFloat(); 
		    
		    //condiciones
		    
		    while(A < 0){  
		        System.out.println("Tiene que ser mayor que 0"); 
		        System.out.print("Ingrese nuevamente el Ancho (A): ");
		        A = escaner.nextFloat(); 
		    }

		    System.out.print("\nIngrese el Alto (B): ");
		    B = escaner.nextFloat();
		    while(B < 0){  
		        System.out.println("Tiene que ser mayor que 0"); 
		        System.out.print("Ingrese nuevamente el Alto (B): ");
		        B = escaner.nextFloat(); 
		    } 

		    System.out.print("\nIngrese la coordenada X: ");
		    x = escaner.nextFloat();
		    while((x <= 0) || (x > A)){  
		        System.out.println("Tiene que ser mayor que 0 y menor que "+A); 
		        System.out.print("Ingrese nuevamente la coordenada X: ");
		        x = escaner.nextFloat(); 
		    } 
		    
		    System.out.print("\nIngrese la coordenada Y: ");
		    y = escaner.nextFloat();
		    while((y <= 0) || (y > B)){  
		        System.out.println("Tiene que ser mayor que 0 y menor que "+B); 
		        System.out.print("Ingrese nuevamente la coordenada Y: ");
		        y = escaner.nextFloat(); 
		    } 
		     
		    
		    
		    if((A-x) < (x)){
		        xMenor = A-x;
		    }else{
		        xMenor = x;
		    }
		    if((B-y) < (y)){
		        yMenor = B-y;
		    }else{
		        yMenor = y;
		    }
		    
		    if(xMenor < yMenor){
		        System.out.println("\nCaja: "+A+"x"+B+" | posicion: ("+x+","+y+")");
		        System.out.println("Menor distancia para limite de rectangulo: "+xMenor+" en X");
		    }else{
		        System.out.println("\nCaja: "+A+"x"+B+" | posicion: ("+x+","+y+")");
		        System.out.println("Menor distancia para limite de rectangulo:  "+yMenor+" en Y");
		    } 
		}
		}

