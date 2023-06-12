package formula;

import java.util.Scanner;

public class Model_22 {
  public static void main(String [] args) {
	  
	  Scanner scanner = new Scanner(System.in); 
	  System.out.println("Enter the total innings");
	  int innings = scanner.nextInt();
	  int [] virat = new int  [innings];
	   float totalScore = 0; float average = 0;
	     for(int i = 0; i < virat.length; i++) {
	    	 System.out.println("Type the score he got every innings");
	    	 virat[i] = scanner.nextInt();
	     }
	      for(int score : virat) {
	    	  totalScore += score;
	    	}
	      System.out.println();
	      average = totalScore/innings;
	      System.out.println(average);
	      
	  //Another method for find average
            /*int [] virat = {45,53,43,120,0,28,56,78,90,101};
	  float average =0; float king= 0;
	  for(int i = 0; i < virat.length; i++) { 
		  king += virat[i];
		  
  }
	      average = king /virat.length;
	      System.out.println(average)*/

	      
	      
	      
	      
	  
	  
  }

}
