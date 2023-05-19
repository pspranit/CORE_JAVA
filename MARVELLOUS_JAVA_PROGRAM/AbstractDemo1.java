abstract class Demo
{
	public int i=10,j=20;
	public Demo()
	{
		System.out.println("Inside constructor of Demo");
	}
	public void fun()
	{
		System.out.println("inside fun1 of Demo");
	}
	public void gun()
	{
		System.out.println("Inside gun of Demo");
	}
	public abstract void sun();
	}
	
class Hello extends Demo
{
	public int x,y;
	public Hello()	
	{
		System.out.println("Inside constructor of Hello");
		x=10;
		y=20;
	}
	public void fun()
	{
		System.out.println("Inside fun2 of Hello");
	}
	public void sun()
	{
		System.out.println("Inside sun of Hello");
		this.i=x;
		this.j=y;
	}
}
		
class AbstractDemo1
{
	public static void main(String arg[])
	{
		//Demo obj=new Demo();  ERROR
		
		//Demo obj=new Hello();  //ALLOWED
		Demo obj;  //ALLOWED
		obj=new Hello();   //upcasting
		obj.fun();
		obj.gun();
		obj.sun();
		System.out.println(obj.i); //10
		System.out.println(obj.j);//20
		
	}
}