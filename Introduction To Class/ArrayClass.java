package introductionToClass;

import java.util.Arrays;

public class ArrayClass {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
	/*	int arr1[] = Arrays.copyOf(arr, 7);
		for(int i=0 ; i<arr1.length ; i++) {
			System.out.println(arr1[i]); 
		} */
		
	/*	 Arrays.fill(arr, 52);
		 for(int i=0 ; i<arr.length ; i++) {
				System.out.println(arr[i]); 
			}  */
		
	/*	String s = Arrays.toString(arr);
		System.out.println(s);
		*/
		
		  Arrays.sort(arr);
		System.out.println(arr);
		
	}

}
