package com.yadii.school;

import java.util.Scanner;

public class SecurePasswrd {

//Java code to validate a password


	// A utility function to check
	// whether a password is valid or not
	public static boolean isValid(String password)
	{

		
		// to check password length
		if (password.length() < 10){
			return false;
		}

		// to check space
		if (password.contains(" ")) {
			return false;
		}
		if (true) {
			int count = 0;

			// check digits numbers from 0 to 9
			for (int i = 0; i <= 9; i++) {

				// to convert int to string
				String str1 = Integer.toString(i);

				if (password.contains(str1)) {
					count = 1;
				}
			}
			if (count == 0) {
				return false;
			}
		}

		// for special characters
		if (!(password.contains("@") || password.contains("#")
			|| password.contains("!") || password.contains("~")
			|| password.contains("$") || password.contains("%")
			|| password.contains("^") || password.contains("&")
			|| password.contains("*") || password.contains("(")
			|| password.contains(")") || password.contains("-")
			|| password.contains("+") || password.contains("/")
			|| password.contains(":") || password.contains(".")
			|| password.contains(", ") || password.contains("<")
			|| password.contains(">") || password.contains("?")
			|| password.contains("|"))) {
			return false;
		}

		if (true) {
			int count = 0;

			// checking capital letters(uppercase)
			for (int i = 65; i <= 90; i++) {

				// type casting
				char c = (char)i;

				String str1 = Character.toString(c);
				if (password.contains(str1)) {
					count = 1;
				}
			}
			if (count == 0) {
				return false;
			}
		}

		if (true) {
			int count = 0;

			// checking small letters(lowercase)
			for (int i = 90; i <= 122; i++) {

				// type casting
				char c = (char)i;
				String str1 = Character.toString(c);

				if (password.contains(str1)) {
					count = 1;
				}
			}
			if (count == 0) {
				return false;
			}
		}

		// if all conditions fails
		return true;
	}

	// Driver code
	public static void main(String[] args) {
		
    Scanner scan = new Scanner(System.in);
		
		
		//Pedimos al usuario la contrasena.
		System.out.println("\nIngrese su Contrasena: ");
		String password1 = scan.nextLine();


		if (isValid(password1)) {
			System.out.println("Valid Password");
		}
		else {
			System.out.println("Invalid Password!!!");
		}
	}
}

