package javaCodability;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/*Store user defined employee objects into arraylist and Remove duplicates from arraylist without 
 * using collections.
 */
public class emp_obj_remove_dupli {
public static void main(String[] args) {
	employee emp1=new employee("aaa",234761,"delhi");
	employee emp2=new employee("bbb",354761,"goa");
	employee emp3=new employee("aaa",256761,"andra");
	employee emp4=new employee("aaa",234761,"delhi");
	
	List<employee> emp_list=new ArrayList<employee>();
	emp_list.add(emp1);
	emp_list.add(emp2);
	emp_list.add(emp3);
	emp_list.add(emp4);
	
 System.out.println("employee list with out remove duplicate");
	Iterator<employee> it_emp=emp_list.iterator();
	while(it_emp.hasNext())
	{
		System.out.println(it_emp.next());
	}
	
	System.out.println("remove duplicate");
	Set<employee> e=new HashSet<employee>();
	e.addAll(emp_list);
	 emp_list=new ArrayList<employee>();
	 
	emp_list.addAll(e);
	Iterator<employee> it1=e.iterator();
	while(it1.hasNext())
	{
	System.out.println(it1.next());
	
	}
}
}
class employee {
	private String Emp_name;
	private int Contact_no;
	private String city;
	
	employee()
	{
		
	}

	@Override
	public String toString() {
		return "employee [Emp_name=" + Emp_name + ", Contact_no=" + Contact_no + ", city=" + city + "]";
	}



	public employee(String emp_name, int contact_no, String city) {
		super();
		Emp_name = emp_name;
		Contact_no = contact_no;
		this.city = city;
	}

	public String getEmp_name() {
		return Emp_name;
	}

	public void setEmp_name(String emp_name) {
		Emp_name = emp_name;
	}

	public int getContact_no() {
		return Contact_no;
	}

	public void setContact_no(int contact_no) {
		Contact_no = contact_no;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	 @Override
	    public boolean equals(Object obj) {
	        // TODO Auto-generated method stub
	        if(obj instanceof employee)
	        {
	            employee temp = (employee) obj;
	            if(this.Emp_name == temp.Emp_name && this.city== temp.city && this.Contact_no == temp.Contact_no)
	                return true;
	        }
	        return false;

	    }
	    @Override
	    public int hashCode() {
	        // TODO Auto-generated method stub

	        return (this.Emp_name.hashCode() + this.city.hashCode());        
	    }
	
	
}
