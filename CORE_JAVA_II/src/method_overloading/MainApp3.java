package method_overloading;

class Demo
{
    static void test(String str)
    {
        System.out.println(str);
    }

    int test()
    {
        return 123;
    }
}
public class MainApp3 {
    public static void main(String[] args) {

        // Demo d=new Demo();
        Demo.test("pranit");
        int result = new Demo().test();
        System.out.println(result);

    }
}
