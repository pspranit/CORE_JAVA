import java.util.*;

abstract class ArrayX
{
    public int Arr[];

    public ArrayX(int size)
    {
        Arr = new int[size];
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the elements");
        for(int i = 0; i < Arr.length;i++)
        {
            Arr[i] = sobj.nextInt();
        }
    }

    public void Display()
    {
        System.out.println("Entered data is : ");
        for(int i = 0; i < Arr.length; i++)
        {
            System.out.println(Arr[i]);
        }
    }

    public abstract boolean search(int no);
}

class Searching extends ArrayX
{
    public Searching(int size)
    {
        super(size);
    }

    public boolean search(int no)
    {
        int i = 0;
        for(i = 0; i <Arr.length; i++)
        {
            if(Arr[i] == no)
            {
                break;
            }
        }

        if(i == Arr.length)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}

class SearchElement{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ENTER SIZE OF AN ARRAY");
        int size=scanner.nextInt();
        Searching searching=new Searching(size);

        searching.Accept();
        searching.Display();

        System.out.println("ENTER SEARCH ELEMENT");
        int no= scanner.nextInt();
        boolean b=searching.search(no);

        if (b)

            System.out.println("ELEMENT PRESENT");

        else
            System.out.println("ELEMENT NOT PRESENT");
    }
}
