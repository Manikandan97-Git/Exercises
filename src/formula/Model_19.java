package formula;
import  java.util.Scanner;
public class Model_19 {
	public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("If you pay for House type\"House\" or Commercial purpose type \"Commercial\"");
            String elecFor = scanner.nextLine();
            System.out.println("Enter the unit");
		    int unit = scanner.nextInt();
           while(elecFor.equalsIgnoreCase("Commercial")) {
	
			if(unit> 0) {
				System.out.println("You should pay Rs." +unit*10 + " for" + unit  );
				break;
			}
           }
			while(elecFor.equalsIgnoreCase("House")) {
				if(unit<=100) {
					System.out.println("You don't pay" );
					break;
					}if(unit<= 500) {
						System.out.println("You should pay Rs." +unit*1.5 + " for " + unit + " units"  );
						break;
			}if(unit > 501) {
				System.out.println("You should pay Rs." +unit*3.5 + " for " + unit + " units"  );
				break;
				
			
			}
}
		
}	
}		
