package java_assign_abhi;

import java.util.Scanner;

public class Big_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a,b,c;
      int biggest=0,big1=0,big2=0;
      Scanner s =new Scanner(System.in);
      
      System.out.println("enter first number- ");
      a=s.nextInt();
      
      System.out.println("enter second number- ");
      b=s.nextInt();
      
      System.out.println("enter third number- ");
      c=s.nextInt();
      
      if(a>b && a>c)
      {
    	  biggest=a;
    	 
    	 
    	   if(b>c)
    	  {
    		  big1=b;
    		  big2=c;
    	  }
    	  
    	 
      }
     else
     {
    	  if(b>a && b>c)
         {
    		biggest=b;
    		
          }
    	    if(a>c)
    		  {
    			  big1=a;
    		  	  big2=c;
    		  }
     }
      biggest=c;
      if(a>b)
      {
    	  big1=a;
       	  big2=b;
      }
      
      System.out.println("biggest= "+biggest+" big1= "+big1+" big2= "+big2);
	}

}
