package program_coding_q;

public class binary_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int arr[]= {2,4,5,6,12};
  int x=6;
  int min=0;
  int max=4;
  int length=arr.length;
  int mid=length/2;
  System.out.println("min = "+min+" max= "+max+" mid= "+mid);
 if(x==arr[mid])
 {
	 System.out.println("x= "+x+"is in position "+mid);
 }
 int pos = 0;
 if((x>arr[min]) && (x<arr[mid]))
 {
	for(int i=min;i<mid;i++)
	{
		if(x==arr[i])
		{
			pos=i;
		}
	}
	System.out.println("x= "+x+"is in position "+pos);
 }
 if((x>arr[mid]) && (x<arr[max]))
 {
	for(int i=mid;i<max;i++)
	{
		if(x==arr[i])
		{
			pos=i;
		}
	}
	System.out.println("x= "+x+"is in position "+pos);
 }
	}

}
