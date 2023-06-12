package array_programs;

public class Model_15 {

	public static void main(String[] args) {
		int [] a = {10,25,44,32,11};
		int max =a[0],min=a[0];
		for(int i = 1; i < a.length;i++) {
				if(a[i]> max) {
					max = a[i];
				}if(a[i] < min) {
					min= a[i];
				}
				
			}
		
        int difference = max - min;
        System.out.println(difference);
	}

}
