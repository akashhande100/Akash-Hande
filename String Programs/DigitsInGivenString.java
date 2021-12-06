		// Numbers of digits in a given String

package stringStringBufferStringBuilder;

public class DigitsInGivenString {
	
	    public static void main(String[] args) {
		
	    		String s = "C0un7er5i9n 7echn0l0gy";
	    		String s1 = s.replaceAll("\\D", "");
	
	    	for (int i=0 ; i<s1.length() ; i++) {
		
	    		System.out.print(s1.charAt(i)+" ");
		
	}	
	}

}
