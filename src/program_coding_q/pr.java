package program_coding_q;

public class pr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int input1[]= {5,0,6,0,7};
int input2=4;

int l=input1.length;
for(int i=0;i<input1.length;i++)
{
	int temp;
	int c=1;
	if(input1[i]==0)
	{
		temp=input1[i];
		input1[i]=input1[l-c];
		input1[l-c]=temp;
		
		c++;
	}
}
for(int i=0;i<input1.length;i++)
{
	System.out.println(input1[i]);
}
	}

}
