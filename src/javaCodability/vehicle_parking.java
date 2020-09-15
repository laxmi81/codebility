package javaCodability;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*. Write a java program to implement the fallowing Consider vehicle parking application where
 *  each vehicle information which enters into the parking location stored in 2 lists. at the end of each day 
 *  these lists to be merged into single list and one vehicle information which has highest parked hour 
 *  should be retrieved, where each vehicle information has vehicle number, vehicle model, total duration 
 *  parked in minutes.
 */
public class vehicle_parking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Set<String> vn=new HashSet<String>();
 vn.add("v0235");
 vn.add("v729");
 vn.add("h2345");
 vn.add("s2345");
 
 List<String> vm=new ArrayList<String>();
 vm.add("murcedese");
 vm.add("toyota");
  vm.add("alto");
  vm.add("wagnour");
  
  List<Integer> du=new ArrayList<Integer>();
  du.add(1234);
  du.add(4534);
  du.add(6293);
  du.add(4563);
  
 
	}

}
