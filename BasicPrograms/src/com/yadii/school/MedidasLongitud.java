package com.yadii.school;

import java.util.Scanner;

public class MedidasLongitud {

   public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
    
       System.out.println("Ingrese un numero equivalente a una medidad en metros, y luego presione Enter.");
		
	double metros = in.nextDouble();
		
	double centimetros = calculateCentimetros(metros);
	double milimetros= calculateMilimetros(metros);
	double pies = calculatePies(metros);
	double pulgadas = calculatePulgadas(metros);
	double yardas = calculateYardas(metros);
	double anosLuz = calculateAnosLuz(metros);
	double angstroms =  calculateAngstroms(metros);

		
	System.out.println("Equivale a: " + centimetros + "Centimetros");	
	System.out.println("Equivale a: " + milimetros + "Milimetros");
	System.out.println("Equivale a " + pies + " pies");
	System.out.println("Equivale a: " + pulgadas + " Pulgadas");
	System.out.println("Equivale a: " + yardas + " Yardas");
	System.out.println("Equivale a: " + anosLuz + " Anos Luz");
	System.out.println("Equivale a: " + angstroms + " Angstroms");	
	
  }


  static double calculateCentimetros(double metros) {
		double centimetros = metros * 100;
		return centimetros;
	}
	
  static double calculateMilimetros(double metros) {
		double milimetros = metros * 1000;
		return milimetros;
	}

  static double calculatePies(double metros) {
		double pies = metros * 3.28;
		return pies;
	}


  static double calculatePulgadas(double metros) {
		double pulgadas = metros * 39.37;
		return pulgadas;
	}
	
  static double calculateYardas(double metros) {
		double yardas = metros * 1.09;
		return yardas;
	}
	
  static double calculateAnosLuz(double metros) {
		double anosLuz = metros / 9.461E15;
		return anosLuz;
	}


  static double calculateAngstroms(double metros) {
		double angstroms = metros * 1E10;
		return angstroms;
	}

}

