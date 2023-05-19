import java.util.*;

class Program251
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("enter the size of Array");
		int size=sobj.nextInt();
		
		int Arr[]=new int[size];
		
		System.out.println("Enter the element");
		for(int i=0;i<Arr.length;i++)
		{
			Arr[i]=sobj.nextInt();
		}
		System.out.println("entered Data is");
		for(int i=0;i<Arr.length;i++)
		{
			System.out.println(Arr[i]);
		}
	}
}