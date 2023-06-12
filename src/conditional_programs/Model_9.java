package conditional_programs;
import java.util.*;
public class Model_9 {
  public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the number to find odd num and sum");
	int num= scanner.nextInt();
	  int sum = 0;
    for(int i = 1; i <= num;i++) {
    	if(i%2==1) {
    	 System.out.println(i);	 
    		sum = sum + i;
    		
    		
    	}
    	}
    System.out.println("Sum of the odd num is " + sum);
  }
}