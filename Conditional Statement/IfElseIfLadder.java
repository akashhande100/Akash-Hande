package conditionalStatement;

import java.util.Scanner;

public class IfElseIfLadder {

	public static void main(String[] args) {

		int marks;
		System.out.println("Enter marks = ");

		Scanner sc = new Scanner(System.in);
		marks = sc.nextInt();

		if (marks > 80)
			System.out.println("Topper");

		else if (marks < 80 && marks > 60)
			System.out.println("First");

		else
			System.out.println("Second");

	}

}
