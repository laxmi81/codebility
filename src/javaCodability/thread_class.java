package javaCodability;

public class thread_class {
public static void main(String[] args) {
	Thread t1=new Thread(new Runnable()
			{

				@Override
				public void run() {
					// TODO Auto-generated method stub
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
		
			});
	Thread t2=new Thread(new Runnable()
	{

		@Override
		public void run() {
			// TODO Auto-generated method stub
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

	});
	Thread t3=new Thread(new Runnable()
	{

		@Override
		public void run() {
			// TODO Auto-generated method stub
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

	});
	t1.start();
	t2.start();
	t3.start();
}
}
