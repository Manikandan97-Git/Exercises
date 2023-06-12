package formula;

import java.util.Scanner;

public class Model_25 {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Type the number ");
		short number = scanner.nextShort();
		System.out.print("Type the power of number");
		short powerN = scanner.nextShort();
		
		double powOfNum = Math.pow(number,powerN);
		System.out.print(powOfNum);
		  //Another method without Math.pow
		/*int num = 8;
		   
		    int exponentorpower = 2;
		    int power = 1;
		     while(exponenetorpower != 0){
		     
		     power = power* num;
		       exponentorpower--;
		    
		    }
		    system.out.println(power);
		    
		    
		    
		    
		    
		    
		   
		    
		    */
		
		
		
		
		
		
	}

}
