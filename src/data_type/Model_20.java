package data_type;

import java.util.Arrays;

public class Model_20 {
	public static void main (String [] args) {
	int [] number = {10,20,30,40,50,60,70,80};
	System.out.println("Before swap : " + Arrays.toString(number) );
	System.out.println();
	
	      int x = number[0];
	      number[0] = number[number.length-1];
	      number[number.length-1]=x;
	      
	
	  
	     
	     System.out.println("After swap : " + Arrays.toString(number) );
	     
	     
	}
}
