package array_programs;

import java.util.Scanner;

public class Model_23 {
  public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  System.out.println("Enter the number to find the key element in an array");
  int a = scanner.nextInt();
  boolean b = false;
 
  int [] arr = {1,5,4,6,7,8};
  for(int i = 0; i < arr.length; i++) {
	 if(arr[i]==a) {
		 System.out.println("Key element found in this array");
		 b = true;
		 break;
	 }
  }
	if(b == false) {
		System.out.println("Key element not found");
	}
	}
	}


