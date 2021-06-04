package com.yadii.school;

import java.util.Scanner;

public class logitudes {

	
	public static void main(String[] args) {
		Scanner informacion = new Scanner(System.in);
		
		System.out.println("Ingrese un numero que represente una longitud en metros para convertirla otros medidas de longitud");
		
		double metros= informacion.nextDouble();
		
		
		double centimetros = calculoCentimetros(metros);
		double milimetros = calculoMilimetros(metros);
		double pies = calculoPies(metros);
		double yardas = calculoYardas(metros);
		double pulgadas = calculoPulgadas(metros);
		double anosLuz = calculoAnosLuz(metros);
		double angstroms = calculoAngstroms(metros);
								
	
	    System.out.println("Equivale a: " + centimetros + " Centimetros" );
		System.out.println("Equivale a: " + milimetros + " Milimetros");
		System.out.println("Equivale a: " + pies + " Pies");
		System.out.println("Equivale a: " + yardas + " Yardas");
		System.out.println("Equivale a: " + pulgadas + " Pulgadas");
		System.out.println("Equivale a: " + anosLuz + " Anos Luz");
		System.out.println("Equivale a: " + angstroms + " Angstroms");

	}
	
	static double calculoCentimetros(double metros) {
		double centimetros = metros * 100;
		return centimetros;
	}
	
	static double calculoMilimetros(double metros) {
		double milimetros = metros * 1000;
		return milimetros;
	}
	
	static double calculoPies(double metros) {
		double pies = metros * 3.28;
		return pies;
	}

	static double calculoYardas(double metros) {
		double yardas = metros * 1.09;
		return yardas;
	}

	static double calculoPulgadas(double metros) {
		double pulgadas = metros * 39.37;
		return pulgadas;
	}

	static double calculoAnosLuz(double metros) {
		double anosLuz = metros / 9.461E15;
		return anosLuz;
	}
	
	static double calculoAngstroms(double metros) {
		double angstroms = metros * 1E10;
		return angstroms;
	}



}
