package array_programs;
import java.util.Arrays;
import java.util.Scanner;
public class Model_24 {
  public static void main(String[] args) {
	Scanner scanner = new Scanner (System.in);
	System.out.print("Enter the length of an array to store marks: ");
	int len = scanner.nextInt();
	float totalmarks = 0; float percentage = 0f;
	System.out.println("Enter the marks based on the length: ");
	int [] arr = new int [len];
	for(int i = 0; i < arr.length; i++) {
		arr[i] = scanner.nextInt();
		totalmarks += arr[i];
	}
     percentage = totalmarks/len;
	System.out.print("Total marks is: " + totalmarks);
	System.out.println();
    System.out.print("Percentage is: " + percentage);
	}

}
