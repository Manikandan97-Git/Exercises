package formula;

import java.util.Scanner;

public class Model_24 {

	public static void main(String[] args) {
	Scanner	scanner  = new Scanner(System.in);
		
		System.out.print("Enter x1 ");
		float x1 = scanner.nextFloat();
		System.out.print("Enter x2 ");
		float x2 = scanner.nextFloat();
		System.out.print("Enter y1 ");
		float y1 = scanner.nextFloat();
		System.out.print("Enter y2 ");
		float y2 = scanner.nextFloat();
		 // Distance between two points formula
		//   d = Math.sqrt(Math.pow(x2-x1,2)+ Math.pow(y2-y1,2))
		
		double distance = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1,2));
		System.out.println(distance);
		
		

	}

}
