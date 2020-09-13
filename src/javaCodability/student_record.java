package javaCodability;

import java.util.HashMap;
import java.util.Scanner;
/*Write a java program to store 5 student information and award the students with 1st rank, 2nd rank and 
 * 3rd rank according to marks obtained where each student has student name, student marks and student 
 * reg no information
 */

public class student_record {
	
	public static void main(String[] args) {
		String SName[] = {"aa","bb","cc","dd","ee"};
		int []STotalMarks = {120,234,125,345,267};
		String SRegNo[] = {"s001","s002","s003","s004","s005"};
		
		for(int i=0;i<5;i++)
			{
				for(int j=0;j<5;j++)
				{
					if(STotalMarks[i]>STotalMarks[j])
					{
						int temp=0;
					temp=STotalMarks[j];
					STotalMarks[j]=STotalMarks[i];
					STotalMarks[i]=temp;
					
					String t=null;
					t=SName[j];
					SName[j]=SName[i];
					SName[i]=t;
					
					String te=null;
					te=SRegNo[j];
					SRegNo[j]=SRegNo[i];
					SRegNo[i]=te;
					
				    }
				}
			}
			System.out.println("sort total marks");
			for(int i=0;i<5;i++)
			{
				if(i==0)
				{
				System.out.println("1st Rank marks = "+STotalMarks[i]+" Student Name= "+SName[i]+" Student Reg No. ="+SRegNo[i]);
				}
				if(i==1)
				{
					System.out.println("2nd Rank Marks= "+STotalMarks[i]+" Student Name= "+SName[i]+" Student Reg No. ="+SRegNo[i]);
				}
				if(i==2)
				{
					System.out.println("3rd Rank Marks = "+STotalMarks[i]+" Student Name= "+SName[i]+" Student Reg No. ="+SRegNo[i]);
				}
			}
				
	}
}
	
	
	
	
	

