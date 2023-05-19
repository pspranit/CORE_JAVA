
class Base
{
	public void fun()
	{
	System.out.println("base of fun");
	}
	public final void gun()    //method we can not override
	{
	System.out.println("base of gun");
	}
}
class Derived extends Base
{
public void fun()  //override
	{
	System.out.println("Derived of fun");
	}
	/*public void gun()
	{
	System.out.println("Derived of gun");
	}*/
}
class Finalmethod
{
	public static void main(String arg[])
	{
	Base bobj=new Derived();  //upcasting
	bobj.fun();
	bobj.gun();
	}
}