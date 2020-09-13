package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  LinkedList list=new LinkedList();
  list.add(12);
  list.add("sdf");
  list.add(10.5);
  list.add(12);
  
 Iterator it= list.iterator();
 System.out.println("linked ;list:-");
 
 while(it.hasNext())
 {
	 System.out.println(it.next());
 }

 //Iterator it=list.descendingIterator();
	}

}
