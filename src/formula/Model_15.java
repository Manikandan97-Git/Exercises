package formula;

import java.util.Scanner;

public class Model_15 {
	public static void main (String [] args) {
	Scanner average = new Scanner (System.in);
	
	System.out.println ("Enter the  tamil marks");
	byte tamil = average.nextByte();
	System.out.println ("Enter the  english marks");
	byte english = average.nextByte();
	System.out.println ("Enter the  maths marks");
	byte maths = average.nextByte();
	System.out.println ("Enter the  science marks");
	byte science = average.nextByte();
	System.out.println ("Enter the  social marks");
	byte social = average.nextByte();
	System.out.println ("Enter the  total subject ");
	byte totalSubject = average.nextByte();
	
	int avrg = (tamil + english + maths + science + social)/totalSubject;
	System.out.println("Average of marks is : " + avrg);
		
		
		
		
	}
	

}
