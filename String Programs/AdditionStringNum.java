//Addition In String Number

package stringStringBufferStringBuilder;

public class AdditionStringNum {

	public static void main(String[] args) {

		String s = new String("C0un7ersi9n 7ec4n0l0gy");

		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (Character.isDigit(ch)) {

				sum = sum + Character.getNumericValue(ch);
			}
		}

		System.out.println("Addition of digits from String =" + sum);
	}

}
