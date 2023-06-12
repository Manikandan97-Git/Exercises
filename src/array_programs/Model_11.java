package array_programs;

public class Model_11 {

	public static void main(String[] args) {
       int[][] a = {{5,1,2,3},{4,5,6,7},{1,2,3,5}};
	   int[][] b = {{4,5,2,1},{4,1,2,4},{2,3,4,1}};
	   int[][] sum = new int [3][4];
	   
	   for(int i = 0; i < a.length;i++) {
	   for(int j = 0; j < a[i].length;j++) {
	   sum[i][j]= a[i][j] + b[i][j];
	   }
	   }
	   System.out.println("Sum of the matrix is");
	   for(int i = 0; i < a.length;i++) {
	   for(int j = 0; j < a[i].length;j++) {
		System.out.print(sum[i][j] + " ");
	   }
	   System.out.println();
	   }
	   

	}

}
