package controlStatement;

public class SingleDimentionalArrayWithWhileLoop {
	
	public static void main(String[] args) {
		
		
		char vowels[] = {'a', 'e', 'i', 'o', 'u'};
		
		int index = 0;
		int size = vowels.length;
		
		while (index < size) {
			
			System.out.println(vowels[index]);
			index++;
		}
	}

}
