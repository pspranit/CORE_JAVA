package casting.classTypeCasting;

import java.util.Scanner;

class Machine
{
    void getType()
    {
        System.out.println("DISPLAY TYPE");
    }

    void calculateBill(int qty,double price)
    {
        double total=qty*price;
        System.out.println("TOTAL AMT :"+total);
    }
}

class Laptop extends Machine
{
   void getType()
   {
       System.out.println("MACHINE TYPE IS LAPTOP");
    }

    void calculateBill(int qty,double price)
    {
        double total=qty*price;
        double gst=total+total*0.15;
        System.out.println("TOATL AMT :"+total);
        System.out.println("GST 15% :"+gst);
    }
}

class Projector extends Machine
{
    void getType()
    {
        System.out.println("MACHINE TYPE IS PROJECTOR");
    }

    void calculateBill(int qty,double price)
    {
        double total=qty*price;
        double totalAmt=total+total*0.1;
        System.out.println("TOTAL AMT :"+total);
        System.out.println("GST 10% :"+totalAmt);
    }
}

public class MainApp3 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER QTY");
        int qty=sc.nextInt();
        System.out.println("ENETR PRICE");
        double price=sc.nextInt();

        System.out.println("SELECT MACHINE TYPE\n1.Laptop\n2.Projector");
        int choice=sc.nextInt();

        Machine m1=null;

        if(choice==1)
        {
            m1=new Laptop();        //Upcasting
        }
        else if (choice==2)
        {
            m1=new Projector();     //Upcasting
        }
        else {
            System.out.println("INVALID CHOICE");
        }
        m1.getType();
        m1.calculateBill(qty,price);
    }
}
