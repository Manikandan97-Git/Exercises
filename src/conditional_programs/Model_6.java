package conditional_programs;
import java.util.Scanner;
public class Model_6 {
	public static void main (String [] args) {
		
        Scanner	scanner = new Scanner(System.in);   	
		System.out.println("Enter 5 number to find sum");
		int count = 5;int sum =0;
		while(count!=0){
			
		    sum += scanner.nextInt();
			count--;
		}
		
		System.out.println("sum of 5 number is " + sum);
		float average = sum/5f;
		System.out.println("average is " + average);
	}


}
