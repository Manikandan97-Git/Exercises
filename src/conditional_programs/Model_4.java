package conditional_programs;
import java.util.*;
public class Model_4 {

	public static void main(String[] args) {
		
   Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number to find day");
	int day = scanner.nextInt();
	switch(day) {
	
	case 1:
		System.out.println("The day is Sunday");
	    break;
	case 2:
		System.out.println("The day is Monday");
	    break;
	case 3:
		System.out.println("The day is Tuesday");
	    break;
	case 4:
		System.out.println("The day is Wednesday");
	    break;
	case 5:
		System.out.println("The day is Thursday");
	    break;
	case 6:
		System.out.println("The day is Friday");
	    break;
	case 7:
		System.out.println("The day is Saturday");
	    break;
	default:
	    System.out.println("Your enter the invalid number");
	    break;
	
	}
		
		
		

	}

}
