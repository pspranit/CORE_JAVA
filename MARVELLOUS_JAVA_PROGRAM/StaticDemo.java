class Demo
	{
		public int i=10;
		public static int j=20;
		
		public void fun()
		{
			System.out.println("Inside non-static fun");
			
			System.out.println(i);
			System.out.println(j);		
		}
		public static void gun()
		{
			System.out.println("Inside non-static gun");
			
			//System.out.println(i);
			System.out.println(j);	
		}
	}

class StaticDemo
{
	public static void main(String arg[])
	{
		System.out.println("Value of static j:"+Demo.j);
		Demo.gun();    //Demo::gun(); 
		
		Demo obj=new Demo();
		obj.fun();
		obj.gun();
		
		System.out.println("Value of Non static i:"+obj.i);
		System.out.println("Value of static j:"+Demo.j);
	}
}
	