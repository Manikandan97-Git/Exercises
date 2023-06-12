package loop_programs;
import java.util.Scanner;
public class Model_9{
	public static void main (String [] args) {
	Scanner scanner = new Scanner(System.in);
	int positive = 0,negative = 0, zeros = 0;
	boolean cont = true;
	System.out.println("Type any numbers ");
	System.out.println("If you want to exit type 0");
	while(cont) {
		int num = scanner.nextInt();
		if(num==0) {
			cont=false;
		} if(num > 0) {
			positive++;
		}if(num<0) {
			negative++;
		}if(num==0)
		 zeros++;
	}
		
	System.out.println("Positive numbers " + positive);	
	System.out.println("Negative numbers " + negative);	
	System.out.println("Zeros " + zeros);	
		
	}
}