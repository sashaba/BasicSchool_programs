package com.yadii.school;

import java.util.Arrays;

public class Sugerencias {

	public static void main(String[] args) {
		
		//Declaramos variables		
		String conditionD = "P∨(∀_(x )|:¬R)";
		String conditionG = "(∀_(x ) |R:P)";
		String j = "{PRODUCTO-J} ";		
		int[] r = new int[] {1,2,3,4,5};
		
					
		// obtenemos resultado	    
	    if (verificationG(conditionD, conditionG)) {
	    	System.out.println("\nCreemos que este producto podria interesarte:");
	    	System.out.println("\n" + j);
	    	
	    	
	    } else {
	    	
	    	System.out.println("\n Estos son los productos que ofrecemos ");
	    	for(int i = 0;i <= r.length-1;i++) {
				System.out.print("\n* Producto " + (i + 1) + " = { producto }");
	    	}
	    }
		
	}
	
	static boolean verificationG (String conditionD, String conditionG ) {
		
		//primero removemos todos los espacios en blanco.
		conditionD = conditionD.replaceAll("\\s", "");
		conditionG = conditionG.replaceAll("\\s", "");
		
		//convertimos ambos String a minuscula y a Char array
		char[] arrayD = conditionD.toCharArray();
		char[] arrayG = conditionG.toCharArray();

		//Ordenamos ambos array		
		Arrays.sort(arrayD);
		Arrays.sort(arrayG);

				
		//Chequeamos length.
		if (conditionD.length() >= conditionG.length())		
			conditionD = conditionG;

		else {
					
			for (int i = 0; i <= conditionD.length(); i++)
			{
				for (int b = 0; b<= conditionG.length();)
				{
					if(conditionD != conditionG );	
					{
					return false;
					
					
					}
				}
			}
							
			//Chequeamos la equivalencia.		
			return Arrays.equals(arrayD, arrayG) ;
			
			    				    
		}
		return true;
	}
}
