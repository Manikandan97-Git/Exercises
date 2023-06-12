package conditional_programs;

import java.util.*;

public class Model_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Enter the month");
		int  month = scanner.nextInt();
		System.out.println("Enter the year");
		int year = scanner.nextInt();
	     String nameOfMonth ="";
	     
		switch(month) {
		
		case 1:
			nameOfMonth = "January";
		    System.out.println(nameOfMonth + " has 31 days " + year);
		    break;
		case 2:
			nameOfMonth = "February";
			if((year%400==0)||(year%4==0 &&year%100!=0)){
			System.out.println(nameOfMonth  + " has 29 days in " + year);
			} else {
				System.out.println(nameOfMonth  + " has 28 days in " + year);
			}
			break;
		case 3:
			nameOfMonth = "March";
		    System.out.println(nameOfMonth + " has 31 days in " + year);
		    break;
		case 4:
			nameOfMonth = "June";
		    System.out.println(nameOfMonth + " has 30 days in " + year);
		    break;
		case 5:
			nameOfMonth = "May";
		    System.out.println(nameOfMonth + " has 31 days in " + year);
		    break;
		case 6:
			nameOfMonth = "June";
		    System.out.println(nameOfMonth + " has 30 days in " + year);
		    break;
		case 7:
			nameOfMonth = "July";
		    System.out.println(nameOfMonth + " has 31 days in " + year);
		    break;
		case 8:
			nameOfMonth = "August";
		    System.out.println(nameOfMonth + " has 31 days in " + year);
		    break;
		case 9:
			nameOfMonth = "September";
		    System.out.println(nameOfMonth + " has 30 days " + year);
		    break;
		case 10:
			nameOfMonth = "October";
		    System.out.println(nameOfMonth + " has 31 days in " + year);
		    break;
		case 11:
			nameOfMonth = "November";
		    System.out.println(nameOfMonth + " has 30 days in " + year);
		    break;
		case 12:
			nameOfMonth = "December";
		    System.out.println(nameOfMonth + " has 31 days in " + year);
		    break;
		}
		}
		
		

	}


