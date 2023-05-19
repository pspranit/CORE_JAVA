package casting.dataTypeUpcasting;

class Demo
{
    void test(){
        System.out.println("TEST METHOD");
    }
}

class Sample extends Demo{
    void info()
    {
        System.out.println("INFO  METHOD");
    }
}
public class MainApp1 {
    public static void main(String[] args) {

        Sample s1=new Sample();
        s1.test();
        s1.info();

        Demo d1=new Sample();   //UPCASTING
        d1.test();
        //d1.info();    ERROR

    }
}
