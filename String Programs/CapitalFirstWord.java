		//Java Program to capitalize each word in String and remove spaces


package stringStringBufferStringBuilder;

public class CapitalFirstWord {
	
	public static void main(String[] args) {
		
		String s = "countersign			 technology   eclipse 	selenium";	
		
		String s1 = s.replaceAll("\\s{2,}", " ").trim();
		System.out.println(s1);
		
		String[] str = s1.split(" ");
		 
		for(String a:str) {
			
			System.out.print(a.substring(0, 1).toUpperCase()+ a.substring(1, a.length())+" ");
			
		}
		
	}

}
