package formula;


import java.util.Arrays;
import java.util.Scanner;

public class Model_16 {
	public static void main (String [] args) {
		
	Scanner scanner = new Scanner (System.in);	
		System.out.println("Enter a letter to find vowel or consonant");
		String vc = scanner.nextLine();
	
		switch(vc){
			
			case("a"):
				System.out.println(vc +"  is the vowel" );
				break;
			case("e"):
				System.out.println(vc +"  is the vowel" );
				break;
			case("i"):
				System.out.println(vc +"  is the vowel");
				break;
			case("o"):
				System.out.println(vc +"  is the vowel");
				break;
			case("u"):
				System.out.println(vc +"  is the vowel");
				break;
			default:
				System.out.println(vc +" is consonant");
				break;
		}
				
			
	
	}
}