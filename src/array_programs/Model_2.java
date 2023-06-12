package array_programs;
import java.util.Scanner;


public class Model_2 {

	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the element to find the index");
	String car = scanner.nextLine();
    String [] cars = {"Volvo","BMW","Ferrari","Ford"};
         for(int i = 0; i < cars.length;i++) {
           if(car.equalsIgnoreCase(cars[i])){
	          System.out.println(i);
           }
		
		
		
         }

	}

}
