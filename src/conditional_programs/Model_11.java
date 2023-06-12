package conditional_programs;

import java.util.Scanner;

public class Model_11 {

	public static void main(String[] args) {
 Scanner scanner = new Scanner (System.in);
 System.out.println("Enter the number to check whether it is negative, zero, or positive");
      int num = scanner.nextInt();
 
 if(num > 0) {
	 System.out.println("The number " + num + " is positive");
 } else if(num < 0) {
	 System.out.println("The number " + num + " is negative");
 } else if(num == 0) {
	 System.out.println("The number " + num );
 }
 
 
	}

}
