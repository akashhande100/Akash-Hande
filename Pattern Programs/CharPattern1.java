package patternPrograms;

public class CharPattern1 {
	
	
	public static void main(String[] args) {
	
		char ch = 'a';
		
	//	int a = 1 ;
			for (int i = 0 ; i < 5 ; i++) {
				
		//	int a = 1;
				for (int j = 4 ; j >= i ; j--) {
					
					System.out.print(ch); 		// ch++  a++  a  ch
					
				}
				
				System.out.println();
				ch++;  								//ch++  a++
			}
}

}
