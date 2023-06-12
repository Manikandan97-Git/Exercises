package data_type;
import java.util.*;

public class Model_18 {
	public static void main (String [] args) {
		
	Scanner scanner = new Scanner (System.in);
	System.out.println("Enter the number of Seconds");
         int sec = scanner.nextInt();
         
         int hour = sec / 3600;
         int minute = sec % 3600 / 60;
         int seconds = sec % 60;
         
         
         
         System.out.println( hour + " hour(s) " +  minute +" minute (s) "+ seconds  + " Second(s) "   );
		
		
		
		
		
	}
	
	
	
	
	
	
	
	

}
