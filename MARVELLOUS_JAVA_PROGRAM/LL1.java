import java.util.*;

class LL1
{
	public static void main(String str[])
	{
		ArrayList<Integer>obj=new ArrayList<Integer>();
		
		obj.add(10);
		obj.add(20);
		obj.add(30);
		
		System.out.println("Data from linked list");
		System.out.println(obj);
		obj.add(10);
		
		Iterator <Integer> iobj=obj.iterator();
		System.out.println("data from list using iterator is");
		while(iobj.hasNext())
		{
			System.out.println(iobj.next());
		}
		
		obj=null;
	}
}