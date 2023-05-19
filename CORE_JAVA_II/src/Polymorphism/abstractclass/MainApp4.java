package Polymorphism.abstractclass;

import java.util.Scanner;

abstract class Employee
{
    abstract void designation();
    abstract void salary();
}

class Manager extends Employee
{
    void designation()
    {
        System.out.println("Manager");
    }
    void salary()
    {
        System.out.println("salary is: 150000");
    }
}

class Watchman extends Employee
{
    void designation()
    {
        System.out.println("watchman");
    }
    void salary()
    {
        System.out.println("salary is : 50000");
    }
}

public class MainApp4 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("SELECT JOB");
        System.out.println("1)MANAGER\n3)WATCHMAN");
        System.out.println("ENTER CHOICE");
        int choice=sc.nextInt();

        Employee e=null;
        if(choice==1)
        {
            e=new Manager();    //upcasting

        }
        else if (choice==2) {
            e = new Watchman();   //upcasting
        }
        else{
            System.out.println("INVALID CHOICE");
        }
        if(e!=null) {
            e.designation();
            e.salary();
        }
    }
}
