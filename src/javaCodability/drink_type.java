package javaCodability;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*Write a java code for the following Store n number of drinktype with quantity. If user wants a drink, 
 * user should enter drinktype. If drink quantity is greater than one then request should be served and 
 * decrease the corresponding quantity by one else no availability message should be printed on screen
 */
public class drink_type {
public static void main(String[] args) {
	
	HashMap<String,Integer> hm=new HashMap<String,Integer>();
	hm.put("beer",200);
	hm.put("wine",345);
	hm.put("soft drink",278);
	hm.put("water",400);
	
	System.out.println("List of drink type available-");
	
	for (Map.Entry<String, Integer> entry : hm.entrySet()) 
		System.out.println("(" + entry.getKey()+ ", " + entry.getValue() + ")"); 
	
	String dt;
	Integer q;
	Scanner sc=new Scanner(System.in);
	HashMap<String,Integer> hm1=new HashMap<String,Integer>();
	 System.out.println("Enter any drink type and quantity ");
	 dt=sc.next();
	 q=sc.nextInt();
	 sc.close();
	 boolean flag;
	 hm1.put(dt, q);
	 Integer qu = null;
	 String dtype = null;
	 for (Map.Entry<String, Integer> entry : hm.entrySet()) 
	 {
		 
		 
		 if((entry.getKey().equalsIgnoreCase(dt)) && (entry.getValue()>q))
		 {
			 qu=entry.getValue();
			 dtype=entry.getKey();
			
			 qu=qu-q;
			 flag=true;
		 }
		 else
		 {
			flag=false;
		 }
		 if(flag)
		 {
			 System.out.println("drink= "+dtype+" quantity= "+ q); 
			 System.out.println("current quantity-");
			 System.out.println("drink= "+dtype+" quantity= "+qu);
		 }
		 else
		 {
			 System.out.println("No availibility");
		 }
		 
	 }
	
}
}
