package week3.day2;

public class PalindromeAssignment {

	public static void main(String[] args) {
		
		String input="madam", rev="";
		
		
		for(int i=input.length()-1; i>=0;i--) {
			rev=rev+input.charAt(i);
			
		}
			if(rev.equals(input)) {
				System.out.println("Palindrome");
			}
			else {
				System.out.println("Not a Palindrome");
			
		}
		

	}

}
