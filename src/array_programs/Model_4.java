package array_programs;
import java.util.Scanner;
public class Model_4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Type the value to check that value is contain in an array");
		int input = scanner.nextInt();
		boolean bool = false;
	    int [] arr = {100,200,300,400,500};
	   
		for(int i=0; i<arr.length;i++) {
		if(arr[i]==input) {
	    System.out.println("That value is found in this array");
	    bool = true;
	    break;
	} 
	} if(bool == false) {
	      System.out.println("invalid value");
		
		  
			  
		  }
		
	}
		

	}


