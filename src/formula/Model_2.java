package formula;

import java.util.Scanner;

public class Model_2 {
	public static void main (String [] args) {
		Scanner rectangle = new Scanner(System.in);
		
		System.out.println("Enter length and breadth");
		double length = rectangle.nextDouble();
		double breadh = rectangle.nextDouble();
		
		
		
		double area = length * breadh;
		System.out.println(area);
		
	}

}
