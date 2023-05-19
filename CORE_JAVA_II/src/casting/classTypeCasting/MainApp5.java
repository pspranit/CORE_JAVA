package casting.classTypeCasting;

class Master
{
    void test()
    {
        System.out.println("TEST METHOD");
    }
}

class Central extends Master
{
    void display()
    {
        System.out.println("DISPLAY METHOD");
    }
}

public class MainApp5 {
    public static void main(String[] args) {

        Master m1=new Central();
        m1.test();

        Central c1=(Central) new Master();      //Upcasting
        c1.test();
        c1.display();   //java.lang.classCastException

        //Handle java.lang.classCastException
        Master m2=new Master();
        if(m2 instanceof Central)
        {
            Central c2=(Central) m2;
        }
        else {
            System.out.println("PROPERTIES NOT FOUND");
        }
    }
}
