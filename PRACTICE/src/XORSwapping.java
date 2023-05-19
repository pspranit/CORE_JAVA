public class XORSwapping
{
    public static void main(String[] args)
    {
        int a=25;
        int b=100;

//        a=a+b;
//        b=a-b;
//        a=a-b;

        a=a^b;
        b=a^b;
        a=a^b;

        System.out.println(a);
        System.out.println(b);
    }
}
