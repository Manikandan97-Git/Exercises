package conditional_programs;

import java.util.Scanner;

public class Model_10 {
	public static void main (String [] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter the number to display the multiplication table");
		int num = scanner.nextInt();
		for(int i = 1; i <= 20; i++ ) {
			
			System.out.println(i +"X" + num + "=" + i*num );
			
			
			
		}
		
		
	}

}
