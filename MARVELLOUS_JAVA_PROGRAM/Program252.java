import java.util.*;

abstract class ArrayX
{
	public int Arr[];

	public ArrayX(int size)
	{
		Arr = new int[size];
	}

	public void Accept()
	{			
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter the elements");
		for(int i = 0; i < Arr.length;i++)
		{
			Arr[i] = sobj.nextInt();
		}
	}

	public void Display()
	{
		System.out.println("Entered data is : ");
		for(int i = 0; i < Arr.length; i++)
		{
			System.out.println(Arr[i]);
		}
	}
}
	
class Program252 extends ArrayX
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("enter the size of Array");
		int size=sobj.nextInt();

		 Program252 p= new Program252();
		 p.ArrayX(4);
		 p.Accept();
	}
}