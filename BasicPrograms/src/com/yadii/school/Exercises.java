package com.yadii.school;
import java.util.Scanner;
public class Exercises {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);

/*	//-------------------------------------------------------
		//calculate the product of three integers
				
		int x, y, z, result;
		System.out.println("\n"+"CALCULATE PRODUCT-------------");
		System.out.print("\nEnter firts integer: ");
		x = input.nextInt();
		
		System.out.print("\nEnter second integer: ");
		y = input.nextInt();
		
		System.out.print("\nEnter third integer: ");
		z = input.nextInt();
		
		result = x * y * z;
		
		System.out.printf("\nproduct is %d%n", result);
		
	//---------------------------------------------------------					
		//get radius and calculate diameter, circuference and area.
		System.out.println("\n"+"CALCULATE DIAMETER,CIRCUNFERENCE AND AREA-------------");		
		System.out.print("\nEnter radius: ");
		int r = input.nextInt();
	
		System.out.printf("\ndiameter is:  %d%n",(2 * r));
		System.out.printf("\nCircuference is:  %f%n", (Math.PI * 2 *r));
		System.out.printf("\narea is:  %f%n", ((Math.PI) *(r*r)));

	//--------------------------------------
		//is it odd or even number?		
		System.out.println("\n"+"IS IT ODD OR EVEN-------------");
		System.out.print("\nEnter number: ");
		int o = input.nextInt();
		if (o % 2 == 0)
			System.out.println("\nThe number is even");
		else
			System.out.println("\nThe number es odd");

	//------------------------------------------
		//Are they Multiples of eachother?
		System.out.println("\n"+"ARE THEY MULTIPLES-------------");
		System.out.print("\nEnter first number: ");
		int fnum = input.nextInt();
		
		System.out.print("\nEnter second number: ");
		int snum = input.nextInt();
		
		if(fnum % snum == 0)
			System.out.println("\n"+fnum + " is Multiple of "+ snum);
		else
			System.out.println("\n"+fnum + " isn't Multiple of "+ snum);
		
	//------------------------------------------
		//character value
		System.out.println("\n"+"Character value-------------");
		System.out.printf("The character %c has the value %d%n", 'A',((int)'A'));
		System.out.printf("The character %c has the value %d%n", 'B',((int)'B'));
		System.out.printf("The character %c has the value %d%n", 'C',((int)'C'));
		System.out.printf("The character %c has the value %d%n", 'a',((int)'a'));
		System.out.printf("The character %c has the value %d%n", 'b',((int)'b'));
		System.out.printf("The character %c has the value %d%n", 'c',((int)'c'));
		System.out.printf("The character %c has the value %d%n", '0',((int)'0'));
		System.out.printf("The character %c has the value %d%n", '1',((int)'1'));
		System.out.printf("The character %c has the value %d%n", '2',((int)'2'));
		System.out.printf("The character %c has the value %d%n", '$',((int)'$'));
		System.out.printf("The character %c has the value %d%n", '*',((int)'*'));
		System.out.printf("The character %c has the value %d%n", '+',((int)'+'));
		System.out.printf("The character %c has the value %d%n", '/',((int)'/'));
		System.out.printf("The character %c has the value %d%n", ' ',((int)' '));
		*/
	//------------------------------------------------------
		//body mas index calculator
		System.out.print("\n SELECT MEASURE UNIT:"+"\n"+"Type 1 for inches/pound or"+ "\n"+"Type 2 for kilogram/meters");
		System.out.print("\nInsert unit number: ");
		int unit = input.nextInt();
		
		if (unit >=3)
			System.out.print("Please enter 1 or 2");
			
		System.out.print("\n"+"\n"+"Insert your weight: ");
		int w = input.nextInt();
		System.out.print("\nInsert your height: ");
		int h = input.nextInt();
		
		int bmi;
		if (unit == 1)
			System.out.print("Your BMI is : " + (w * 703)/(h*h)+"inch/lb");
		else if ( unit == 2)
			System.out.print("Your BMI is : " + (w * (h*h))+"kg/m");
		
		
		

		
		
		

}


    


	


		
	}

