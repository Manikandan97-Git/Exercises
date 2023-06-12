package formula;

import java.util.Scanner;
public class Model_18 {
	public static void main (String [] args) {
	Scanner factorial = new Scanner(System.in);
	System.out.println("Enter the number to find factorial");
		int x = factorial.nextInt();
		
		int fact = 1;
		while(x!=0) {
			fact = fact * x;
			x--;
		}
		System.out.println("Factorial for this number is : " + fact);
		
		
		
		
	}

}
