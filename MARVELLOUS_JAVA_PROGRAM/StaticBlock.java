
class Demo
{
	public int i,j;
	public static int x,y;
	
	static
	{
		System.out.println("Inside static block");
		x=10;
		y=20;	
	}
	public Demo()
	{
		System.out.println("Inside constructor");
		i=10;
		j=20;	  
	}
}
	


class StaticBlock
{
	public static void main(String arg[])
	{
		System.out.println("Inside main");
		//System.out.println(Demo.x);
		
		Demo obj1=new Demo();
		Demo obj2=new Demo();
		
	}
}