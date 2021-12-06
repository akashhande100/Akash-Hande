package javaExample;

import java.util.Scanner;

public class ScannerClass {
	
	public static void main(String[] args) {
		
		String s;
		int a;
		
		System.out.println("Enter Value");
		
		Scanner sc = new Scanner(System.in);
		
		s=sc.nextLine();
		a=sc.nextInt();
		
		System.out.println(s+" "+a);
	}

}
