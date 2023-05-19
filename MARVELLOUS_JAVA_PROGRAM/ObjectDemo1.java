class Demo implements Cloneable
{
	public String Name;
	public String Batch;
	
	public Demo(String x,String y)
	{
		this.Name=x;
		this.Batch=y;
	}
	
	public String toString()
	{
		return this.Name+" "+this.Batch;
	}
	/*
	protected void finalize()
	{
		System.out.println("Inside Finalize method");	
	}
	*/
	
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}

class ObjectDemo1
{
	public static void main(String Arg[]) throws Exception
	{
		String s1="Hello";
		String s2="Hello";
		
		if(s1.equals(s2))											//equals()
		{
			System.out.println("Strings Are Equals");
		}
		
		Demo obj1=new Demo("Rahul","PPA");
		Demo obj2=new Demo("Amit","Python");
		
		System.out.println("Hashcode of obj1 is:"+obj1.hashCode());  //hashCode()
		System.out.println("Hashcode of obj2 is:"+obj2.hashCode());
		System.out.println(obj1.toString());						//toString()
		
		Class cobj=obj1.getClass();									//getClass()
		System.out.println("Name of class is:"+cobj.getName());
		
		Demo objX=(Demo)obj1.clone();								//clone()
		System.out.println(objX.toString());					
		
		obj1=null;
		obj2=null;
		System.gc();
	
}
}