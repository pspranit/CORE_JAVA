
	interface Base
	{
		void fun();
	}
	
	interface Derived extends Base //4
	{
		void gun();
	}
	
	
	class Marvellous implements Derived  
	{
		public void fun()
		{
			System.out.println("Inside Fun");
		}
		public void gun()
		{
			System.out.println("Inside Gun");
		}
}
class Demo6
{
	public static void main(String arg[])
	{
		Marvellous mobj=new Marvellous();
		mobj.fun();
		mobj.gun();
	}
		
}
	
	