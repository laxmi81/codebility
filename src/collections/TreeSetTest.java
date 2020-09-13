package collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  TreeSet set=new TreeSet();
  set.add(12);
  set.add(10);
  //set.add(null);
  set.add(10);
  
  Iterator it=set.iterator();
while(it.hasNext())
{
	System.out.println(it.next());
}
	}

}
