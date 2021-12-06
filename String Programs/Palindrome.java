package stringStringBufferStringBuilder;

public class Palindrome {
	
	public static void main(String[] args) {
		
		String str = new String("Selenium");
		String str1 = new String("mom");
		String str2 = new String();
		
		for(int i = str1.length()-1 ; i >=0 ; i--) {
			
			str2 = str2 + str1.charAt(i);
			
			}
			System.out.println("Actual String = "+str1);
			System.out.println("Recerse String = "+str);
			if(str1.equals(str)) {
				
				System.out.println("String is Palindrome");
			}
			else {
				System.out.println("String is not Palindrome");
			}
	}

}
