

package com.yadii.school;

  /*                              //punto A)

public class HorasSegundos {
	
	   public static void main(String[] args) {

		int horaActual = 21;
		int minutosActuales = 46;
		int segundosActuales =26;
			

	      int segTranscurridos = (horaActual * 3600)+(minutosActuales * 60) + segundosActuales;
	      
		System.out.println("Metodo para calcular los segundos transcurridos desde la media noche hasta ahora");	
		System.out.println("Segundos Transcurridos : " + segTranscurridos);
			
		}
		
	}*/





                                    //Punto B)
 
	import java.util.Scanner;

	public class HorasSegundos {
		
			
	    public static void main(String[] args) {
	    	
	       Scanner in = new Scanner(System.in);

	       
	       System.out.println(" Ingrese un numero para la Hora en formato 24h: ");
		   int horaActual = in.nextInt();
		   
		   System.out.println(" Ingrese los minutos: ");
		   int minutosActuales = in.nextInt();
				
		   System.out.println(" Ingrese los segundos: ");
		   int segundosActuales = in.nextInt();
		   
		   int segTranscurridos =(horaActual * 3600)+(minutosActuales * 60)+ segundosActuales;
		   
		   System.out.println("Segundos Transcurridos desde la media noche hasta hora: " + segTranscurridos);
		}
		
		
	}


	      
	
			
		
			
			
		