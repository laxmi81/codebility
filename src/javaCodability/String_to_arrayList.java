package javaCodability;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//How to convert a string array to ArrayList
public class String_to_arrayList {
public static void main(String[] args) {
	String str[]= {"aaa","bbb","ccc","ddd","eee"};
	List<String> ls=new ArrayList<String>();
	
	System.out.println("string list to arraylist");
	System.out.println("string list is");
	for(int i=0;i<str.length;i++)
	{
		System.out.println(str[i]);
	}
	System.out.println("arrayList is");
	for(int i=0;i<str.length;i++)
	{
		ls.add(str[i]);
	}
	Iterator<String> it=ls.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
}
}
