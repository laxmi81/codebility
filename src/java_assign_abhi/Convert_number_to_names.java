package java_assign_abhi;

import java.util.Scanner;

public class Convert_number_to_names {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//9. Convert digits to string ( i/p → 1253 → One Two five three)
		
		Scanner s =new Scanner(System.in);
		int n;
		
		System.out.println("enter any number");
		n=s.nextInt();
		s.close();
		
		
		if(n<=1)
		{
			System.out.println("wrong number");
		}
		int digit;
		int rev=0;
		while(n>0)
		{
			digit=n%10;
			n=n/10;
			rev=rev*10+digit;
		}
		while(rev>0)
		{
			digit=rev%10;
			rev=rev/10;
			switch(digit)
			{
			case 0:System.out.print(" zero");
			break;
			case 1:System.out.print(" one");
			break;
			case 2:System.out.print(" two");
			break;
			case 3:System.out.print(" three");
			break;
			case 4:System.out.print(" four");
			break;
			case 5: System.out.print(" five");
			break;
			case 6: System.out.print(" six");
			break;
			case 7:System.out.print(" seven");
			break;
			case 8:System.out.print(" eight");
			break;
			case 9:System.out.print(" nine");
			break;
			}
		
		}
	}
	

}
