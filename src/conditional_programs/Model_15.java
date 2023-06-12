package conditional_programs;

import java.util.Scanner;

public class Model_15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter the marks to find grade");
		System.out.print("Enter the Tamil Marks : ");
		int tamil = scanner.nextInt();
		System.out.print("Enter the english Marks : ");
		int english = scanner.nextInt();
		System.out.print("Enter the maths Marks : ");
		int maths = scanner.nextInt();
		System.out.print("Enter the science Marks : ");
		int science= scanner.nextInt();
		System.out.print("Enter the social Marks : ");
		int social= scanner.nextInt();	
			
			 int average = (tamil + english + maths + science + social)/5;
		 if(average <= 100 && average >= 90) {
			 System.out.println("Got A grade");
		 } if(average <= 89 && average >= 80) {
			 System.out.println("Got B grade");
		 } if(average <= 79 && average >= 70) {
			 System.out.println("Got C grade");
		 } if(average <= 69 && average >= 60) {
			 System.out.println("Got D grade");	
		 } if(average <= 59 && average >= 50) {
			 System.out.println("Got E grade");	
		 } else if(average <= 49) {
			 System.out.println("Got F grade");
			
		 }	
			
	}

}
