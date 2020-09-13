package javaCodability;

import java.util.ArrayList;

/*Write a java program to implement your own ArrayList which has two methods a) add b) remove and 
 * store 5 student information in your ArrayList.
 */
public class ArryList_student {
	static int n=5;
	class data{
		String S_Name;
		int S_RollNo;
		int S_TotalMarks;
	data(String name,int roll,int marks)
		{
			this.S_Name=name;
			this.S_RollNo=roll;
			this.S_TotalMarks=marks;
		}
	}
public static void main(String[] args) {
	
	String Name[]= {"abc","xyz","querty","sd","atr"};
	int Roll_No[]= {101,102,103,104,105};
	int Total_marks[]= {345,234,456,123,367};
	
	ArryList_student sal=new ArryList_student();
	System.out.println("Student list with their data");
	sal.add_values(Name,Roll_No,Total_marks);
	
}
public void add_values(String name[],int roll[],int marks[])
{
	ArrayList<data> ar=new ArrayList<data>();
	for(int i=0;i<n;i++)
	{
		ar.add(new data(name[i],roll[i],marks[i]));
	}
	print_values(ar);
	//remove_values(ar);
}
public void print_values(ArrayList<data> ar)
{
	
	for(int i=0;i<n;i++)
	{
	  data data=ar.get(i);
	  System.out.println("Student Name= "+data.S_Name+"  Roll no.= "+data.S_RollNo+" Total marks = "+data.S_TotalMarks);
	  
	  
	}
	
}
/*public void remove_values(ArrayList<data> ar)
{
	//ArrayList<data> ar1=new ArrayList<data>();
	for(int i=0;i<n;i++)
	{
		data data=ar.remove(i);
		
	
	//print_values(ar);
	}
}*/
}
