import java.util.*;

class StringX
{
	public String str;
	
	public void Accept()
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter String");
		str=sobj.nextLine();
	}
	public void Display()
	{
		System.out.println("String is :"+str);
	}
}

class Pranit extends StringX
{
	public boolean CheckPallindrome()
	{
		char Arr[]=str.toCharArray();
		int iStart=0,iEnd=Arr.length-1;
		char temp;
		while(iStart<iEnd)
		{
			temp=Arr[iStart];
			Arr[iStart]=Arr[iEnd];
			Arr[iEnd]=temp;
			iStart++;
			iEnd--;
		}
		String newstr=new String(Arr);
		Boolean bRet=newstr.equals(str);
		return bRet;
	}		
}

class Program154
{
	public static void main(String Arg[])
	{
		Pranit pobj=new Pranit();
		pobj.Accept();
		pobj.Display();
		boolean bRet=false;
		bRet=pobj.CheckPallindrome();
		if(bRet==true)
		{
			System.out.println("String is pallindrome");
		}
		else 
		{
			System.out.println("String is not pallindrome");
		}
		
	}
}