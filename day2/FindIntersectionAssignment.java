package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindIntersectionAssignment {

public static void main(String[] args) {
	
		Integer[] arr1= {3,2,11,4,6,7};
		Integer[] arr2= {1,2,8,4,9,7};
		List<Integer> list1=new ArrayList<Integer>(Arrays.asList(arr1));
		List<Integer> list2=new ArrayList<Integer>(Arrays.asList(arr2));
		for (int i=0; i<list1.size();i++) 
			for(int j=0;j<list2.size();j++) {
				if(list1.get(i)==list2.get(j)) {
					System.out.println(list1.get(i));
				}
			}
		
			
		}

	}


