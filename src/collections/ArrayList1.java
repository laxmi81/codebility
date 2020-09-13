package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArrayList list=new ArrayList();
     list.add(12);
     list.add("laxmi");
     list.add(24.4);
     list.add(12);
     
     list.remove(0);
     list.remove("laxmi");
     
     list.clear();
     
     list.add(12);
     list.add("laxmi");
     list.add(24.4);
     list.add(12);
     
     Iterator it=list.iterator();
     System.out.println("Array List:- ");
     while(it.hasNext())
     {
    	 System.out.println(it.next());
     }
	}

}
