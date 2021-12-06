			// Remove Duplicate Character


package stringStringBufferStringBuilder;

import java.util.Scanner;

public class RemoveDuplicateCharacter {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string =");
		String s = sc.next();
		
		String s1 ="";
		char prevChar = ' ';
		 
		for (int i=0 ; i<s.length() ; i++) {
			
			if(prevChar!=s.charAt(i))
				s1 = s1 + s.charAt(i);
			prevChar = s.charAt(i);
		}
		
		System.out.println("New string ="+ s1);
		
		
		
	}

}
