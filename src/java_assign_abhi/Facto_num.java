package java_assign_abhi;

import java.util.Scanner;

public class Facto_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //2. Write Java program to find factorial of number 
		
		System.out.println("Enter any number");
		int n;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		
		System.out.println("number is= "+n);
		
		int digit=0;
		int fact=1;
		while(n>0)
		{
		   digit=n;
		   n=n-1;
		   fact=fact*digit;
		
		}
		s.close();
		System.out.println("Factorial of number"+n+" is = "+ fact);
	}

}
