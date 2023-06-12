package array_programs;
import java.util.*;
public class Model_19 {
  public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);
   System.out.println("Enter the length of an array ");
   int len = scanner.nextInt();
	int [] arr = new int[len];   
	   System.out.println("Enter the number for ascending ");
	   for(int i = 0 ; i < len;i++) {
	   arr[i] = scanner.nextInt();
	   }
	   
	   Arrays.sort(arr);
       System.out.println( "Ascending of array is : " + Arrays.toString(arr));
    /*   int arr[] = {11,10,22,32,8};
		for(int i = 0; i < arr.length; i++) {
		  for(int j = i+1; j < arr.length; j++) {
			  if(arr[i]< arr[j]) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;  
			  }  
		  }
	
		}
		
		System.out.println("Ascending order : " + Arrays.toString(arr));*/
	}

}
