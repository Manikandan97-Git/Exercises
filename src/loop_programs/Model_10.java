package loop_programs;
import java.util.Scanner;
public class Model_10 {
  public static void main(String[] args) {
  Scanner scanner = new Scanner (System.in);
  System.out.println("Enter numbers to find largest and smallest");
  System.out.println("If you want to exit type 0");
  int largest= 1,smallest =1;
  boolean cont = true;
  while(cont) {
	 int num = scanner.nextInt();
	 if(num==0) { 
		 cont = false;
	 } else if(largest < num) {
        largest = num;
  }else if(smallest > num) {
	  smallest = num;
  }
  }System.out.println("Largest number "+ largest);
  System.out.println("Smallest number "+ smallest);
  }
}

