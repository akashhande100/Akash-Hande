package conditionalStatement;

import java.util.Scanner;

public class IfElseExample {
	
public static void main(String arg[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter int value");
		int a = sc.nextInt();
		
		if(a%2 !=0) {
			System.out.println(a+" is odd number");
		} else {
			System.out.println(a+" is even number");
		}
		
		//a, e, i, o, u
		
		char c = 'a';
		if(c == 'a') {
			System.out.println(c+" is Vowel character");
		} else {
			System.out.println(c+" is not Vowel character");
			
		}
		
		char d = 'e';
		if(d == 'a') {
			System.out.println(c+" is Vowel character");
		} else {
			System.out.println(c+" is not Vowel character");
			
		}
		sc.close();
	}


}
