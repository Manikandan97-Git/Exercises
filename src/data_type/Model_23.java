package data_type;
import java.util.*;
public class Model_23 {
	public static void main (String [] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the number which is palindrom or not");
      int number = scanner.nextInt();
      int original = number;
      int reverse = 0;
      while(number != 0) {
    	  reverse = reverse*10 + number % 10;
    	  number  = number / 10;
     }
      if(original==reverse) {
    	  System.out.println(original + " is Palindrome number");
      }else {
    	  System.out.println(original +  " is not Palindrome number" );
    	  
    	  
      }
    	 
	} 
    	 
    }
