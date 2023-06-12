package array_programs;

import java.util.Arrays;
import java.util.Scanner;

public class Model_6 {

	public static void main(String[] args) {
	Scanner scanner = new Scanner (System.in);
	System.out.println("Enter the specific position ");
	int index = scanner.nextInt();
	System.out.println("Enter the element");
	int ele = scanner.nextInt();
	int [] arr = {10,20,30,40,50};
	   arr[index]=ele;  

		System.out.print("Successfully insert an element in specific position of an array " + Arrays.toString(arr) + " ");
	}
		
		
		
		
		

	}


