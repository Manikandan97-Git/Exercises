package array_programs;

import java.util.Scanner;

public class Model_14 {

	public static void main(String[] args) {
	Scanner scanner = new Scanner (System.in) ;
	System.out.println("enter the length of array");
	int length = scanner.nextInt();
	int a[] = new int [length];
	int evenCount =0,oddCount=0;
	System.out.println("Enter the element for array ");
    for(int i=0; i < a.length;i++) {
	 a[i]= scanner.nextInt();
	 }
		for(int i = 0; i < a.length;i++) {
			if(a[i]%2==0) {
	            evenCount++;
				}
			if(a[i]%2!=0) {
				oddCount++;
			}
			
		}
		System.out.print("Even number count is " + evenCount + "       ");
		
		System.out.print("Odd number count is " + oddCount + "        ");
	}
}
