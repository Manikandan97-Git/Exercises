package array_programs;
import java.util.Scanner;
public class Model_5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    System.out.println("Enter the array length");
		int len = scanner.nextInt();
		System.out.println("Enter the element");
		int[] arr= new int [len];
		int   max = arr[0], min = arr[0]; 
		for(int i = 0; i < arr.length; i++) {
			arr[i]= scanner.nextInt();
		}
		for(int i = 0; i < arr.length; i++) {
        if(arr[i] > max) {
			max = arr[i];
        }if(arr[i]<min) {
        	min = arr[i];
        }	
        	
        }
			
		System.out.println("Maximum number in an array is " + max);
		 System.out.println("Minimum  number in an array is " +  min);

	}

}
