import java.util.Scanner;
public class SearchArray
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sobj.nextInt();

        Searching obj = new Searching(size);

        obj.Accept();
        obj.Display();

        System.out.println("Enter the element to saearch");
        int no = sobj.nextInt();

        boolean bret = obj.search(no);
        if(bret == true)
        {
            System.out.println("Element is there in the array");
        }
        else
        {
            System.out.println("There is no element in the array");
        }

    }
}