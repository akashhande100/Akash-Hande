package conditionalStatement;

import java.util.Scanner;

public class IfExample1 {

	public static void main(String arg[]) {

		int age;
		System.out.println("Enter your are = ");

		Scanner sc = new Scanner(System.in);
		age = sc.nextInt();

		if (age > 18)

			System.out.println("Eligible for votes");

		System.out.println("Thank You");

	}

}
