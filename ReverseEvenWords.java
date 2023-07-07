package week3.day2;

import java.util.Arrays;

public class ReverseEvenWords {

	public static void main(String[] args) {
		
		String test = "I am a software tester",rev="",temp="",res=" ",ans=" "; 
		String[] split=test.split(" "); 
		char[] ch=test.toCharArray();
		rev=rev+Arrays.toString(split);
		
		for(int a=0;a<split.length;a++) {
			if(a%2==0) {
				res=res+" "+split[a];
				System.out.println(" "+split[a]);
			}
			
		}
		for(int i=ch.length-1;i>=0;i--) {
			
			temp=temp+ch[i];
			
		}

		String[] split1=temp.split(" ");
		
		for (int j=split1.length-1;j>=0;j--) {
			if(j%2!=0) {
				ans=ans+" "+split1[j];
				System.out.println(" "+split1[j]);
				
			}
			
		}		

	}
}
