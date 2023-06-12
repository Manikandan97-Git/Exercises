package array_programs;

import java.util.Arrays;

public class Model_7 {

	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50,60,70,80};

  
			int i = 0,j = arr.length-1;
			while(i < j) {
		    int temp = arr[i];
		    arr[i] = arr[j];
		    arr[j]= temp;
            i++;
            j--;
         }
	System.out.println(Arrays.toString(arr));

	}

}
