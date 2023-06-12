package loop_programs;

import java.util.Scanner;

public class Model_7 {

	public static void main(String[] args) {
	Scanner scanner = new Scanner (System.in);
	String con = "y";
	
	int count = 0;
	char cont;
	do {
	System.out.print("Enter the number to find prime num or not: ");
	int num	= scanner.nextInt();
	if(num>1) {
		for(int i = 1; i <= num; i++) {
		  if(num%i == 0) 
			  count++;
		  }if(count==2) {
			  System.out.print(num +" is a prime number");
		  }else {
			  System.out.print(num + " is not a prime number");
		  }
		
	}else {
		System.out.println("Type above 1");
	}System.out.println();
	System.out.println("Enter y/Y to continue");
	con = scanner.next();
	}while(con.equalsIgnoreCase("y"));
	 scanner.close();
	System.out.println();
	}
}
