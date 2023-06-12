package formula;
import java.util.Scanner;
public class Model_13 {
	public static void main (String [] args) {
		Scanner cylinder = new Scanner (System.in);
		System.out.println("Enter the radius and height");
		
		float radius = cylinder.nextFloat();
		float height = cylinder.nextFloat();
		  
		
		double surfaceArea = 2 * Math.PI * radius * height + 2 * Math.PI *radius * radius;
		System.out.println("Surface area of cylinder is : " + surfaceArea);
		
		
		
		
		
	}

}
