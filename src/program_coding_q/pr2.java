package program_coding_q;

public class pr2 {
	
	public static void main(String[] args) {
		String str="i am bryan";
		char[] c=str.toCharArray();
         
 //distict chararter print
 
for(int i=0;i<c.length;i++)
{
	for(int j=i+1;j<c.length;j++)
	{
		
		if(c[i]==c[j])
		{
			j++;
			System.out.print(c[j]);
		}
				
	}
	
}
}
}
