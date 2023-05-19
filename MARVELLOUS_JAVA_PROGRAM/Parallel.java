class Demo extends Thread
{
	public void run()
	{
		for(int i=1;i<10;i++)
		{
	System.out.println("Inside-"+Thread.currentThread().getName()+":"+i);
		}
	}
}

class Parallel
{
	public static void main(String str[])
	{
	System.out.println("Thread name is:"+Thread.currentThread().getName());
		Demo obj1=new Demo();
		Demo obj2=new Demo();
		
		obj1.setName("first");
		obj2.setName("second");
		
		obj1.start();
		obj2.start();
	}
}