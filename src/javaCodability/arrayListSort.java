package javaCodability;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/*2.	How to sort ArrayList of strings alphabetically in java*/
public class arrayListSort {
public static void main(String[] args) {
	
	List<String> ar =new ArrayList<>();
	ar.add("padma");
	ar.add("lekha");
	ar.add("ritu");
	ar.add("sneha");
	System.out.println("list before sorting");
	Iterator<String> it=ar.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
  System.out.println("list after sorting");
	Collections.sort(ar);
	System.out.println(ar);
	
}
}
