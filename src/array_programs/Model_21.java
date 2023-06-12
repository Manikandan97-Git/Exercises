package array_programs;

import java.util.Arrays;
import java.util.Scanner;

public class Model_21 {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the length of a string");
	int len = scanner.nextInt();
	String [] names = new String[len];
    System.out.println("Enter the names");
	for(int i = 0; i < len; i++) {
		names[i] = scanner.next();// in dynamic method can't use scanner.nextline in for loop
	}
		Arrays.sort(names);
    System.out.println(Arrays.toString(names));
    }
	}


