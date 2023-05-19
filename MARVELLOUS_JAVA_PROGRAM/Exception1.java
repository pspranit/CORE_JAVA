import java.util.Scanner;
class Exception1
{
	public static void main(String Arg[])
	{
		int arr[]=new int[5];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		
		Scanner sobj=new Scanner(System.in);
		int index=0;
		
		System.out.println("Enter the index of array");
		index=sobj.nextInt();
		
		try
		{
		System.out.println("Data is:"+arr[index]);
		}
		catch(ArrayIndexOutOfBoundsException obj)
		{
		System.out.println("Exception occur:"+obj);
		}
		finally
		{
		System.out.println("Application gets terminated");
		}
			System.out.println("end of main");	
	}
}
