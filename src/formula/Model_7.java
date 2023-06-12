package formula;
import java.util.Scanner;
public class Model_7 {
  public static void main (String [] args) {
	  Scanner prism = new Scanner (System.in);
	  System.out.println("Enter the length width height ");
	    float length = prism.nextFloat();
	    float width = prism.nextFloat();
	    float height = prism.nextFloat();
	    
	    float rectPrismArea = 2*(length*width)+2*(length+width)*height;
	  
	  
	  System.out.println("Rectangular Prism surface area is " + rectPrismArea + "m\u00B2");
	  		
	  
	  
	  
	  
  }
}
