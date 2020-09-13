package javaCodability;
/*Write a java program to create three threads T1, T2 and T3 and ensure sequence T1,T2,T3 in java.*/
class myclass implements Runnable
{
	@Override
	public void run() {
		for(int i=0;i<10;i++)
		{
			System.out.println(Thread.currentThread().getId()+" value "+i);
		}
		try
		{
			Thread.sleep(100);
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
	}
}
public class create_3_threads {

	public static void main(String[] args) {
		
   Thread t1=new Thread(new myclass());
   Thread t2=new Thread(new myclass());
   Thread t3=new Thread(new myclass());
   System.out.println("t1");
   t1.start();
   System.out.println("t2");
   t2.start();
   System.out.println("t3");
   t3.start();
	}

}


