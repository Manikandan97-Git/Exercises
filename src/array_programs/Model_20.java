package array_programs;

import java.util.Arrays;
import java.util.Comparator;
public class Model_20 {

	public static void main(String[] args) {
		int arr[] = {11,10,22,32,8};
		for(int i = 0; i < arr.length; i++) {
		  for(int j = i+1; j < arr.length; j++) {
			  if(arr[i]< arr[j]) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;  
			  }  
		  }
		  
		
	
		}
		
		System.out.println("Descending order : " + Arrays.toString(arr));
		
	}

}