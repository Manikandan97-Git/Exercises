package conditional_programs;

import java.util.Scanner;

public class Model_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number to find greatest num ");
		int x = scanner.nextInt();
		System.out.print("Enter the number to find greatest num ");
		int y = scanner.nextInt();
		System.out.print("Enter the number to find greatest num ");
		int z = scanner.nextInt();
		
	System.out.println();
	
		if(x > y && x > z) {
			System.out.println("X is greater than Y and Z");
		}
		if(y > x && y > z) {
			System.out.println("Y is greater than X and Z");
		}if(z > y && z > x) {
			System.out.println("Z is greater than X and Y");
		}
		
		

	}

}
