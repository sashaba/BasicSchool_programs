package com.yadii.school;
import java.util.Scanner;

public class Palindromo {

	public static void main(String[] args) {
		    
		    Scanner scan = new Scanner(System.in);
		    
		    //Pedimos la palabra a evaluar
		    System.out.println("\nEs Palindromo?");
		    System.out.println(" \nIngrese una palabra: ");
		    String palabra = scan.nextLine();
		    
		    
		    //Printeamos respuesta.
		    
		    if (siPalindromo(palabra))
		    	
		    	System.out.print("\nLa palabra " + "\"" + palabra + "\"" + "  SI es palindromo.");
		    else
		    	System.out.print("\nLa palabra " + "\"" + palabra + "\"" + " NO es palindromo.");
		    		
		    
		    
		}

		
    static boolean siPalindromo (String palabra){
		        palabra = palabra.toLowerCase();
		        
		        for (int i=0, k = palabra.length() -1;i <= k ; i++, k--){
		            if(palabra.charAt(i) != palabra.charAt(k)){
		                return false;
		            }
		        }
		        return true;
		    }

}
