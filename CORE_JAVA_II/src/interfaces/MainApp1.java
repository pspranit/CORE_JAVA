package interfaces;

interface Demo
{
    //public static final
    int k=20;

    //non-static abstract method
    void test();

    //static concrete method
    static void display()
    {
        System.out.println("DISPLAY METHOD");
    }
}

public class MainApp1 {
    public static void main(String[] args) {

        System.out.println("K Value :"+Demo.k);
        Demo.display();
    }
}
