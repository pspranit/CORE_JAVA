// Java code to illustrate the size() method
import java.util.*;

public class Hash_Table_Demo {
	public static void main(String[] args)
	{

		// Creating an empty Hashtable
		Hashtable<Integer, String> hash_table =
		new Hashtable<Integer, String>();

		// Inserting elements into the table
		 hash_table.put(10, "Geeks");
        hash_table.put(15, "4");
        hash_table.put(20, "Geeks");
        hash_table.put(25, "Welcomes");
        hash_table.put(30, "You");
		
		// Displaying the Hashtable
		System.out.println("Initial Table is: " + hash_table);

		// Displaying the size of the table
		System.out.println("The size of the table is " +
		hash_table.size());
	}
}
