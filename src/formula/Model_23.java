package formula;

import java.util.Scanner;

public class Model_23 { 
	public static void main (String [] args) {
		
 	Scanner scanner = new Scanner (System.in);	
		System.out.print("Enter commission amount ");
	float comAmt = scanner.nextFloat();
	    System.out.print("Enter sales amount ");
	float saleAmt = scanner.nextFloat();
	//commission percent = (Commission percent/sale amt)*100
	            float amt = comAmt / saleAmt;
	float comPercent = amt*100;
		
		System.out.print("Commission percentage is : " + comPercent +"%" );
		
		
		
		
		
	}

}
