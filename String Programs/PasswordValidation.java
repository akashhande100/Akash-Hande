		//Validate the password


package stringStringBufferStringBuilder;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidation {
	
	public static void main(String[] args) {
		
		String s = "Hande@123#";
			
			Pattern p = Pattern.compile("(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[!@#$%&]).{8,13}");
			Matcher m = p.matcher(s);
			
			if(m.matches())
				System.out.println("Password is valid");
			else
				System.out.println("Password is Invalid");
}
}