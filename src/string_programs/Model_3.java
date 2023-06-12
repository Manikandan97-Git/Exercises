package string_programs;
import java.util.Scanner;
public class Model_3 {

	public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    System.out.println("Enter the name to convert uppercase");
     String name =  scanner.nextLine();
    
        String lCase = name.toUpperCase();
    System.out.println("Lowercase of name " + lCase);

	}

}



