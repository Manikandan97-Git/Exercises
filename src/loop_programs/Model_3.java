package loop_programs;
import java.util.*;
public class Model_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number to multiply");
        int multiply = scanner.nextInt();
		for(int i = 1; i <=10; i++) {
		System.out.println(i + "X" + multiply +"=" + i*multiply);	
		}
	}

}
