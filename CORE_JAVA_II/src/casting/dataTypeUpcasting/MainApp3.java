package casting.dataTypeUpcasting;

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
    void grtType()
    {
        System.out.println("MACHINE TYPE IS LAPTOP");
    }
    void calculateBill(int qty,double price)
    {
        double total=qty*price;
        double finalAmt=total+total*0.15;
        System.out.println("10% GST :"+finalAmt);
    }
}

class Projector extends Machine
{
    void grtType()
    {
        System.out.println("MACHINE TYPE IS LAPTOP");
    }
    void calculateBill(int qty,double price)
    {
        double total=qty*price;
        double finalAmt=total+total*0.1;
        System.out.println("10% GST :"+finalAmt);
    }
}

public class MainApp3 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER QTY");
        int qty=sc.nextInt();
        System.out.println("ENTER PRICE");
        double price=sc.nextDouble();

        System.out.println("SELECT MACHINE");
        System.out.println("1.LAPTOP\n2.PROJECTOR");

        int choice=sc.nextInt();
        Machine m1=null;
        if(choice==1)
        {
            m1=new Laptop();    //UPCASTING
        }
        else if (choice==2)
        {
            m1=new Projector(); //UPCASTING
        }
        else {
            System.out.println("INVALID CHOICE");
        }
            m1.getType();
        m1.calculateBill(qty,price);
    }
}
