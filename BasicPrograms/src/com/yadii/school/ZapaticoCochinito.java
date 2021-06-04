package com.yadii.school;

import java.util.Scanner;

public class ZapaticoCochinito {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		//Pedimos al usuario el numero de jugadores.
		System.out.print("\nCuantos jugadores tiene esta ronda? : ");
		int tamano = scan.nextInt();
		String[] array = new String[tamano];
		
		
		//Pedimos al usuario el numero K para contar.
		System.out.print("\nHasta que numero van a contar? : ");
		int k = scan.nextInt();
				
		
		//Pedimos al usuario los nombres de los jugadores.
		System.out.print("\nIngrese los " + tamano + " nombres de los jugadores, ");
		System.out.println("A quien le toque el numero "+ k + " sale del juego: ");	
		for ( int i = 0; i < tamano; i++) {
		array[i] = scan.next();
		}

		
		//para seguir contando en forma circular hasta llegar al numero elegido.
		int j = k % tamano;

		
		//Instrucciones para elegir y respuesta		
		if (k < tamano)
			
			System.out.print("\nSale : " + array[k]);
		
		else 
			
			System.out.println("\nSale : " +array[j]);
				
		
	}
}