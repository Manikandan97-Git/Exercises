package loop_programs;
import java.util.*;
public class Model_5 {

	public static void main(String[] args) {
		System.out.print("Enter the number ");
       Scanner scanner = new Scanner(System.in);
    	  int num = scanner.nextInt();
    	   int reverse = 0;
    	     while(num != 0) {
    	      reverse = reverse * 10 + num%10;
    		  num = num/10;   
    	     } 
    	     System.out.print("Reverse number is " + reverse);
    	   }
    	   
       }
	


