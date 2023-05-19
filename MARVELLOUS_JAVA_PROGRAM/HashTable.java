import java.util.*;


class HashTable
{
	public static void main(String str[])
	{
			    //  key	  value
		Hashtable<String,Integer> hobj=new Hashtable<String,Integer>();
		
		hobj.put("PPA",10000);
		hobj.put("LB",20000);
		hobj.put("PML",30000);
		hobj.put("LSPUI",40000);
		hobj.put("Angular",50000);
		hobj.put("C#",60000);
		
		System.out.println(hobj.get("LB"));
		System.out.println("Size of HashTable:"+hobj.size());
		
				System.out.println("Size of HashTable:"+hobj);

		System.out.println("Data from HashTable");
		hobj.remove("C#");
		
		Enumeration eobj=hobj.keys();
		
		while(eobj.hasMoreElements())
		{
			System.out.println(eobj.nextElement());
		}
		//hobj.clear();
		//hobj=null;
						System.out.println("Size of HashTable:"+hobj);

	}
}