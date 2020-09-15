package javaCodability;

import java.util.Stack;

//Implement your own QUEUE using STACKS data structure
public class queueUsingStack {
	
	private Stack<Integer> s1=new Stack<Integer>();
	private Stack<Integer> s2=new Stack<Integer>();
	
	public void enqueue(int data)
	{
		s1.push(data);
	}
	
	public void dequeue()
	{
		if(s2.isEmpty())
		{
			if(s1.isEmpty())
			{
				System.out.println("we can not dequeue datacoz queue empty");
			}
			else
			{
				while(!s1.isEmpty())
				{
					s2.push(s1.pop());
				}
			}
		}
		System.out.println(s2.pop());
	}
	public static void main(String[] args) {
		queueUsingStack qu=new queueUsingStack();
		qu.enqueue(3);
		qu.enqueue(4);
		qu.enqueue(5);
		qu.dequeue();
		qu.enqueue(6);
		qu.enqueue(7);
		qu.dequeue();
		qu.dequeue();
		qu.dequeue();
		qu.dequeue();
		
	} 

	
}
