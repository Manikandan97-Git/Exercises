package data_type;
import java.util.*;
public class Model_7 {
	public static void main (String [] args) {
		
	Scanner scanner = new Scanner(System.in);	
	System.out.println("Enter the decimal number to change binary");	
	int decimal = scanner.nextInt();	
	/*String binary = Integer.toBinaryString(decimal);
	
	System.out.println("Binary number of " + decimal + " is " + binary );*/

	 String binary ="";
	 int rem;
	 while(decimal > 0) {
		 rem = decimal%2;
		 binary = rem + binary;
		 decimal = decimal /2;
	 }
	System.out.println(binary);
	}

}
