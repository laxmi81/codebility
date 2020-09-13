package javaCodability;

import java.util.ArrayList;
import java.util.Iterator;

public class convertStringArrToArrList {
public static void main(String[] args) {
	
	String[] ar= {"aaa","ccc","sss","eee"};
	
	ArrayList<String>al=new ArrayList<String>();
	for(int i=0;i<ar.length;i++)
	{
		al.add(ar[i]);
	}
	System.out.println("Array List elements---");
	Iterator<String> it=al.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
}
}
