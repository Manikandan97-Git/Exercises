package loop_programs;
import java.util.*;
public class Model_4 {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the number to find factorial");
    int fact = scanner.nextInt();
    int factorial =1;
    for(int i = 1; fact >= i; i++) {
    	
    	factorial *= i;
    	
    }
  System.out.println(factorial);
	}

}
