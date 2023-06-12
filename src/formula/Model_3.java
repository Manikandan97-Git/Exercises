package formula;
import java.util.Scanner;
public class Model_3 {
	public static void main (String [] args) {
		Scanner triangle = new Scanner(System.in);
		System.out.println("Enter breadth and height");
		   
		double breadth = triangle.nextDouble();
		double height = triangle.nextDouble();
		
		double area = Math.pow(2, -1)*breadth*height;// 2 power -1 means 1/2  or 0.5
		System.out.println("Area of triangle : " + area);
		
		
		
		
		
		
		
		
	}

}
