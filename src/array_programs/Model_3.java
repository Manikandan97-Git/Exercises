package array_programs;

import java.util.Scanner;

public class Model_3 {

	public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);
   System.out.print("Type the array length to store  ");
   int num = scanner.nextInt();
   System.out.println("Enter the elements only inside length ");
   float average = 0;
   int[] numb = new int[num];
     for(int i = 0; i <numb.length;i++) {
    numb[i] = scanner.nextInt();
     }
   for(int i = 0; i < num;i++) {
	   average += numb[i];
	    }
   double avg = average/num;
   System.out.println("average for int array " + avg );
	}

}
