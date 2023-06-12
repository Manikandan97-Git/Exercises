package string_programs;

import java.util.Scanner;

public class Model_2 {

	public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    System.out.println("Enter the name to convert lowercase");
     String name =  scanner.nextLine();
    
        String lCase = name.toLowerCase();
    System.out.println("Lowercase of name " + lCase);

	}

}
