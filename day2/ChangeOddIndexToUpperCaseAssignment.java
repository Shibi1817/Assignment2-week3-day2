package week3.day2;

public class ChangeOddIndexToUpperCaseAssignment {

	public static void main(String[] args) {
		
		String test = "changeme";
		char[] ch=test.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if (i%2!=0) {
				
				System.out.print(test.charAt(i));
				
			}
			else {
				System.out.print(Character.toUpperCase(ch[i]));
			}
		}

	}

}
