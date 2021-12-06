package conditionalStatement;

import java.util.Scanner;

public class IfElseExample1 {
	
	public static void main(String[] args) {
		
		int n;
		System.out.println("Enter any number = ");

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		if (n > 0) {
			System.out.println("Positive Number");
		} else {
			System.out.println("Negative Number");
		}
	}

}
