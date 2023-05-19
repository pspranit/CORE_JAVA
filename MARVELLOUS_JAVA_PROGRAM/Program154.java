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

class Marvellous extends StringX
{
	public String ReverseX()
	{
		char Arr[]=str.tocharArray();
		int iStart=0,iEnd=Arr.length-1;
		char temp;
		while(iStart<iEnd)
		{
			temp=Arr[iStart];
			Arr[iStart]=Arr[iEnd];
			Arr[iEnd]=temp;
			iStrat++;
			iEnd--;
		}
		return String.valueof(Arr);
	}
}

class Program154
{
	public static void main(String Arg[])
	{
		Marvellous mobj=new Marvellous();
		mobj.Accept();
		mobj.Display();
		
		String s=mobj.ReverseX();
		System.out.println("Reverse String is :"+s);
		
	}
}