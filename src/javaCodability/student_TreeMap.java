package javaCodability;

import java.util.Map;
import java.util.TreeMap;

public class student_TreeMap {
public static void main(String[] args) {
	
	Map<String,String> tms=new TreeMap<String,String>();
	
	tms.put("luckey", "S_001");
	tms.put("Ankit", "S_002");
	tms.put("sparsh", "S_003");
	tms.put("vinod", "S_004");
	tms.put("pramod", "S_005");
	
	System.out.println("5 Student Data--> ");
	
	for (Map.Entry<String, String> entry : tms.entrySet()) 
System.out.println("(" + entry.getKey()+ ", " + entry.getValue() + ")"); 
	
}
}
