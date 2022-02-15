package threads;

public class ThreadsByRunnable implements Runnable {
	
	int time;
	Thread thread;
	public ThreadsByRunnable(int name,String name1)
	{
		this.time=time;
		thread=new Thread(this,name1);
		thread.start();
	}	
		
		
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread());
			try {
				thread.sleep(time);
			} 
			catch(Exception e)
			{
				e.printStackTrace();
			}
		
	}  
		
	}
	}	
	
