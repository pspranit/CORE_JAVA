import java.util.*;

class Students
{
	public String name;
	public int RID;
	public int Age;
	
	public Students(String a,int b,int c)
	{
		this.name=a;
		this.RID=b;
		this.Age=c;
	}
	
	public void Display()
	{
		System.out.println("Student Name :"+this.name +"RID:"+this.RID +"Age:" +this.Age);
	}
}
class LLStudents
{
	public static void main(String str[])
	{
		LinkedList<Students> lobj=new LinkedList<Students>();
		
		Students sobj=new Students("Pranit",111,30);
		lobj.add(sobj);
		
		lobj.add(new Students("amit",121,21));
		lobj.add(new Students("Sagar",221,25));
		lobj.add(new Students("amit",251,26));
		
		Students ref=null;
		Iterator <Students> iobj=lobj.iterator();
		
		while(iobj.hasNext())
		{
			ref=iobj.next();
			ref.Display();
		}
		
		lobj=null;
		iobj=null;
		ref=null;
	}
}