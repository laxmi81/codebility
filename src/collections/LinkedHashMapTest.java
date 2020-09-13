package collections;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  LinkedHashMap map=new LinkedHashMap();
  map.put(1, "fk");
  map.put(1, 10);
  map.put(null, null);
  map.put(2, 12);
  map.put(3,23.5);
  map.put(null, 34);
  
  Set<Map.Entry> set=map.entrySet();
  for(Map.Entry ob:set)
  {
	  System.out.println(ob.getValue()+"  "+ob.getKey());
  }
	}

}
