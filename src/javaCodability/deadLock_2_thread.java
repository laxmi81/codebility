package javaCodability;
/*. What is the cause of deadlock in java multithreading. 
 * Write a program to create deadlock between two threads
 * 
 * Deadlock occurs when multiple threads need the same locks but obtain them in different order. A Java 
 * multithreaded program may suffer from the deadlock condition because the synchronized keyword causes 
 * the executing thread to block while waiting for the lock, or monitor, associated with the specified object.
 */
public class deadLock_2_thread {
	public void method1()
	{
		synchronized (Integer.class) {
			System.out.println("i am in synchronized Integer block of method 1");
			synchronized (String.class)
			{
				System.out.println("I am in synchronized of String block of method 1");
			}
		}
		
	}
	
		public void method2()
		{
			synchronized (String.class) {
				System.out.println("i am in synchronized String block of method 2");
				synchronized (Integer.class)
				{
					System.out.println("I am in synchronized of Integer block of method 2");
				}
			}
			
		}


public static void main(String[] args) {
	deadLock_2_thread obj=new deadLock_2_thread();
	obj.method1();
	obj.method2();
}
}
