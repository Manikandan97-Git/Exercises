package conditional_programs;

import java.util.Scanner;

public class Model_14 {
	public static void main (String [] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Type three numbers to find the number is increasing or decreasing");	
			int num1 = scanner.nextInt();
			int num2 = scanner.nextInt();
		    int num3 = scanner.nextInt();
			
		if(num1<num2 && num2<num3) {
		   System.out.println("Numbers are increasing");
		}else if(num1>num2 && num2>num3) {
			System.out.println("Numbers are decreasing");
		}else {
			System.out.println("Numbers are neither increasing nor decreasing");
		}
		
		
	}

}
