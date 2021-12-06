			// Same Character Set In String


package stringStringBufferStringBuilder;

import java.util.Arrays;
import java.util.Scanner;

public class FindSameCharacterSetString {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First String = ");
		String first = sc.next();
		System.out.println("Enter sencond String = ");
		String second = sc.next();
		
		char[] firstStr = first.toCharArray();
		char[] secondStr = second.toCharArray();
		Arrays.sort(firstStr);
		Arrays.sort(secondStr);
		boolean status = false;
		
		for(int i = 0 ; i < secondStr.length ; i++) {
			
			if(firstStr[i] == secondStr[i]) {
				status = true;
			}
			else {
				status = false;
				break;
			}
		}
		if(status) {
			System.out.println("Both String have same character set");
		}
		else {
			System.out.println("Both String don't have same character set");
		}
			
	}

}
