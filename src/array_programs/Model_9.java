package array_programs;

public class Model_9 {

	public static void main(String[] args) {
	   int [] a = {10,20,30,30,40,50,60,50};
	   int dup =0;
	   for(int i = 0; i < a.length; i++) {
		   for(int j=1+i; j < a.length; j++)
		  if((a[i]==a[j])&& (i != j)) { 
		   System.out.println("Duplicate element " + a[i]);
		   
		    }
	   
	   
	   }

	}

}
