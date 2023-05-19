import java.util.*;
import java.lang.*;


class StringX
{
	public String str;
	
	public void Accept()
	{
		Scanner sobj =new Scanner(System.in);
		System.out.println("Enter String");
		str=sobj.nextLine();
	}
	public void Display()
	{
		System.out.println("String is :"+str);
	}
}

class Marvellous extends StringX
{
	public int CountVowels()
	{
		char Arr[]=str.toCharArray();
		int iCnt=0,i=0;
		try{
		for(i=0;i<Arr.length;i++);
		{
		
			if((Arr[i]=='a')||(Arr[i]=='e')||(Arr[i]=='i')||(Arr[i]=='0')||(Arr[i]=='u'))
			{
				iCnt++;
			}

		}}

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
		return iCnt;
	}
		}
			
	


class Program151
{
	public static void main(String Arg[]) 
	{
		Marvellous mobj=new Marvellous();
		int iRet=0;
		mobj.Accept();
		mobj.Display();
		 
		iRet=mobj.CountVowels();
		System.out.println("Numbers of vowels are:"+iRet);
	}
}