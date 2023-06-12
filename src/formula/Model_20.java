package formula;

import java.util.Scanner;

public class Model_20 {
	public static void main (String [] args) {
		float totalGrade=9.5f;
		int subCount=0;
		float cgpaPercent=0;
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter the tamil grade points");
			float tamil = scanner.nextFloat(); 
		
			if(tamil<= totalGrade) {
				cgpaPercent = tamil* totalGrade;
				subCount++;
				System.out.println("Your CGPA percentage for Tamil is : " + cgpaPercent);
			}
			System.out.println("Enter the english grade points");
			float english = scanner.nextFloat();
			if(english<= totalGrade) {
				cgpaPercent = english* totalGrade;
				subCount++;
				System.out.println("Your CGPA percentage for English is : " + cgpaPercent);
			}
			System.out.println("Enter the poetry grade points");
			float poetry = scanner.nextFloat();
			if(poetry<= totalGrade) {
				cgpaPercent = poetry* totalGrade;
				subCount++;
				System.out.println("Your CGPA percentage for Poetry is : " + cgpaPercent);
			}
			System.out.println("Enter the fiction grade points");
			float fiction = scanner.nextFloat();
			if(fiction<= totalGrade) {
				cgpaPercent = fiction* totalGrade;
				subCount++;
				System.out.println("Your CGPA percentage for Fiction is : " + cgpaPercent);
			}
			System.out.println("Enter the novel grade points");
			float novel = scanner.nextFloat();
			if(novel<= totalGrade) {
				cgpaPercent = novel* totalGrade;
				subCount++;
				System.out.println("Your CGPA percentage for Novel is : " + cgpaPercent);
			}
			
			float CGPA =  (tamil + english + poetry + fiction + novel)/subCount;
			float overallCGPA = CGPA*totalGrade;
			System.out.println();
			System.out.println(" Your overall CGPA percentage is : " + overallCGPA);
			
		}
		
	}


