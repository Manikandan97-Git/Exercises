package array_programs;

import java.util.Arrays;

public class Model_16 {

	public static void main(String[] args) {
	 int [] a = {0,1,1,0,1,1,1,0,0,0};
	 int j =0; 
		for(int i = 0; i < a.length;i++) {
			if(a[i]==0) {
				a[j++]=a[i];
			}
		}
			while(j < a.length) {
				a[j++]=1;
				}
			
		System.out.println(Arrays.toString(a));
	}

}
