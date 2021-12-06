package stringStringBufferStringBuilder;

public class StringCodePointMethod {
	
	public static void main(String[] args) {
		
		String str  = new String("Eclipse");
		
		System.out.println(str.codePointAt(1));        
		System.out.println(str.codePointBefore(1));    
		System.out.println(str.codePointCount(0, 7)); 
		
		
	}

}
