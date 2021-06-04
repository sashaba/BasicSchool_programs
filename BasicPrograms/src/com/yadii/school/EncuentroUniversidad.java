package com.yadii.school;

import java.util.Scanner;

public class EncuentroUniversidad {
	
	 public static void main(String[] args) {
		 
		   Scanner scan = new Scanner(System.in);
		   
		   int anaD, bernardD, carlD, numbMax, i;
		   
		   System.out.println(" ENCUENTRO EN LA UNIVERSIDAD ");
		   System.out.println("\nIngrese cada cuantos dias va Ana: ");
		   anaD = scan.nextInt();
		   
		   System.out.println("Ingrese cada cuantos dias va Bernardo: ");
		   bernardD = scan.nextInt();
		   
		   System.out.println("Ingrese cada cuantos dias va Carlos: ");
		   carlD = scan.nextInt();
		   
		   numbMax = anaD;
		   

		         if ( bernardD > numbMax )
		             numbMax = bernardD;
		  
		         if ( carlD > numbMax )
		             numbMax = carlD;
		            
		         i = numbMax;
		               
		               
		         while ((i % anaD != 0) || (i % bernardD != 0) || (i % carlD != 0))
		             i++;
		  
		         System.out.println("Se encontraran de nuevo en: " + i + " dias."  );

		 }

		}

