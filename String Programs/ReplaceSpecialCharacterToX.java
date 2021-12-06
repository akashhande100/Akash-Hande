			//Replace special characters to 'X' in String


package stringStringBufferStringBuilder;

public class ReplaceSpecialCharacterToX {
	
	public static void main(String[] args) {
		
		String s = "Pr!gr#mi$g La?gua*e";
		
		String s1 = s.replaceAll("[^a-zA-Z0-9]", "X");
		System.out.println(s1);
	}

}
