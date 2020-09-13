package java_assign_abhi;

import java.util.Scanner;

public class Reverse_word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//7. Reverse word in a string ( Example: I/p → “ I am good boy” o/p →”I ma doog yob” 
		
		
		String str="i am good boy";
		
		//words={i,am,a,good,boy}
		String []words=str.split("");
		
		String revstring="";
		
		for(int i=0;i<words.length;i++)
		{
			String word=words[i];
			
			
			String revword="";
			//am
			for(int j=word.length()-1;j>=0;j--)
			{
				revword=revword+word.charAt(j);//ma
				
			}
			revstring=revstring+revword+" ";//ma
			
		}
		
		System.out.println(revstring);
	
	}

}
