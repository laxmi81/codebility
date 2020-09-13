package java_assign_abhi;

import java.util.Scanner;

public class Occurence_of_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //10. Program to find occurrence of number ( Example, i/p → {1,3,23,45,4,3,23} 
		//(Use Scanner For Input) 3 → Occurred 2 times 
		//23 → Occurred 2 times
		//45 → Occurred 1 times
		//4  → Occurred 1 times

		int [] a=new int[10];
		int n;
		Scanner s =new Scanner(System.in);
		
		System.out.println("enter how many elements in array- ");
		n=s.nextInt();
		
		System.out.println("enter array elements- ");
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		
		int num;
		System.out.println("enter the number that you want to find occurance- ");
		num=s.nextInt();
		s.close();
		
		 int c=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==num)
			{
				c++;
			}
		}
		System.out.println("count of "+num+ " is= "+c);
	}

}
