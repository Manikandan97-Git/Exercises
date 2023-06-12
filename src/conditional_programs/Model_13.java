package conditional_programs;

import java.util.Scanner;

public class Model_13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter three numbers to find three numbers are equal or not");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		
		if(((num1==num2)&&(num1==num3)) && num2==num3) {
		    System.out.println("All numbers are equal");
		}else {
			System.out.println("All number are not equal");
		}
		
		
		
		
		

	}

}
