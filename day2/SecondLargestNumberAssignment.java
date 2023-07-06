package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLargestNumberAssignment {

	public static void main(String[] args) {
		
		Integer[] data = {3,2,11,4,6,7};
		List<Integer> list1=new ArrayList<Integer>(Arrays.asList(data));
		Collections.sort(list1);
		int size=list1.size();
		System.out.println("Second largest number is "+list1.get(size-2));

	}

}
