package javaCodability;

import java.util.Iterator;
import java.util.Stack;

/*. Write a java program to implement your own stack data structure to store any number of items. 
 * And implement the following operations 1.push 2. pop 3. peek 4.display stack content
 */
public class stack_operations {
public static void main(String[] args) {
	
	Stack<Integer> s=new Stack<Integer>();
	s.push(10);
	s.push(20);
	s.push(30);
	s.push(40);
	s.push(50);
	System.out.println("stack elements after pushing 5 element to stack");
	Iterator<Integer> it=s.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	System.out.println("Stack elements after peeking in stack");
	Iterator<Integer> it1=s.iterator();
	while(it1.hasNext())
	{
		System.out.println(it1.next());
	}
	System.out.println("After pop top 2 element from stack");
	s.pop();
	s.pop();
	Iterator<Integer> it2=s.iterator();
	while(it2.hasNext())
	{
		System.out.println(it2.next());
	}
}
}
