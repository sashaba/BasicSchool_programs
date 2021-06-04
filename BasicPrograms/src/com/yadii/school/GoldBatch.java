package com.yadii.school;

import java.util.Scanner;

public class GoldBatch {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		

		
		System.out.println("Ingrese un numero PAR mayor que 2: ");
		int numb = scan.nextInt();
		
		
		// condicion exige que el numero ingresado sea PAR y mayor que 2.
		
		while(numb < 2 | numb % 2 == 1) {
			System.out.println("Error! El numero debe ser PAR y mayor que 2");
			System.out.println("Intentelo nuevamente, ingrese el numero : ");
			numb = scan.nextInt();
								
		}
		numb++;
	
		System.out.println("El numero ingresado es equivalente a la suma de los impares : ");
				
			
//     		if(numb % 2 == 0);
			
			for ( int a = 2; a < numb; ++a )
            {
               if ( ! primoN(a) ) continue;
               for ( int b = a; b < numb; ++b )
               {
                  if ( a + b == numb-1 && primoN(b) )
   //                  System.out.printf("%,d == %,d + %,d\n", numb, a, b);
                	  System.out.println("Numeros: "+ a + " + "+ b);
               }
            }
   	
	
	}	
	
	 static boolean primoN(int numb){
		 for ( int i = 2; i < numb; ++i )
	         if ( numb % i == 0 )
	            return false;
	 
	      return true;
	   }
}
	