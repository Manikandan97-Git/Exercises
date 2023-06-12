package loop_programs;

import java.util.Scanner;

public class Model_8 {

	public static void main(String[] args) {
	Scanner scanner = new Scanner (System.in);	
	System.out.println("Enter two number to find HCF");
	
	int a = scanner.nextInt();
	int b = scanner.nextInt();
	int c =0 ;
	
	for(int i = 1; i <= a; i++) {
	if((a%i==0) && (b%i==0)) {
		c =i;
	}
		
	}
	System.out.println("HCF for " + a + " and " + b + " is " + c);	
	
	}
}
