package com.yadii.school;

import java.util.Scanner;

public class ContrasenaSegura {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		//Pedimos al usuario la contrasena.
		System.out.println("\nIngrese su Contrasena: ");
		String password = scan.nextLine();
		
		
		//Respondemos si la contrasena es segura o no
		if (SecurePassword(password))
			System.out.println(" \nSu Contrasena es segura");
		else
			System.out.println("\nSu contrasena no es segura");		
			
	}
	
	
	
	static boolean SecurePassword(String password) {
		
		int letterCount =0;
		int digitCount = 0;
		int specialCount = 0;
		
		//la contrasena no puede tener menos de 10 caracteres.
		if(password.length() < 10)
			return false;
		
		//la contrasena debe tener letras, numeros y symbolos.
		for(int i =0; i < password.length(); i++ ) {
			char a = password.charAt(i);
				
			if (isLetter(a)) letterCount++;
			else if ( isNumber(a)) digitCount++;
			else if (isSpecial(a)) specialCount++;
			else return false;	
		}
		//la contrasena debe tener al menos 1 de cada uno.
		return (letterCount >= 1 && digitCount >= 1 && specialCount >= 1);			
	}
	
	
	
	
	
	//metodo para letras	
	 static boolean isLetter(char a) {
        a = Character.toUpperCase(a);
        return (a >= 'A' && a <= 'Z');
    }


	 
	 //metodo para numeros
     static boolean isNumber(char a) {
        return (a >= '0' && a <= '9');
    }
	
     
     
    //metodo para caracteres speciales/symbolos
     static boolean isSpecial(char a) {
    	 if (String.valueOf(a).matches("[^a-zA-Z0-9\\s]")) {
    	 }
        return true;
    }



}
