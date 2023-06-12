package formula;

import java.util.Scanner;

public class Model_21 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the principal: ");
        double principal = scanner.nextDouble();
        System.out.print("Enter the Rate of Interest: ");
        double interest = scanner.nextDouble();  // interest %100 
        System.out.print("Enter the Compound per year");
        double compoundYear = scanner.nextDouble();
	    System.out.print("Enter the Number of years: ");
	    double years = scanner.nextDouble();
      
	
	double compoundInt = principal*Math.pow(1+(interest/compoundYear),compoundYear *years);
	
	System.out.println("Compound interest is " + compoundInt);
	
	
	}

}
