			//Reverse Given String


package stringStringBufferStringBuilder;

public class ReverseGivenString {
	
	public static void main(String[] args) {
		
		String s = "Selenium";
		int leng = s.length();
		String s1 = "";
		
		for(int i=leng-1 ; i>=0 ; i--) {
			
			s1 = s1 + s.charAt(i);
		}
		
		System.out.println("Reverse of String "+s+ " is "+s1);
			
	}

}
