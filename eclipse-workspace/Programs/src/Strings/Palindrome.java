package Strings;

public class Palindrome {

	public static void main(String[] args) {
	
		String str="malayalam";
		boolean result = isPalindrome(str);
		if(result) System.out.println("Palindrome");
		else System.out.println("Not a Palindrome");

	}

	private static boolean isPalindrome(String str) {
		if(str==null) return false;
		
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		
		return sb.toString().equals(str);
		
		
	}

}
