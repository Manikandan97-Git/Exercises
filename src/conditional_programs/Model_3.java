package conditional_programs;
import java.util.Scanner;
public class Model_3 {

	public static void main(String[] args) {
	Scanner scanner = new Scanner (System.in);
	System.out.println("Enter the numer to find positive or negative");
	int number = scanner.nextInt();
	  if(number>0) {
		  System.out.println(number +" is positive");
	  }if(number<0) {
		  System.out.println(number +" is negative");
	  }
		
	}

}
