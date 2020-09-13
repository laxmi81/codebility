package javaCodability;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

/*Write a program to insert "tekarch" into vector then insert user inputed number(N) of Z's from 3rd position.
 * delete N charactors from 6th position from vectorExample:if user input =5Then vector stores="tekZZZZZarch"
 * Delete 5 character from 6th position so final string="tekZZZh"
 */
public class tekarch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v = new Vector(); 
		
		v.add(0,"t");
		v.add(1,"e");
		v.add(2,"k");
		v.add(3,"a");
		v.add(4,"r");
		v.add(5,"c");
		v.add(6,"h");
		
		Scanner sc=new Scanner(System.in);
		int n; 
		//n=5;
		System.out.println("enter number between 0-10");
		n=sc.nextInt();
		sc.close();
		System.out.println("vector output--");
		Iterator<String> it=v.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		int s=1;
		for(int i=3;i<v.size()+n;i++)
		{
			while(s<=n)
			{
			v.add(i,"Z");
			s++;
			}
			
		}
		System.out.println("final output");
		Iterator<String> it1=v.iterator();
		while(it1.hasNext())
		{
			System.out.println(it1.next());
		}
		
		
		
	}

}
