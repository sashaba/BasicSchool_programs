package com.yadii.school;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrama {
	
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    
	    
	    
	    //Pedimos al usuario la primera palabrasss.
	    System.out.println("\nEs un Anagrama?");
	    System.out.println(" \nIngrese la primera palabra: ");
	    String palabraS = scan.nextLine();
		
	    //Luego la segunda palabra T.   
	    System.out.println(" \nIngrese la segunda palabra: ");
	    String palabraT = scan.nextLine();
	    

	    
	    // obtenemos resultado
			    
	    if (isAnagram(palabraS, palabraT)) {
	    	System.out.println("\n"+palabraT + " SI es Anagrama de " + palabraS);
	    	
	    } else {
	    	System.out.println("\n"+palabraT + " NO es Anagrama de " + palabraS);
	    	
	    }
	    
	}    

	    	
	static boolean isAnagram (String palabraS, String palabraT){
		
		//primero removemos todos los espacios en blanco.
		palabraS = palabraS.replaceAll("\\s", "");
	    palabraT = palabraT.replaceAll("\\s", "");
		
	    
		//Chequeamos que tengan el mismo tamano.
		if (palabraS.length() != palabraT.length())		
			return false;

		else {

			
		//convertimos ambos String a minuscula y a Char array
		
		char[] arrayS = palabraS.toLowerCase().toCharArray();
		char[] arrayT = palabraT.toLowerCase().toCharArray();

		
		//Ordenamos ambos array		
		Arrays.sort(arrayS);
		Arrays.sort(arrayT);
		
		
		//Chequeamos que ambos array sean equals.		
		return Arrays.equals(arrayS, arrayT) ;
		
			
		} 
		
	} 
	    
}

