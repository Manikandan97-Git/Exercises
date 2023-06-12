package data_type;

public class Model_21 {
	public static void main (String [] args) {
	  int [] oddEven = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18};
	  int countOdd =0;  int countEven=0;
	  for(int i =0; i < oddEven.length; i++) {
		 
		  if(oddEven[i]%2==0) { 
			  countEven++;
			 
		  } 
		  
		  else {
			  countOdd++;
		  }
	  }
		 
	  System.out.println("Number of Even numbers in oddEven Array : " + countEven);
	  
	  System.out.println("Number of  Odd numbers in oddEven Array : " + countOdd);
	  
	  
	  } 

  }
