package javaCodability;

import java.util.Scanner;

/*Write a java program to store 5 unique elements in sorted order. 
 * Error should exist if user tries to add duplicates.
 */
public class unique_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []IntArr=new int[5];
Scanner sc=new Scanner(System.in);
System.out.println("enter 5 numbers");

for(int i=0;i<IntArr.length;i++)
{
	IntArr[i]=sc.nextInt();
}
sc.close();
for(int i=0;i<IntArr.length;i++)
{
	for(int j=0;j<IntArr.length;j++)
	{
		if(IntArr[i]>IntArr[j])
		{
			int temp;
			temp=IntArr[j];
			IntArr[j]=IntArr[i];
			IntArr[i]=temp;
			
		}
	}
}
for(int i=0;i<IntArr.length-1;i++)
{
	if(IntArr[i]==IntArr[i+1])
	{
		System.out.println("Error");
	}
}
System.out.println("sorted array---");
for(int i=0;i<IntArr.length;i++)
{
	System.out.println(IntArr[i]);
}
	}

}
