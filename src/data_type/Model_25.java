package data_type;

import java.util.Scanner;

public class Model_25 {
	public static void main (String [] args) {
		
		  Scanner input = new Scanner(System.in);
	        System.out.print("Enter a positive integer: ");
	        int number = input.nextInt();

	        int sum = 0;
	        while (number != 0) {
	            sum =sum + number % 10;
	            number = number/10;
	        }

	        System.out.println("The sum of the digits is: " + sum);
	   }
	
		
		
		
		
		
	}


