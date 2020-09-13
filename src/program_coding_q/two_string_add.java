package program_coding_q;

public class two_string_add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String s1="1234";
   String s2="2345";
   String s3="";
   char[] c_s3=null;
   char[] c_s1=s1.toCharArray();
   char[] c_s2=s2.toCharArray();
   for(int i=0;i<4;i++)
   {
	   c_s3[i]= (char) (c_s1[i]+c_s2[i]);
	// s3=s3+c_s3[i];
	   System.out.println(c_s3[i]);
   }
  
	}

}
