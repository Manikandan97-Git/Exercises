package formula;
import java.util.Scanner;
public class Model_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner cuboid = new Scanner (System.in);
   System.out.println("Enter the Length width height");
		 float length = cuboid.nextFloat();
		 float width = cuboid.nextFloat();
		 float height = cuboid.nextFloat();
		 
		 float surfaceArea = 2*((length * width) + (length * height)+(width * height));
			
		System.out.println(" Surface area of cuboid is : " + surfaceArea + " cm\u00B2");
		
		
	}

}
