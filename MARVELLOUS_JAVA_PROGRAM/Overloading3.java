import java.lang.*;

class Demo3
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
		public int Add(int no1,int no2,int no3)
		{
			System.out.println("Inside third Add");
			return no1+no2+no3;
		}
}	


class Overloading3

{
	public static void main(String Arg[])
	{
		System.out.println("Inside main");
		Demo3 obj=new Demo3();
		int iRet=0;
		float fRet=0.0f;
		
		iRet=obj.Add(10,11);
		System.out.println("Addition of 2 Integer:"+iRet);
		
		fRet=obj.Add(10.5f,11.3f);
		System.out.println("Addition of 2 Float:"+fRet);
		
		iRet=obj.Add(8,8,8);
		System.out.println("Addition of 3 Integer:"+iRet);
	}
}