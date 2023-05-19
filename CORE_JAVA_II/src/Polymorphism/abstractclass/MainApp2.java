package Polymorphism.abstractclass;

abstract class Master
{
    void test(){
        System.out.println("TEST METHOD");
    }
    abstract void display();
}

class Central extends Master
{
    void display()
    {
        System.out.println("DISPLAY METHOD");
    }
}

public class MainApp2 {
    public static void main(String[] args) {

        Central c1=new Central();
        c1.test();
        c1.display();
    }
}
