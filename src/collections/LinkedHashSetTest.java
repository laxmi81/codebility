package collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      LinkedHashSet set=new LinkedHashSet();
      set.add(10);
      set.add(12);
      set.add(10);
      set.add(null);
      set.add(null);
      
      Iterator it=set.iterator();
      while(it.hasNext())
      {
    	  System.out.println(it.next());
      }
	}

}
