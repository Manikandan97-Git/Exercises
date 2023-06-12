package array_programs;

public class Model_22 {

	public static void main(String[] args) {
    int [][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
    int rowLen = arr[0].length;
    int columnLen = arr.length;
    System.out.println("Before transpose");
	   for(int i = 0; i < arr.length; i++) {
		 for(int j = 0; j < arr[i].length; j++) {
			 System.out.print(  arr[i][j] + " ");
		 }
		 System.out.println();  
		 }
	   System.out.println("After transpose");
	     int [][] transpose = new int [rowLen][columnLen];
	     for(int i =0; i < rowLen ; i++) {
	    	 for(int j = 0; j < columnLen;j++) {
	    		transpose[i][j]= arr[j][i]; 
	    		System.out.print(transpose[i][j] + " "); 
	    	 }
	    	System.out.println(); 
	     }
	}

}
