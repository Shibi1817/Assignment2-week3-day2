package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateAssignment {

	public static void main(String[] args) {
		
		String input="We learn java basics as part of java sessions in java week1";
		String[] str=input.split(" ");
		Set<String> set1=new LinkedHashSet<String>();
		for(int i=0;i<str.length;i++) {
			set1.add(str[i]);
		}
		System.out.println(set1);

	}

}
