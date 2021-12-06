package stringStringBufferStringBuilder;

public class StringClass1 {
public static void main(String[] args) {
		
		String s  = "core java";	// Literal way - It can be stored into String Constant Pool Memory
		String s1 = "core java";
		
		String str  = new String("Selenium");  // with String object - It can be stored into Heap Memory
		String str1 = new String("SeleniumA");
		String str2 = new String(str);
		
		System.out.println("s == s1 "+(s==s1)); 			// == method verify the address of variable
		System.out.println("s == s1 "+(s.equals(s1)) );	   //  equals() method verify the context of string
		System.out.println(str.equals(str1));
		
		
	/*	System.out.println(s==s1);
		System.out.println(s.equals(s1));
		System.out.println(str==str1);
		System.out.println(str.equals(str1));	
	*/
		
	}


}
