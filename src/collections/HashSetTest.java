package collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   HashSet set=new HashSet();
   set.add(10);
   set.add(12);
   set.add(null);
   set.add(10);
   set.add(null);
   
   Iterator it=set.iterator();
   System.out.println("hash set - ");
   while(it.hasNext())
   {
	   System.out.println(it.next());
   }
	}

}
