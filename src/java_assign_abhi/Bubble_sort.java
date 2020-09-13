package java_assign_abhi;

import java.util.Scanner;

public class Bubble_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s =new Scanner(System.in);
		
		int[] a=new int[10];
		
		
		
		System.out.println("enter array of n elements- ");
		for(int i=0;i<10;i++)
		{
			a[i]=s.nextInt();
		}
		
		int temp=0;
		for(int i=0;i<10;i++)
		{
			for(int j=i+1;j<10;j++)
			{
				if(a[j]>a[i])
				{
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
		
		System.out.println("final array is-");
		for(int i=0;i<10;i++)
		{
			System.out.println(a[i]);
		}
	}

}
