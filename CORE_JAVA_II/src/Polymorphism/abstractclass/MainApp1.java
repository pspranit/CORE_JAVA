package Polymorphism.abstractclass;

 abstract class Demo
{
    //Static & Non-Static variables
    static int k=20;
    double d=20.25;

    //Non-Static abstract & Concrete method
    abstract void test();
    void display()
    {
        System.out.println("DISPLAY METHOD");
    }

    //Static Concrete Method
    static void info()
    {
        System.out.println("INFO METHOD");
    }

    //Constructor
    Demo()
    {
        System.out.println("CONSTRUCTOR");
    }

    //Static & Non-Static Block
    static
    {
        System.out.println("STATIC BLOCK");
    }
    {
        System.out.println("NON-STATIC BLOCK");
    }
}

public class MainApp1 {
    public static void main(String[] args) {

        System.out.println("K value :"+Demo.k);
        Demo.info();
    }
}
