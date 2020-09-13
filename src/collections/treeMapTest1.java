package collections;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class treeMapTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  TreeMap map=new TreeMap();
  map.put(4,null);
  map.put(1, 10);
  //map.put(null, null);
  map.put(2, 12);
  map.put(3,12);
//  map.put(null, 34);
  
  Set<Map.Entry> set=map.entrySet();
  for(Map.Entry ob:set)
  {
	  System.out.println(ob.getValue()+"  "+ob.getKey());
  }
	}

}
