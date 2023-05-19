package IS_A_inheritance;
class Parent    //SUPER CLASS
{
    void pdisplay1()
    {
        System.out.println("PARENT CLASS");
    }
}

class Child extends Parent  //CHILD CLASS
{
    void cdisplay()
    {
        System.out.println("CHILD METHOD");
    }
}
public class SingleInheritance {

    public static void main(String[] args) {

        Child c=new Child();
        c.cdisplay();
        c.pdisplay1();

    }
}
