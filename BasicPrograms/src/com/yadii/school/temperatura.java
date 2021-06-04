package com.yadii.school;

import java.util.Scanner;

public class temperatura {
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        

        System.out.println("Ingrese un numero equivalente a una temperatura de grados centígrados y luego presione Enter.");
        
        double centigrados = in.nextDouble();
        
        double fahrenheit = calculateF(centigrados);
        double kelvin = calculateK(centigrados);
        double rankine = calculateR(centigrados);
        
        System.out.println("Equivale a: " + fahrenheit + " °Fahrenheit");
        System.out.println("Equivale a: " + kelvin + " °Kelvin");
        System.out.println("Equivale a: " + rankine + " °Rankine");
        
        
    }
    
    static double calculateF(double centigrados){
    double fahrenheit = (centigrados * 9/5) + 32;
    return fahrenheit;
    }
    
    static double calculateK(double centigrados){
    double kelvin = centigrados + 273.15;
    return kelvin;
    }
    
    static double calculateR(double centigrados){
    double rankine = (centigrados * 9/5) + 491.67;
    return rankine;

    }

}
