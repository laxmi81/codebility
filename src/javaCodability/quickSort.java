package javaCodability;

import java.util.Arrays;

/*
 * What is stable algorithm? write an algorithm for quicksort. sort the fallowing using quicksort. is 
 * quick sort is stable algorithm. if not give reason. 50 70 10 40 50
 * 
 * A sorting algorithm is said to be stable if two objects with equal keys appear in the same order in 
 * sorted output as they appear in the input array to be sorted. Some sorting algorithms are stable by 
 * nature like Insertion sort, Merge Sort, Bubble Sort, etc
 * 
 * A sorting algorithm is said to be stable if it maintains the relative order of records in the case 
 * of equality of keys. QuickSort is an unstable algorithm because we do swapping of elements according 
 * to pivot's position 
 */
public class quickSort {
	private int[] arr;
	public quickSort(int[] arr)
	{
		this.arr=arr;
	}
	public void sort()
	{
		quicksort(0,arr.length-1);
		
	}
	public void print()
	{
		System.out.println("array after quick sort");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" "); 
			
		}
	}
	private void quicksort(int low,int high)
	{
		if(low>=high)
		{
			return;
		}
		int pi=partition(low,high);
		quicksort(low,pi-1);
		quicksort(pi+1,high);
	}
	private int partition(int low,int high)
	{
		int pi=(low+high)/2;
		swap(pi,high);
		
		int i=low;
		for(int j=low;j<high;j++)
		{
			if(arr[j]<=arr[high])
			{
				swap(i,j);
				i++;
			}
		}
	
	swap(i,high);
	return i;
	}
	private void swap(int i,int j)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
public static void main(String[] args) {
	 int array[]= {50,70,10,40,50};
	 //int n=5;
	 System.out.println("original array= "+Arrays.toString(array));
	 quickSort s=new quickSort(array);
	 s.sort();
	 s.print();
	 /*QuickSort(array,0,n-1);
	 System.out.println("sorted array = "+Arrays.toString(array));*/
}
}
