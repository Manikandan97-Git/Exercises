package data_type;
import java.util.*;
public class Model_5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
	System.out.println("find out average of subjects");
		
		int tamil = scanner.nextInt();
		int english = scanner.nextInt();
		int maths = scanner.nextInt();
		int science= scanner.nextInt();
		int social= scanner.nextInt();
		int totalsubject = scanner.nextInt();
		
		
		
		
		System.out.println("Average of subject is = " + (tamil + english + maths + science + social)/ totalsubject );
		
		
		
		

	}

}
