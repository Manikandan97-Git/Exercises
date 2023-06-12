package array_programs;

public class Model_12 {

	public static void main(String[] args) {
		int [] a= {15,48,31,22,50,66,50};
		int temp = 0;
		for(int i = 0; i < a.length; i++) {
			for(int j = i +1; j < a.length; j++) {
				if(a[i] < a[j]) {
				   temp = a[i];
				   a[i] = a[j];
				   a[j] = temp;	
				}
		
			}	
		}
		System.out.println("Second largest element is " + a[1]);
		
	}
}
		
		
		
		

	
