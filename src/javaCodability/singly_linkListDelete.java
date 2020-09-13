package javaCodability;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

/*Write a java program to implement your own singly linked list in which delete method deletes an given 
 * element in the singly linked list
 */
public class singly_linkListDelete {

	Node head;
	
	static class Node{
		int data;
		Node next;
		
	}
	private void insert(int data)
	{
		Node node=new Node();
		node.data=data;
		node.next=null;
		if(head==null)
		{
			head=node;
		}
		else
		{
			Node n=head;
			while(n.next!=null)
			{
				n=n.next;
			}
			n.next=node;
		}
	}
	public void print()
	{
		Node node= head;
		while(node.next!=null)
		{
			System.out.println(node.data);
			node=node.next;
		}
		System.out.println(node.data);
	}
	public void deleteAt(int index)
	{
		if(index==0)
		{
			head=head.next;
			
		}else
		{
			Node n=head;
			Node n1=null;
			for(int i=0;i<index-1;i++)
			{
				n=n.next;
			}
			n1=n.next;
			n.next=n1.next;
			System.out.println("n1= "+n1.data);
			n1=null;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		singly_linkListDelete list=new singly_linkListDelete();
		list.insert(6);
		list.insert(14);
		list.insert(20);
		System.out.println("insert 3 elements in linked list");
		list.print();
		int pos;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter position that you want to delete in linked list");
		pos=sc.nextInt();
		sc.close();
		System.out.println("delete element from position");
		list.deleteAt(pos);
		list.print();
        
	}
}
