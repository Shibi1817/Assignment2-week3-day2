package week3.day2;

import java.util.Arrays;

public class AnagramAssignment {

	public static void main(String[] args) {

		String text1 = "stops";
		String text2 = "potss";
		System.out.println(text1.length()==text2.length());
		char[] ch1=text1.toCharArray();
		char[] ch2=text2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		System.out.println(Arrays.equals(ch1, ch2));
	}

}
