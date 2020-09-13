package java_assign_abhi;

public class Reverse_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//6. Reverse string with out using reverse command
		
		String name="laxmi";
		 System.out.println("original string = "+name);
		 
		 //String temp="";
		 System.out.println("reverse string = ");
		 
		 int len=name.length();
		 for (int i=len-1;i>=0;i--)
		 {
			 System.out.print(name.charAt(i));
		 }
		
	}

}
