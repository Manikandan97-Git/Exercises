package loop_programs;
import java.util.Scanner;
public class Model_6 {
  public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter the length of an array ");
	int len = scanner.nextInt();
	int sumofEven=0,sumofOdd =0;
	System.out.println("Enter the element to find sum of even and odd");
	int [] arr = new int [len];
	for(int i = 0; i < arr.length; i++) {
	arr[i] = scanner.nextInt();
	if(arr[i]%2==0) {
	sumofEven += arr[i];	
	}else if(arr[i]%2 != 0) {
		sumofOdd += arr[i];
	}
	}
	System.out.println();
	System.out.println("sum of Even numbers " + sumofEven);
	System.out.println("Sum of Odd numbers " + sumofOdd);
	}

}
