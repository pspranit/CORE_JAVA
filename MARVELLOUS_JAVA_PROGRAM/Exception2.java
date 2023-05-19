import java.util.Scanner;

class Exception2
{
	public static void main(String Arg[])
	{
		/*int arr[]=new int[5];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;*/
		
		Scanner sobj=new Scanner(System.in);
		int no1=0,no2=0;
		float result=0.0f;
		
		System.out.println("Enter the first number");
		no1=sobj.nextInt();
		
		System.out.println("Enter the second number");
		no2=sobj.nextInt();
		
		try
		{
		result=no1/no2;
		System.out.println("Division is:"+result);
		}
		catch(ArithmeticException obj)
		{
			System.out.println("Arithmatic Exception occured");
		}
		catch(ArrayIndexOutOfBoundsException obj)
		{	
			System.out.println("Array index Exception occured");	
		}
		catch(Exception obj)	//Generic catch block
		{
			System.out.println("Exception occured");
		}
		finally
		{
		System.out.println("inside finally");			
		}
}
}