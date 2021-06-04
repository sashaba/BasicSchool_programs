/** this program calculate the requested percentage
 * 
 */
package com.yadii.school;

public class Percentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The 10% of 5000 is:" + percentage(5000, 10));
		System.out.println("The 150% of 5000 is:" + percentage(2000*2+1000, 100+50));
		
		double price = 5000;
		double percent = 30;
		
		System.out.println("The 30% of 5000 is:" + percentage(price, percent));

	}

	static double percentage(double money, double p) {
		return money * p/100;
	}
}
/** outputs: 
The 10% of 5000 is:500.0
The 150% of 5000 is:7500.0
The 30% of 5000 is:1500.0
**/

