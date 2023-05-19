import java.lang.*;

class Arithmatic
{
	public int no1;
	public int no2;
	
	public Arithematic()
	{
		this.no1=0;
		this.no2=0;
	}
	Arithematic(int x,int y)
	{
		this.no1=x;
		this.no2=y;
	}
	public int Addition()
	{
		int ans=0;
		ans=this.no1+this.no2;
		return ans;
}
public int Substraction()
	{
		int ans=0;
		ans=this.no1-this.no2;
		return ans;
}
}

class Marvellous
{
	public static void main(String arg[])
	{
		
		System.out.println("inside main");
		Arithematic obj1;
		obj1=new Arithematic();
		Arithematic obj2=new Arithematic(21,11);
		int ret=0;
		ret=obj2.Addition();
		System.out.println("inside main");

	}
}