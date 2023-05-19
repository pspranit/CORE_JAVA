package modifire1;

public class Master {
    private int a=20;

    int b=40;

    protected int c=60;

    public int d=80;
    void displayPrivate()
    {
        System.out.println("A VALUE IS :"+a);
    }
}

class MainApp1
{
    public static void main(String[] args) {

        Master m1=new Master();
       // System.out.println("A VALUE IS :"+m1.a);  ERROR (PRIVATE)
        m1.displayPrivate();    //PRIVATE MEMBER ACCESS
        System.out.println("B VALUE IS :"+m1.b);    //DEFAULT
        System.out.println("C VALUE IS :"+m1.c);    //PROTECTED
        System.out.println("D VLAUE IS :"+m1.d);    //PUBLIC

    }
}
