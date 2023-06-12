package conditional_programs;
import java.util.Scanner;
public class Model_16 {
 public static void main(String[] args) {
	Scanner scanner = new Scanner (System.in);
	  System.out.println("Type two number for calculation ");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter the operator  + - * /  for calculation ");
		String operator = scanner.nextLine();
		
		
		switch(operator) {
		case "+":
			System.out.print("The result of adding two number is : " + (num1 + num2));
			break;
		case "-":
			System.out.print("Subtracting two number result is " + (num1 - num2));
			break;
		case "*":
			System.out.print("The result of multiplying two number is : " + num1 * num2);
			break;
		case "/":
			System.out.print("The result of division of two number is : " +num1 / num2);
			break;
			default:
				System.out.println("You're type a wrong operator");
		}
		

	}

}
