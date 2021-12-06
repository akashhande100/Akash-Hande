package introductionToClass;

import java.util.Arrays;

public class MathsClass {
	
	public static void main(String[] args) {
		
		int[] arr = {10, 17, 15, 13, 21, 19};
		
			int min = arr[0];
			for(int i=0 ; i<arr.length ; i++) {
				
				if(min > arr[i]) {
					
					min = arr[i];
				}
			}
			System.out.println("Enter the minimum value "+min);
			
			int max = arr[0];
			for(int i=0 ; i<arr.length ; i++) {
				
				if(max < arr[i]) {
					
					max = arr[i];
				}
			}
			System.out.println("Enter the minimum value "+max);
			
	}

}
