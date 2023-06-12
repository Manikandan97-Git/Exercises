package conditional_programs;

import java.util.Scanner;

public class Model_8 {
	public static void main (String [] args) {
Scanner scanner = new Scanner (System.in);
System.out.println("type a number to display the cube");
		int num = scanner.nextInt();
		double cube = Math.pow(num, 3);
		System.out.println(cube);
		
}
}