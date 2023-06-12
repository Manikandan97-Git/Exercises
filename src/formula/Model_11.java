package formula;
import java.util.Scanner;
public class Model_11 {
	public static void main (String [] args) {
	Scanner cone = new Scanner(System.in);
	System.out.println("Enter the Radius and Height");
		float radius = cone .nextFloat();
		float height = cone.nextFloat();
		 
		double volume = Math.PI * radius * radius* (height/3);
		
		System.out.println("Volume of cone is : " + volume);
		
	}
	
	
	

}
