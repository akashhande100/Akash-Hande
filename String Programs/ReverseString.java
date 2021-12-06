			//Reverse String without using any predefined methods


package stringStringBufferStringBuilder;

import java.util.Scanner;

public class ReverseString {
	
	public static void reverseString(char[]ch,int length) {
		
		if(length>0) {
			System.out.print(ch[length-1]);
			length--;
			reverseString(ch,length);					//recursive calling method
			
			
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String =");
		String str = sc.next();
		
		char[] ch = str.toCharArray();					//convert string into character array
		int length = ch.length;							//finding length of the String
		reverseString(ch,length);
		
	
	
	}

	

}


