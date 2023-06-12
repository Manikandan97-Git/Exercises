package array_programs;

import java.util.Arrays;

public class Model_18 {

	public static void main(String[] args) {
		 int [] arr = {1,2,3,2,1,3,4,5};
	       Arrays.sort(arr);
	    for(int i = 0; i < arr.length-1; i++) {
	    	if(arr[i]!= arr[i+1]) 
	    		System.out.println(arr[i]);
	    	}
		 System.out.println(arr[arr.length-1]);

	}

}
