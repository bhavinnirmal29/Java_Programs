//MultiThreading
//Extending Thread Class
class MyThread extends Thread
{
	MyThread()
	{
		super("MyThread");
		System.out.println("Child Thread "+this);
		start();
	}
	public void run()
	{
		try
		{
			for(int i=0;i<5;i++)
			{
				System.out.println("Child : "+i);
				Thread.sleep(500);
			}
			System.out.println("Child Thread Exited ");
		}
		catch(InterruptedException ie)
		{
			System.out.println("Child Thread Interrupted : ");
		}
	}
}

class MyThreadTest
{
	public static void main(String args[])
	{
		new MyThread();
		try
		{
			for(int i=0;i<5;i++)
			{
				System.out.println("Main : "+i);
				Thread.sleep(1000);
			}
			System.out.println("Main Thread Exited");
		}
		catch(InterruptedException ie)
		{
			System.out.println("Main Thread Interrupted :");
		}
	}
}