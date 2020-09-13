package program_coding_q;

import java.util.Scanner;

public class occurence_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int arr[] = {5,5,3,2,1};
   int size=arr.length;

   System.out.println("array is");
   for(int i=0;i<size;i++)
   {
	   System.out.println(arr[i]+" ");
   }
   System.out.println("occurence of elements is ");
   
   for(int i=0;i<size;i++)
   {
	   int c=0;
	   for(int j=i;j<size;j++)
	   {
		   if(arr[i]==arr[j])
			   c++;
		   
	   }
	  System.out.println("element "+arr[i]+"="+c); 
   }
	}

}
