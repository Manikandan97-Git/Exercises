package data_type;

import java.util.Scanner;

public class Model_8 {
	public static void main (String [] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter the binary number to find decimal");
		
		String binary = scanner.nextLine();
		int decimal = Integer.parseInt(binary,2);
  System.out.println(decimal);
}
}