package data_type;

import java.util.Scanner;

public class Model_19 {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
	      
	       for(int x = 2; x <= number; x++) {
	    	   int count = 0;
	    	   for(int y = 2;y < x; y++) {
	    		   if(x%y==0) {
	    			count++;   
	    		   }
	    	   }
	    	if(count==0 ) {
	    		
	    		System.out.print(x + " ");
	    	   
	    			   
	    			   
	    		   }
	    	
	    	
	    		   
	    	   }
	       }
	       
	       
	       
		
	}


