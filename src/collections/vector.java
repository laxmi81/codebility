package collections;

import java.util.Iterator;
import java.util.Vector;

public class vector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Vector list=new Vector();
  list.add(12);
  list.add(12);
  list.add("qwe");
  
  Iterator it=list.iterator();
  System.out.println("vector list");
  while(it.hasNext())
  {
	  System.out.println(it.next());
  }
	}

}
