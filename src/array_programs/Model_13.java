package array_programs;

public class Model_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stubpackage array_programs;


		int [] a= {15,48,31,22,50,66,50};
		int temp = 0;
		for(int i = 0; i < a.length; i++) {
			for(int j = i +1; j < a.length; j++) {
				if(a[i] > a[j]) {
				   temp = a[i];
				   a[i] = a[j];
				   a[j] = temp;	
				}
		
			}	
		}
		System.out.println("Second smallest element is " + a[1]);
		
	}

	}


