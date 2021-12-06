package stringStringBufferStringBuilder;

public class StringArrayWithPalindrome {

 public static void main(String[] args) {
	 
	 String arr[] = new String[3];
	 
	   		arr[0] = "akash";
	   		arr[1] = "madam";
	   		arr[2] = "";
	   		   		   
		       for(int i = arr[1].length()-1 ; i>=0 ; i--) {
			    	  arr[2] = arr[2] + arr[1].charAt(i);
			    	   
			       }
	     
	   	   System.out.println("Actual String = "+ arr[0]);
	       System.out.println("Reverse String = "+arr[1]);
	       
	       if(arr[0].equals(arr[1])) {
	    	   
	    	   System.out.println("String is Palindrome");
	       }
	       else {
	    	   System.out.println("String is not Palindrome");
	       }
	 }

}
