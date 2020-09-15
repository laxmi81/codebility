package javaCodability;

public class deadlock_2_theads {

	String s1="abcd";
	String s2="xyz";
	
	Thread t1=new Thread()
			{
		public void run()
		{
			while(true)
			{
				synchronized(s1)
				{
					try {
						System.out.println(Thread.currentThread().getName()+" locked "+s1);
					
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				synchronized(s2) {
					System.out.println(Thread.currentThread().getName()+" locked "+s2);
				}
					System.out.println(s1+s2); 
				}
			}
		
			};
			Thread t2=new Thread()
			{
		public void run()
		{
			while(true)
			{
				synchronized(s2)
				{
					System.out.println(Thread.currentThread().getName()+" locked "+s2);
				
				synchronized(s1) {
					System.out.println(Thread.currentThread().getName()+" locked "+s1);
					System.out.println(s1+s2); 
				}
			}
		}
		}
			};
			public static void main(String[] args) {
				deadlock_2_theads obj=new deadlock_2_theads();
				obj.t1.start();
				obj.t2.start();
			}
}
