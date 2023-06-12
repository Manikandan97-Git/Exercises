package array_programs;

public class Model_8 {

	public static void main(String[] args) {
		int [] a = {15,27,37,12,41,85,77,42,31};
		int [] b = {44,85,52,15,41,59,16,11,20};
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < b.length; j++) {
			if(a[i]==b[j]) {
			System.out.println("Common elements in a and b array " + a[i]);
			break;
			}
			
			}
		}

	}

}
