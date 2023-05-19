package casting.classTypeCasting;

import java.util.Scanner;

class Goibibo
{
    String []routes={"PUNE-DELHI","MUMBAI-CHENNAI","KOLKATA-BANGLORE"};

    void bookTickets(int qty,int routerChoice)
    {
        System.out.println("BOOKING TICKET");
    }
}

class AirIndia extends Goibibo {

    double[] cost = {7000.00, 9000.00, 11000.00};

    void bookTickets(int qty, int routerChoice) {
        boolean found = false;
        for (int a = 0; a < routes.length; a++) {
            if (routerChoice == a) {
                double total = qty * cost[a];
                System.out.println("TOTAL AMT :" + total);
                found = true;
            }
        }
        if (!found) {
            System.out.println("INVALID ROUTE");
        }
    }
}
class Indigo extends Goibibo
{
    double cost[]={3000.00,5000.00,8000.00};

    void bookTickets(int qty,int routerChoice)
    {
        boolean found=false;

        for (int i = 0; i < routes.length; i++) {
            if(routerChoice==i)
            {
                double total=qty*cost[i];
                System.out.println("TOTAL AMT :"+total);
                found =true;
            }
        }

        if(!found)
        {
            System.out.println("INVALID CHOICE");
        }
    }
}
public class MainApp4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("SELECT SERVICE PROVIDER");
        System.out.println("1.AirIndia\n2.Indigo");
        int choice=sc.nextInt();

        System.out.println("SELECT ROUTE");
        System.out.println("0)PUNE TO DELHI\n1)MUMBAI TO CHENNAI\n3)KOLKATA TO BANGLORE");
        int routeChoice=sc.nextInt();
        System.out.println("ENTER NO.OF TICKETS");
        int tickets=sc.nextInt();

        Goibibo g1=null;
        if(choice==1)
        {
            g1=new AirIndia();      //Upcasting
        }
        else if (choice==2)
        {
           g1=new Indigo();         //Upcasting
        }
        else
        {
            System.out.println("INVALID CHOICE");
        }
        g1.bookTickets(tickets,routeChoice);
    }
}
