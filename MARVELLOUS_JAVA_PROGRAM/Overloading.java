import java.lang.*;

class Demo
{
	public int Add(int no1,int no2)
	{
		System.out.println("Inside first Add");
		return no1+no2;
	}
		public float Add(float no1,float no2)
		{
			System.out.println("Inside second Add");
			return no1+no2;
		}
}	


class Overloading

{
	public static void main(String Arg[])
	{
		System.out.println("Inside main");
		Demo obj;   //Demo obj=new Demo()
		obj=new Demo();
		
		System.out.println("Addition of 2 Integer:"+obj.Add(10,11));
		System.out.println("Addition of 2 Float:"+obj.Add(10.5f,11.3f));
	}
}